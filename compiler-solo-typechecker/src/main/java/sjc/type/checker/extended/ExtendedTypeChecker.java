package sjc.type.checker.extended;

// https://github.com/swesonga/cs431/blob/master/src-esjc/sjc/type/checker/extended/ExtendedTypeChecker.java

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnlyElements;
import sjc.symboltable.SymbolTable;
import sjc.symboltable.extended.ExtendedSymbolTable;
import sjc.type.ArrayType;
import sjc.type.ClassType;
import sjc.type.IntType;
import sjc.type.NonPrimitiveType;
import sjc.type.NullType;
import sjc.type.Type;
import sjc.type.TypeFactory;
import sjc.type.checker.TypeChecker;
import sjc.util.Pair;

/**
 * This class is used to type check a ExtendedStaticJava {@link CompilationUnit}
 * with a given {@link SymbolTable}.
 * 
 * @author <a href="mailto:myname@ksu.edu">MyName</a>
 */
public class ExtendedTypeChecker extends TypeChecker {
	/**
	 * The visitor for {@link ASTNode} to type check an ExtendedStaticJava
	 * {@link CompilationUnit}.
	 * 
	 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
	 */
	protected static class Visitor extends TypeChecker.Visitor {
		protected @NonNullElements @ReadOnlyElements Map<String, TypeDeclaration> classMap;

		protected @NonNullElements @ReadOnlyElements Map<Pair<String, String>, FieldDeclaration> fieldMap;

		protected Visitor(final TypeFactory tf, final ExtendedSymbolTable est) {
			super(tf, est);
			this.classMap = est.classMap;
			this.fieldMap = est.fieldMap;
			for (final Pair<String, String> p : est.fieldMap.keySet()) {
				final FieldDeclaration fd = est.fieldMap.get(p);
				final Type t = convertType(fd, fd.getType());
				final String className = p.first;
				final String fieldName = p.second;
				final ClassType ct = tf.getClassType(className);
				ct.fieldTypeMap.put(fieldName, t);
			}
		}

		// TODO: Fill in visit methods here.
///////////////////////////////////	Start of my methods ///////////////////////////////////
		// TODO - ExpressionStatement
		@Override
		public boolean visit(final ExpressionStatement node) {
			final Expression e = node.getExpression();
			e.accept(this);

			if (e instanceof Assignment) {
				assert getResult() == null; 
			} else if (node.getExpression() instanceof PostfixExpression) {
				node.getExpression().accept(this);
				if (getResult() != this.tf.Int)
					throw new Error(node, "Expression not of type int: " + node);
			}else if (node.getExpression() instanceof MethodInvocation) {
				getResult();  //not necessary 
			} else {
				throw new Error(node, "Expression statement error: " + node);
			}
			return false;
		}

		// TODO - ConditionalExpression
		@Override
		public boolean visit(final ConditionalExpression node) {
			if (node.getExpression() != null) {
				node.getExpression().accept(this);
				if (getResult() != this.tf.Boolean) {
					throw new Error(node, "Condition not of type boolean: " + node);
				}
			}
			node.getThenExpression().accept(this);
			final Type thenExp = getResult();
			
			node.getElseExpression().accept(this);
			final Type elseExp = getResult();
			
			if (thenExp != elseExp) {
				if (!((thenExp instanceof ClassType && elseExp == this.tf.Null)
						|| (elseExp instanceof ClassType && thenExp == this.tf.Null)
						|| (thenExp instanceof ArrayType && elseExp == this.tf.Null) 
						|| (elseExp instanceof ArrayType && thenExp == this.tf.Null))) {
					throw new Error(node, "Conditional Then and Else expression type mismatch: " + node);
				}
			}
			// then expression
			if (thenExp == this.tf.Null)
				setResult(node, elseExp);
			// else expression
			else if (elseExp == this.tf.Null)
				setResult(node, thenExp);
			else
				setResult(node, thenExp);
			return false;
		}

