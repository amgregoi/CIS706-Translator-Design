package sjc.codegen.extended;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.*;
import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnlyElements;
import sjc.codegen.ByteCodeGenerator;
import sjc.symboltable.extended.ExtendedSymbolTable;
import sjc.type.ArrayType;
import sjc.type.BooleanType;
import sjc.type.IntType;
import sjc.type.Type;
import sjc.type.checker.extended.ExtendedTypeTable;
import sjc.util.Pair;

/**
 * This class is used to translate an ExtendedStaticJava {@link CompilationUnit}
 * to {@link ExtendedClassByteCodes} that represent a Java 1.5 class files.
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedByteCodeGenerator extends ByteCodeGenerator {
	/**
	 * The visitor for {@link ASTNode} to generate bytecodes.
	 * 
	 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
	 */
	protected static class Visitor extends ByteCodeGenerator.Visitor {
		public @NonNullElements Map<String, byte[]> otherClasses = new HashMap<String, byte[]>();

		protected @NonNullElements @ReadOnlyElements Map<String, TypeDeclaration> classMap;

		protected @NonNullElements @ReadOnlyElements Map<Pair<String, String>, FieldDeclaration> fieldMap;

		protected Visitor(@NonNull final ExtendedSymbolTable st,
				@NonNull final ExtendedTypeTable tt) {
			super(st, tt);
			this.classMap = st.classMap;
			this.fieldMap = st.fieldMap;
		}

		@Override
		protected void dispose() {
			super.dispose();
			this.classMap = null;
			this.fieldMap = null;
		}

		/**
		 * Determines whether a {@link List} of {@link Modifier}s has a public
		 * modifier (a {@link Modifier}'s whose {@link ModifierKeyword} is
		 * {@link ModifierKeyword.PUBLIC_KEYWORD}).
		 * 
		 * @param modifiers
		 * @return True, if the {@link List} contains a public modifier.
		 */
		protected boolean hasPublicModifier(
				@SuppressWarnings("rawtypes") final List modifiers) {
			for (final Object o : modifiers) {
				if ((o instanceof Modifier)
						&& (((Modifier) o).getKeyword() == ModifierKeyword.PUBLIC_KEYWORD)) {
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean visit(final FieldDeclaration node) {
			final int modifiers = convertModifiers(node, node.modifiers());
			final VariableDeclarationFragment vdf = (VariableDeclarationFragment) node
					.fragments().get(0);
			this.cw.visitField(modifiers, vdf.getName().getIdentifier(),
					convertType(this.typeMap.get(node)), null, null).visitEnd();

			return false;
		}

		// TODO - START
		// TODO - ArrayAccess
		/*
		 * x = b[i];			-> normal
		 * x = b[returnInt()];	-> methodInvocation
		 */
		@Override
		public boolean visit(final ArrayAccess node) {
			Type t = this.typeMap.get(node);
			Expression exp = node.getArray();

			// i.e. i_array[returnInt()] = i_array[returnIntArray()[2]];
			if (node.getArray() instanceof MethodInvocation) {
				node.getArray().accept(this);
			} else {
				this.mv.visitVarInsn(Opcodes.ALOAD,
						this.localIndexMap.get(exp.toString()).intValue());
			}
			node.getIndex().accept(this);
			if (t instanceof IntType) {
				this.mv.visitInsn(Opcodes.IALOAD);
			} else if (t instanceof BooleanType) {
				this.mv.visitInsn(Opcodes.BALOAD);
			} else {
				this.mv.visitInsn(Opcodes.AALOAD);
			}
			return false;
		}

		// TODO - Assignment
		/*
		 * b[i] = x;  	-> array access
		 * b.i = x;		-> field access
		 * b = x;		-> regular assignment
		 */
		@Override
		public boolean visit(final Assignment node) {
			final ASTNode lhsNode = node.getLeftHandSide();
			// array access
			if (lhsNode instanceof ArrayAccess) {
				final ArrayAccess lhsAA = (ArrayAccess) lhsNode;
				Type t = this.typeMap.get(lhsAA);
				this.mv.visitVarInsn(ALOAD,
						this.localIndexMap.get(lhsAA.getArray().toString())
								.intValue());
				lhsAA.getIndex().accept(this);
				node.getRightHandSide().accept(this);
				if (t instanceof IntType) {
					this.mv.visitInsn(Opcodes.IASTORE);
				} else if (t instanceof BooleanType) {
					this.mv.visitInsn(Opcodes.BASTORE);
				} else {
					this.mv.visitInsn(Opcodes.AASTORE);
				}
			}
			// Field access
			else if (lhsNode instanceof FieldAccess) {
				final FieldAccess lhsFA = (FieldAccess) lhsNode;
				lhsFA.getExpression().accept(this);
				node.getRightHandSide().accept(this);
				final Type t = this.typeMap.get(lhsFA.getExpression());
				this.mv.visitFieldInsn(Opcodes.PUTFIELD, t.name, lhsFA
						.getName().getIdentifier(), convertType(this.typeMap
						.get(lhsFA)));
			}
			// rest
			else {
				// original assignment code, with small addition for non
				// primitive types
				node.getRightHandSide().accept(this);
				final String varName = ((SimpleName) lhsNode).getIdentifier();
				final Object lhsDecl = this.symbolMap.get(lhsNode);
				if (lhsDecl instanceof FieldDeclaration) {
					final FieldDeclaration fd = (FieldDeclaration) lhsDecl;
					final String className = ((TypeDeclaration) fd.getParent())
							.getName().getIdentifier();
					this.mv.visitFieldInsn(Opcodes.PUTSTATIC, className,
							varName, convertType(this.typeMap.get(fd)));
				} else {
					Type t = this.typeMap.get(lhsDecl);
					if (t instanceof BooleanType || t instanceof IntType) {
						this.mv.visitVarInsn(Opcodes.ISTORE, this.localIndexMap
								.get(varName).intValue());
					} else {
						this.mv.visitVarInsn(Opcodes.ASTORE, this.localIndexMap
								.get(varName).intValue());
					}
				}
			}
			return false;
		}

		// TODO - ArrayCreation
		/*
		 * a = new int[3];					-> without initializers
		 * a = new int[] { 1, 2, 3 };		-> with initializers
		 * 
		 */
		@Override
		public boolean visit(final ArrayCreation node) {

			Type t = this.typeMap.get(node);
			ArrayType arr = (ArrayType) t;
			Type base = arr.baseType; // array base type

			// init array size | a = new int[3];
			if (node.dimensions() != null) {
				for (int i = 0; i < node.dimensions().size(); i++) {
					((ASTNode) node.dimensions().get(0)).accept(this);
					if (base instanceof IntType) {
						this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT);
					} else if (base instanceof BooleanType) {
						this.mv.visitIntInsn(Opcodes.NEWARRAY,
								Opcodes.T_BOOLEAN);
					} else {
						this.mv.visitTypeInsn(Opcodes.ANEWARRAY, base.name);
					}
				}
			}

			// a = new int[] { 1, 2, 3 };
			if (node.getInitializer() != null) {
				final int initSize = node.getInitializer().expressions().size();
				generateIntConst(initSize); // array size
				if (base instanceof IntType) {
					this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT);
				} else if (base instanceof BooleanType) {
					this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BOOLEAN);
				} else {
					this.mv.visitTypeInsn(Opcodes.ANEWARRAY, base.toString());
				}
				// stores values of initializations
				for (int i = 0; i < initSize; i++) {
					this.mv.visitInsn(Opcodes.DUP);
					generateIntConst(i); // stack index
					((ASTNode) node.getInitializer().expressions().get(i))
							.accept(this);
					if (base instanceof IntType) {
						this.mv.visitInsn(Opcodes.IASTORE);
					} else if (base instanceof BooleanType) {
						this.mv.visitInsn(Opcodes.BASTORE);
					} else {
						this.mv.visitInsn(Opcodes.AASTORE);
					}
				}
			}
			return false;

		}

		// private method to check for main class
		private boolean hasMainMethod(MethodDeclaration[] methods) {
			for (int i = 0; i < methods.length; i++) {
				if (methods[i].toString().contains("main"))
					return true;
			}
			return false;
		}

		// TODO - TypeDeclaration
		@Override
		public boolean visit(final TypeDeclaration node) {
			// main class
			if (hasMainMethod(node.getMethods()) == true) {
				this.mainClassName = node.getName().getIdentifier();
				this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES
						| ClassWriter.COMPUTE_MAXS);
				this.cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC
						+ Opcodes.ACC_SUPER, this.mainClassName, null,
						"java/lang/Object", null);
				this.cw.visitSource(null, null);
				generateConstructor(this.mainClassName);
				for (final Object o : node.bodyDeclarations()) {
					((ASTNode) o).accept(this);
				}
				this.cw.visitEnd();
				this.mainClassBytes = this.cw.toByteArray();
				this.cw = null;
			}
			// simple class
			else {
				// replaced below this.mainClassName instances with
				// node.getName().getIdentifier()
				// this.mainClassName = node.getName().getIdentifier();
				this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES
						| ClassWriter.COMPUTE_MAXS);
				this.cw.visit(Opcodes.V1_5, 0, node.getName().getIdentifier(),
						null, "java/lang/Object", null);
				this.cw.visitSource(null, null);
				generateConstructor(node.getName().getIdentifier());
				for (final Object o : node.bodyDeclarations()) {
					((ASTNode) o).accept(this);
				}
				this.cw.visitEnd();
				this.otherClasses.put(node.getName().getIdentifier(),
						this.cw.toByteArray());
				this.cw = null;
			}

			return false;
		}

		// TODO - ClassInstanceCreation
		/*
		 * AC a = new AC();
		 * NEW AC DUP INVOKESPECIAL AC<init>()V
		 */
		@Override
		public boolean visit(final ClassInstanceCreation node) {
			Type t = this.typeMap.get(node);
			this.mv.visitTypeInsn(Opcodes.NEW, t.name);
			this.mv.visitInsn(DUP);
			// FIX - need to not pass ()V arbitrarily
			this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, t.name, "<init>",
					"()V", false);

			return false;
		}

		// TODO - NullLiteral
		/*
		 * a = null;
		 */
		@Override
		public boolean visit(final NullLiteral node) {
			this.mv.visitInsn(ACONST_NULL);
			return false;
		}

		// TODO - FieldAccess
		/*
		 * x = b.i
		 */
		@Override
		public boolean visit(final FieldAccess node) {
			Type t = this.typeMap.get(node.getExpression());
			node.getExpression().accept(this);
			this.mv.visitFieldInsn(Opcodes.GETFIELD, t.name, node.getName()
					.toString(), convertType(this.typeMap.get(node)));

			return false;
		}

		// TODO - ReturnStatement
		/*
		 * return;
		 * return i; (int)
		 * return b; (boolean)
		 * return a; (oject/nonprimitive)
		 */
		@Override
		public boolean visit(final ReturnStatement node) {
			final Expression exp = node.getExpression();
			// no return statement | i.e. return;
			if (exp == null)
				this.mv.visitInsn(Opcodes.RETURN);
			else {
				Type t = this.typeMap.get(exp);
				exp.accept(this);
				// primitive return
				if (t instanceof IntType || t instanceof BooleanType)
					this.mv.visitInsn(Opcodes.IRETURN);
				// everything else
				else
					this.mv.visitInsn(Opcodes.ARETURN);
			}

			return false;
		}

		// TODO - Infix
		// copied from static byte generator, added operators for ESJ
		/*
		 * x >>> y
		 * x && y
		 * x + y
		 * etc..
		 */
		@Override
		public boolean visit(final InfixExpression node) {
			final InfixExpression.Operator op = node.getOperator();
			node.getLeftOperand().accept(this);
			final Type t = this.typeMap.get(node.getLeftOperand());
			if (op == InfixExpression.Operator.CONDITIONAL_AND) {
				this.mv.visitInsn(Opcodes.DUP);
				final Label falseLabel = new Label();
				this.mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
				this.mv.visitInsn(Opcodes.POP);
				node.getRightOperand().accept(this);
				this.mv.visitLabel(falseLabel);
			} else if (op == InfixExpression.Operator.CONDITIONAL_OR) {
				this.mv.visitInsn(Opcodes.DUP);
				final Label trueLabel = new Label();
				this.mv.visitJumpInsn(Opcodes.IFNE, trueLabel);
				this.mv.visitInsn(Opcodes.POP);
				node.getRightOperand().accept(this);
				this.mv.visitLabel(trueLabel);
			} else {
				node.getRightOperand().accept(this);
				if (op == InfixExpression.Operator.PLUS) {
					this.mv.visitInsn(Opcodes.IADD);
				} else if (op == InfixExpression.Operator.MINUS) {
					this.mv.visitInsn(Opcodes.ISUB);
				} else if (op == InfixExpression.Operator.TIMES) {
					this.mv.visitInsn(Opcodes.IMUL);
				} else if (op == InfixExpression.Operator.DIVIDE) {
					this.mv.visitInsn(Opcodes.IDIV);
				} else if (op == InfixExpression.Operator.REMAINDER) {
					this.mv.visitInsn(Opcodes.IREM);
				} else if (op == InfixExpression.Operator.GREATER) {
					generateRelationalCode(Opcodes.IF_ICMPGT);
				} else if (op == InfixExpression.Operator.GREATER_EQUALS) {
					generateRelationalCode(Opcodes.IF_ICMPGE);
				} else if (op == InfixExpression.Operator.LESS) {
					generateRelationalCode(Opcodes.IF_ICMPLT);
				} else if (op == InfixExpression.Operator.LESS_EQUALS) {
					generateRelationalCode(Opcodes.IF_ICMPLE);
				}
				// added comparison (== & !=) to non primitive types |
				// IF_ACMPEQ/IFACMPNE
				else if (op == InfixExpression.Operator.EQUALS
						&& !(t instanceof IntType || t instanceof BooleanType)) {
					generateRelationalCode(Opcodes.IF_ACMPEQ);
				} else if (op == InfixExpression.Operator.EQUALS) {
					generateRelationalCode(Opcodes.IF_ICMPEQ);
				} else if (op == InfixExpression.Operator.NOT_EQUALS
						&& !(t instanceof IntType || t instanceof BooleanType)) {
					generateRelationalCode(Opcodes.IF_ACMPNE);
				} else if (op == InfixExpression.Operator.NOT_EQUALS) {
					generateRelationalCode(Opcodes.IF_ICMPNE);
				}
				// added SHL, SHL, USHR
				else if (op == InfixExpression.Operator.LEFT_SHIFT) {
					this.mv.visitInsn(Opcodes.ISHL);
				} else if (op == InfixExpression.Operator.RIGHT_SHIFT_SIGNED) {
					this.mv.visitInsn(Opcodes.ISHR);
				} else if (op == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED) {
					this.mv.visitInsn(Opcodes.IUSHR);
				}
			}
			return false;
		}

		// TODO - PostfixExpression
		/*
		 * i++;
		 */
		@Override
		public boolean visit(final PostfixExpression node) {
			final PostfixExpression.Operator op = node.getOperator();
			final Expression exp = node.getOperand();

			if (!(exp instanceof ArrayAccess || exp instanceof FieldAccess)) {
				String varName = node.getOperand().toString();
				if (op == PostfixExpression.Operator.INCREMENT) {
					this.mv.visitIincInsn(this.localIndexMap.get(varName)
							.intValue(), 1);
				} else if (op == PostfixExpression.Operator.DECREMENT) {
					this.mv.visitIincInsn(this.localIndexMap.get(varName)
							.intValue(), -1);
				}
			}

			return false;

		}

		// TODO - PrefixExpression
		/*
		 * -x
		 * !y
		 */
		@Override
		public boolean visit(final PrefixExpression node) {
			node.getOperand().accept(this);
			final PrefixExpression.Operator op = node.getOperator();
			if (op == PrefixExpression.Operator.PLUS) {
				// do nothing
			} else if (op == PrefixExpression.Operator.MINUS) {
				this.mv.visitInsn(Opcodes.INEG);
			} else if (op == PrefixExpression.Operator.NOT) {
				final Label falseLabel = new Label();
				final Label endLabel = new Label();
				this.mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
				this.mv.visitInsn(Opcodes.ICONST_0);
				this.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
				this.mv.visitLabel(falseLabel);
				this.mv.visitInsn(Opcodes.ICONST_1);
				this.mv.visitLabel(endLabel);
			}
			// Added complement
			else if (op == PrefixExpression.Operator.COMPLEMENT) {
				this.mv.visitInsn(Opcodes.ICONST_M1);
				this.mv.visitInsn(Opcodes.IXOR);
			}
			return false;
		}

		// TODO - ForStatement
		@Override
		public boolean visit(final ForStatement node) {
			Label loop = new Label();
			// (for(i=0, j=0 ; ;);
			if (node.initializers().size() > 0) {
				for (int i = 0; i < node.initializers().size(); i++)
					((ASTNode) node.initializers().get(i)).accept(this);
			}
			// for( ; i<5 ; );
			if (node.getExpression() != null && node.getBody() != null) {
				Label end = new Label();
				this.mv.visitJumpInsn(Opcodes.GOTO, end);
				this.mv.visitLabel(loop);

				node.getBody().accept(this);
				// for(;;i++);
				if (node.updaters() != null) {
					for (int i = 0; i < node.updaters().size(); i++)
						((ASTNode) node.updaters().get(i)).accept(this);
				}
				this.mv.visitLabel(end);
				// check exit condition, if not met loops back
				if (node.getExpression() != null) {
					node.getExpression().accept(this);
					this.mv.visitJumpInsn(Opcodes.IFNE, loop);
				}
				// if no exit condition, loops back : i.e. for (i = 0;; i++)
				else {
					this.mv.visitJumpInsn(Opcodes.GOTO, loop);
				}

			} else {
				this.mv.visitLabel(loop);
				node.getBody().accept(this);
				// for(;;i++);
				if (node.updaters() != null) {
					for (int i = 0; i < node.updaters().size(); i++)
						((ASTNode) node.updaters().get(i)).accept(this);
				}
				// check exit condition, if not met loops back
				if (node.getExpression() != null) {
					node.getExpression().accept(this);
					this.mv.visitJumpInsn(Opcodes.IFNE, loop);
				}
				// if no exit condition, loops back : i.e. for (i = 0;; i++)
				else {
					this.mv.visitJumpInsn(Opcodes.GOTO, loop);
				}
			}
			return false;
		}

		// TODO - DoStatement
		/*
		 * do 
		 * { i++; } 					-> body
		 * while (+7 << ~(-5) == j);	-> expression
		 */
		@Override
		public boolean visit(final DoStatement node) {
			Label loop = new Label();
			this.mv.visitLabel(loop);
			if (node.getBody() != null)
				node.getBody().accept(this);
			if (node.getExpression() != null) {
				node.getExpression().accept(this);
				this.mv.visitJumpInsn(Opcodes.IFNE, loop);
			} else
				this.mv.visitJumpInsn(Opcodes.GOTO, loop);

			return false;
		}

		// TODO - END

	}

	/**
	 * Generates a {@link ExtendedClassByteCodes} that represents the class
	 * files for the given ExtendedStaticJava {@link CompilationUnit} with the
	 * given {@link ExtendedSymbolTable} and {@link ExtendedTypeTable}.
	 * 
	 * @param cu
	 *            The StaticJava {@link CompilationUnit}.
	 * @param st
	 *            The {@link ExtendedSymbolTable} of the {@link CompilationUnit}
	 *            .
	 * @param tt
	 *            The {@link ExtendedTypeTable} of the {@link CompilationUnit}.
	 * @return The {@link ExtendedClassByteCodes} that represents the class
	 *         files for the given ExtendedStaticJava {@link CompilationUnit}
	 *         with the given {@link ExtendedSymbolTable} and
	 *         {@link ExtendedTypeTable}.
	 * @throws ByteCodeGenerator.Error
	 *             If the generator encounter unexpected error.
	 */
	public static @NonNull ExtendedClassByteCodes generate(
			@NonNull final CompilationUnit cu,
			@NonNull final ExtendedSymbolTable est,
			@NonNull final ExtendedTypeTable ett)
			throws ByteCodeGenerator.Error {
		assert (cu != null) && (est != null) && (ett != null);

		final Visitor v = new Visitor(est, ett);
		cu.accept(v);
		final ExtendedClassByteCodes result = new ExtendedClassByteCodes(
				v.mainClassName, v.mainClassBytes, v.otherClasses);
		v.dispose();
		return result;
	}

	/**
	 * Declared as protected to disallow creation of this object outside from
	 * the methods of this class.
	 */
	protected ExtendedByteCodeGenerator() {
	}
}