		// TODO - FieldAccess
		@Override
		public boolean visit(final FieldAccess node) {
			node.getExpression().accept(this);
			final ClassType exp = (ClassType) getResult();
			final Type id = exp.fieldTypeMap.get(node.getName().toString());
			final Pair<String, String> key = new Pair<String, String>(exp.toString(), node.getName().toString());
			final FieldDeclaration fd = this.fieldMap.get(key);
			
			setResult(node, id);
			this.symbolMap.put(node, fd);
			return false;
		}

		// TODO - NullLiteral
		@Override
		public boolean visit(final NullLiteral node) {
			setResult(node, this.tf.Null);
			return false;
		}

		// TODO - InfixExpression
		// http://introcs.cs.princeton.edu/java/11precedence/
		// needed to change grammar to fix precedence 
		@Override
		public boolean visit(final InfixExpression node) {
			node.getLeftOperand().accept(this);
			final Type lhsType = getResult();
			node.getRightOperand().accept(this);
			final Type rhsType = getResult();
			System.out.println(node);
			final InfixExpression.Operator op = node.getOperator();
			//binary	
			if ((op == InfixExpression.Operator.TIMES)						//math
					|| (op == InfixExpression.Operator.DIVIDE)
					|| (op == InfixExpression.Operator.REMAINDER)
					|| (op == InfixExpression.Operator.PLUS)
					|| (op == InfixExpression.Operator.MINUS)) {
				if (lhsType != this.tf.Int) {
					throw new Error(node, "LHS not of type int: " + node.getLeftOperand());
				}
				if (rhsType != this.tf.Int) {
					throw new Error(node, "RHS not of type int: " + node.getRightOperand());
				}
				setResult(node, this.tf.Int);
			} else if ((op == InfixExpression.Operator.LESS)				//relational
					|| (op == InfixExpression.Operator.LESS_EQUALS)
					|| (op == InfixExpression.Operator.GREATER)
					|| (op == InfixExpression.Operator.GREATER_EQUALS)) {
				if (lhsType != this.tf.Int) {
					throw new Error(node, "LHS not of type int: " + node.getLeftOperand());
				}
				if (rhsType != this.tf.Int) {
					throw new Error(node, "RHS not of type int: " + node.getRightOperand());
				}
				setResult(node, this.tf.Boolean);
			} else if ((op == InfixExpression.Operator.CONDITIONAL_AND)		//conditional
					|| (op == InfixExpression.Operator.CONDITIONAL_OR)) {
				if (lhsType != this.tf.Boolean) {
					throw new Error(node, "LHS not of type boolean: " + node.getLeftOperand());
				}
				if (rhsType != this.tf.Boolean) {
					throw new Error(node, "RHS not of type boolean: " + node.getRightOperand());
				}
				setResult(node, this.tf.Boolean);
			} else if ((op == InfixExpression.Operator.EQUALS)				//Equivalence 
					|| (op == InfixExpression.Operator.NOT_EQUALS)) {
				if (lhsType != rhsType
						&& !(((lhsType instanceof ClassType) && rhsType == this.tf.Null)
								|| ((rhsType instanceof ClassType) && lhsType == this.tf.Null)
								|| ((lhsType instanceof ArrayType) && rhsType == this.tf.Null) 
								|| ((rhsType instanceof ArrayType) && lhsType == this.tf.Null))){
					throw new Error(node, "Type mismatch between LHS and RHS1: " + node);
				}
				setResult(node, this.tf.Boolean);
			} else if ((op == InfixExpression.Operator.LEFT_SHIFT)				//shifts
					|| (op == InfixExpression.Operator.RIGHT_SHIFT_SIGNED)
					|| (op == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED)) {
				if (lhsType != rhsType) {
					throw new Error(node, "Type mismatch between LHS and RHS2: " + node);
				}
				setResult(node, this.tf.Int);
			} else {															//invalid operator, throw error
				throw new Error(node, "invalid infix expression: " + node);
			}
			return false;
		}

		// TODO - PrefixExpression
		@Override
		public boolean visit(final PrefixExpression node) {
			node.getOperand().accept(this);
			final Type t = getResult();
			final PrefixExpression.Operator op = node.getOperator();
			if ((op == PrefixExpression.Operator.PLUS)
					|| (op == PrefixExpression.Operator.COMPLEMENT)
					|| (op == PrefixExpression.Operator.MINUS)) {
				if (t != this.tf.Int)
					throw new Error(node, op + " - expecting type int: " + node);
				setResult(node, this.tf.Int);
			} else if (op == PrefixExpression.Operator.NOT) {
				if (t != this.tf.Boolean)
					throw new Error(node, "'NOT' operator expecting boolean: " + node);
				setResult(node, this.tf.Boolean);
			} else {
				throw new Error(node, "Invalid operator: " + op);
			}
			return false;
		}

		// TODO - ArrayCreation
		@Override
		public boolean visit(final ArrayCreation node) {
			ArrayInitializer arrayinit = node.getInitializer();

			if (arrayinit != null) {
				List<Expression> expressions = arrayinit.expressions();
				Type element = convertType(node, node.getType().getElementType());
				for (int index = 0; index < expressions.size(); index++) {
					Expression exp = expressions.get(index);
					exp.accept(this);
					Type t = getResult();
					if (t != element) {	// compares array type with expected element type
						if (!(element instanceof ClassType && exp instanceof NullLiteral)) {
							throw new Error(node, "Array initialization error: " + node);
						}
					}
				}
			}
			
			List<Expression> content = node.dimensions(); // int[x]  -> x = dimension
			for (int i = 0; i < content.size(); i++) {
				Expression exp = content.get(i);
				exp.accept(this);

				Type t = getResult();
				if (t != tf.Int) {
					throw new Error(node, "Aray size type mismatch: " + node.dimensions());
				}
			}

			Type t = convertType(node, node.getType());
			setResult(node, t);
			return false;
		}

		// TODO - ClassInstanceCreation
		@Override
		public boolean visit(final ClassInstanceCreation node) {
			final Type t = convertType(node, node.getType()); 
			setResult(node, t);
			//add to symbol table
			this.symbolMap.put(node, this.classMap.get(node.getType().toString()));
			return false;
		}

		
		//TODO - ArrayAccess
		@Override   
	    public boolean visit(final ArrayAccess node) {
	    	//index
	    	node.getIndex().accept(this);
	        if (getResult() != this.tf.Int) {
	            throw new Error(node, "Array Index not of type int: " + node);
	        }  	    	
	        //array
	        node.getArray().accept(this);
	        setResult(node, ((ArrayType)getResult()).baseType);
	    	return false;
	    }
		
		// TODO - Return Statement
		@Override
		public boolean visit(final ReturnStatement node) {
			final Expression exp = node.getExpression();
			
			//void type, non-void type, array type
			if ((this.methodReturnType == this.tf.Void) && (exp != null)) {
				throw new Error(node, "Return type should be void: " + node);
			} else if ((this.methodReturnType != this.tf.Void) && (exp == null)) {
				throw new Error(node, "Missing return statement: " + node);
			} else if ((this.methodReturnType != this.tf.Void) && (exp != null)) {
				exp.accept(this);
				final Type t = getResult();
				if (t != this.methodReturnType		//checks not return type
						&& !(((this.methodReturnType instanceof ArrayType) && t == this.tf.Null) //not array type && not not null							
							|| ((this.methodReturnType instanceof ClassType) && t == this.tf.Null))) { //not class type && not null
					throw new Error(node, "Incorrect return type: " + node);
				}
			}
			return false;
		}
	
///////////////////////////////////	End of my methods ///////////////////////////////////
		@Override
		protected Type convertType(final ASTNode node,
				final org.eclipse.jdt.core.dom.Type t) {
			if (t instanceof SimpleType) {
				final SimpleType st = (SimpleType) t;
				final String name = st.getName().getFullyQualifiedName();
				if (this.classMap.containsKey(name)) {
					return this.tf.getClassType(name);
				}
			}
			return super.convertType(node, t);
		}

		@Override
		protected void dispose() {
			super.dispose();

			this.classMap = null;
			this.fieldMap = null;
		}

		@Override
		protected void typeCheckMethodInvocation(final MethodInvocation node,
				final String className, final String methodName,
				final Type[] argTypes, final Method m) {
			@SuppressWarnings("rawtypes")
			final Class[] paramTypeClasses = m.getParameterTypes();
			final int numOfParams = paramTypeClasses.length;
			if (argTypes.length != numOfParams) {
				throw new Error(node,
						"Wrong number of arguments to invoke method \""
								+ methodName + "\" in \"" + node + "\"");
			}
			final List<Type> paramTypes = new ArrayList<Type>();
			for (int i = 0; i < numOfParams; i++) {
				final Type t = convertType(node, paramTypeClasses[i]);
				if ((argTypes[i] instanceof NullType)
						&& (t instanceof NonPrimitiveType)) {
					// OK
				} else if (t != argTypes[i]) {
					throw new Error(node, "Type mismatch the " + i
							+ " argument in \"" + node + "\"");
				}
				paramTypes.add(t);
			}
			final Type returnType = convertType(node, m.getReturnType());
			if (!this.resultMethodTypeMap.containsKey(m)) {
				this.resultMethodTypeMap.put(m, new Pair<Type, List<Type>>(
						returnType, paramTypes));
			}
			setResult(node, returnType);
		}

		@Override
		protected void typeCheckMethodInvocation(final MethodInvocation node,
				final String className, final String methodName,
				final Type[] argTypes, final MethodDeclaration md) {
			final int numOfParams = md.parameters().size();
			if (argTypes.length != numOfParams) {
				throw new Error(node,
						"Wrong number of arguments to invoke method \""
								+ methodName + "\" in \"" + node + "\"");
			}
			for (int i = 0; i < numOfParams; i++) {
				final Type t = convertType(node,
						((SingleVariableDeclaration) md.parameters().get(i))
								.getType());
				if ((argTypes[i] instanceof NullType)
						&& (t instanceof NonPrimitiveType)) {
				} else if (t != argTypes[i]) {
					throw new Error(node, "Type mismatch the " + i
							+ " argument in \"" + node + "\"");
				}
			}
			final Type returnType = convertType(node, md.getReturnType2());
			setResult(node, returnType);
		}
	}

	/**
	 * Type checks an ExtendedStaticJava {@link CompilationUnit} with the given
	 * {@link ExtendedSymbolTable} and the given {@link TypeFactory}. It also
	 * resolves {@link MethodInvocation} of library call (and put its mapping in
	 * the {@link ExtendedSymbolTable}).
	 * 
	 * @param tf
	 *            The {@link TypeFactory}.
	 * @param cu
	 *            The StaticJava {@link CompilationUnit}.
	 * @param symbolTable
	 *            The {@link ExtendedSymbolTable} of the {@link CompilationUnit}
	 * @return The {@link ExtendedTypeTable}.
	 * @throws TypeChecker.Error
	 *             If the type checker encounter type error in the
	 *             {@link CompilationUnit}.
	 */
	public static @NonNull ExtendedTypeTable check(
			@NonNull final TypeFactory tf, @NonNull final CompilationUnit cu,
			@NonNull final ExtendedSymbolTable symbolTable)
			throws TypeChecker.Error {
		assert (tf != null) && (cu != null) && (symbolTable != null);

		final Visitor v = new Visitor(tf, symbolTable);
		cu.accept(v);
		final ExtendedTypeTable result = new ExtendedTypeTable(v.resultTypeMap,
				v.resultMethodTypeMap);
		v.dispose();
		return result;
	}

	/**
	 * Declared as protected to disallow creation of this object outside from
	 * the methods of this class.
	 */
	protected ExtendedTypeChecker() {
	}
}
