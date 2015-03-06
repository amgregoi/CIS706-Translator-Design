package sjc.ast.extended;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

import sjc.parser.extended.ExtendedStaticJavaBaseVisitor;
import sjc.parser.extended.ExtendedStaticJavaParser.ArgsContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ArrayAccessContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ArrayAccessrContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ArrayInitContext;
import sjc.parser.extended.ExtendedStaticJavaParser.AssignContext;
import sjc.parser.extended.ExtendedStaticJavaParser.AssignStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.BinaryExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.BinaryExprContext;
import sjc.parser.extended.ExtendedStaticJavaParser.BooleanTypeContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ClassDefinitionContext;
import sjc.parser.extended.ExtendedStaticJavaParser.CompilationUnitContext;
import sjc.parser.extended.ExtendedStaticJavaParser.CondExprContext;
import sjc.parser.extended.ExtendedStaticJavaParser.DoWhileStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.FalseLiteralContext;
import sjc.parser.extended.ExtendedStaticJavaParser.FieldAccessContext;
import sjc.parser.extended.ExtendedStaticJavaParser.FieldAccessrContext;
import sjc.parser.extended.ExtendedStaticJavaParser.FieldDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.FieldOrMethodDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ForStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IDExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IncDecContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IncDecStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IntLitContext;
import sjc.parser.extended.ExtendedStaticJavaParser.NewExpArrContext;
import sjc.parser.extended.ExtendedStaticJavaParser.NewExpIDContext;
import sjc.parser.extended.ExtendedStaticJavaParser.NewExprArrInitContext;
import sjc.parser.extended.ExtendedStaticJavaParser.NullLitContext;
import sjc.parser.extended.ExtendedStaticJavaParser.PublicFieldDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.SimpleClassDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.TrueLiteralContext;
import sjc.parser.extended.ExtendedStaticJavaParser.TypeContext;
import sjc.parser.extended.ExtendedStaticJavaParser.VarRefContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IfStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.IntTypeContext;
import sjc.parser.extended.ExtendedStaticJavaParser.InvokeExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.InvokeExpStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.LocalDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.MainMethodDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.MethodBodyContext;
import sjc.parser.extended.ExtendedStaticJavaParser.MethodDeclarationContext;
import sjc.parser.extended.ExtendedStaticJavaParser.NonVoidReturnTypeContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ParamContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ParamsContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ParenExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.ReturnStatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.StatementContext;
import sjc.parser.extended.ExtendedStaticJavaParser.UnaryExpContext;
import sjc.parser.extended.ExtendedStaticJavaParser.VoidTypeContext;
import sjc.parser.extended.ExtendedStaticJavaParser.WhileStatementContext;

/**
 * This class builds JDT AST from ANTLR Parse Tree produced by
 * ExtendedStaticJava parser.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedStaticJavaASTBuilder extends
		ExtendedStaticJavaBaseVisitor<ASTNode> {

	static CompilationUnit ast(final CompilationUnitContext ctx) {
		final ExtendedStaticJavaASTBuilder builder = new ExtendedStaticJavaASTBuilder();
		return builder.<CompilationUnit> build(ctx);
	}

	final static HashMap<String, InfixExpression.Operator> binopMap;

	final static HashMap<String, PrefixExpression.Operator> unopMap;

	static {
		binopMap = new HashMap<String, InfixExpression.Operator>(16);
		ExtendedStaticJavaASTBuilder.binopMap.put("||",
				InfixExpression.Operator.CONDITIONAL_OR);
		ExtendedStaticJavaASTBuilder.binopMap.put("&&",
				InfixExpression.Operator.CONDITIONAL_AND);
		ExtendedStaticJavaASTBuilder.binopMap.put("==",
				InfixExpression.Operator.EQUALS);
		ExtendedStaticJavaASTBuilder.binopMap.put("!=",
				InfixExpression.Operator.NOT_EQUALS);
		ExtendedStaticJavaASTBuilder.binopMap.put("==",
				InfixExpression.Operator.EQUALS);
		ExtendedStaticJavaASTBuilder.binopMap.put("<",
				InfixExpression.Operator.LESS);
		ExtendedStaticJavaASTBuilder.binopMap.put(">",
				InfixExpression.Operator.GREATER);
		ExtendedStaticJavaASTBuilder.binopMap.put("<=",
				InfixExpression.Operator.LESS_EQUALS);
		ExtendedStaticJavaASTBuilder.binopMap.put(">=",
				InfixExpression.Operator.GREATER_EQUALS);
		ExtendedStaticJavaASTBuilder.binopMap.put("+",
				InfixExpression.Operator.PLUS);
		ExtendedStaticJavaASTBuilder.binopMap.put("-",
				InfixExpression.Operator.MINUS);
		ExtendedStaticJavaASTBuilder.binopMap.put("*",
				InfixExpression.Operator.TIMES);
		ExtendedStaticJavaASTBuilder.binopMap.put("/",
				InfixExpression.Operator.DIVIDE);
		ExtendedStaticJavaASTBuilder.binopMap.put("%",
				InfixExpression.Operator.REMAINDER);

		//MINE
		ExtendedStaticJavaASTBuilder.binopMap.put(">>>",
				InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED);
		ExtendedStaticJavaASTBuilder.binopMap.put(">>",
				InfixExpression.Operator.RIGHT_SHIFT_SIGNED);
		ExtendedStaticJavaASTBuilder.binopMap.put("<<",
				InfixExpression.Operator.LEFT_SHIFT);

		unopMap = new HashMap<String, PrefixExpression.Operator>(4);
		ExtendedStaticJavaASTBuilder.unopMap.put("+",
				PrefixExpression.Operator.PLUS);
		ExtendedStaticJavaASTBuilder.unopMap.put("-",
				PrefixExpression.Operator.MINUS);
		ExtendedStaticJavaASTBuilder.unopMap.put("!",
				PrefixExpression.Operator.NOT);

		//MINE
		ExtendedStaticJavaASTBuilder.unopMap.put("~",
				PrefixExpression.Operator.COMPLEMENT);
	}

	protected AST ast = AST.newAST(AST.JLS8);

	private ExtendedStaticJavaASTBuilder() {
	}

	@SuppressWarnings("unchecked")
	private void add(@SuppressWarnings("rawtypes") final List l, final Object o) {
		l.add(o);
	}

	@SuppressWarnings("unchecked")
	private <T extends ASTNode> T build(final ParserRuleContext tree) {
		return (T) visit(tree);
	}

	private <E extends ParserRuleContext> void builds(
			@SuppressWarnings("rawtypes") final List l, final List<E> trees) {
		if (trees != null) {
			for (final E e : trees) {
				add(l, build(e));
			}
		}
	}

	@Override
	public ExpressionStatement visitAssignStatement(final AssignStatementContext ctx) {
		return this.ast.newExpressionStatement(visitAssign(ctx.assign()));
	}
	

	@Override
	public InfixExpression visitBinaryExp(final BinaryExpContext ctx) {
		final InfixExpression result = this.ast.newInfixExpression();

		//result.setLeftOperand(this.<Expression> build(ctx.));

		result.setOperator(ExtendedStaticJavaASTBuilder.binopMap.get(ctx
				.binaryOp().getText()));

		result.setRightOperand(this.<Expression> build(ctx.e2));

		return result;
	}


	@Override
	public PrimitiveType visitBooleanType(final BooleanTypeContext ctx) {
		return this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
	}

	@Override
	public TypeDeclaration visitClassDefinition(final ClassDefinitionContext ctx) {
		final TypeDeclaration result = this.ast.newTypeDeclaration();
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		result.setName(this.ast.newSimpleName(ctx.ID().getText()));

		add(result.bodyDeclarations(),
				this.<MethodDeclaration> build(ctx.mainMethodDeclaration()));

		final List<FieldOrMethodDeclarationContext> fieldMethodDeclarations = ctx.fieldOrMethodDeclaration();
		if (fieldMethodDeclarations != null) {
			builds(result.bodyDeclarations(), fieldMethodDeclarations);
		}
		
		return result;
	}

	@Override
	public CompilationUnit visitCompilationUnit(final CompilationUnitContext ctx) {
		final CompilationUnit result = this.ast.newCompilationUnit();

		// MINE
		for (int i = 0; i < ctx.scd1.size(); i++)
			add(result.types(), this.<TypeDeclaration> build(ctx.scd1.get(i)));

		add(result.types(), this.<TypeDeclaration> build(ctx.classDefinition()));

		// MINE
		for (int i = 0; i < ctx.scd2.size(); i++)
			add(result.types(), this.<TypeDeclaration> build(ctx.scd2.get(i)));

		return result;
	}

	@Override
	public FieldDeclaration visitFieldDeclaration(
			final FieldDeclarationContext ctx) {
		final VariableDeclarationFragment vdf = this.ast
				.newVariableDeclarationFragment();
		final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		result.setType(this.<Type> build(ctx.type()));

		vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

		return result;
	}

	@Override
	public SimpleName visitVarRef(final VarRefContext ctx) {
		return this.ast.newSimpleName(ctx.ID().getText());
	}

	@Override
	public IfStatement visitIfStatement(final IfStatementContext ctx) {
		final IfStatement result = this.ast.newIfStatement();
		final Block thenBlock = this.ast.newBlock();
		result.setThenStatement(thenBlock);
		final Block elseBlock = this.ast.newBlock();
		result.setElseStatement(elseBlock);

		result.setExpression(this.<Expression> build(ctx.exp()));

		final List<StatementContext> ts = ctx.ts;
		if (ts != null) {
			builds(thenBlock.statements(), ts);
		}

		final List<StatementContext> fs = ctx.fs;
		if (fs != null) {
			builds(elseBlock.statements(), fs);
		}

		return result;
	}

	@Override
	public PrimitiveType visitIntType(final IntTypeContext ctx) {
		return this.ast.newPrimitiveType(PrimitiveType.INT);
	}
	
	
	@Override
	public MethodInvocation visitInvokeExp(final InvokeExpContext ctx) {
		final MethodInvocation result = this.ast.newMethodInvocation();

		if (ctx.id1 != null) {
			result.setExpression(this.ast.newSimpleName(ctx.id1.getText()));
		}

		result.setName(this.ast.newSimpleName(ctx.id2.getText()));

		final ArgsContext args = ctx.args();
		if (args != null) {
			builds(result.arguments(), args.exp());
		}

		return result;
	}

	@Override
	public ExpressionStatement visitInvokeExpStatement(
			final InvokeExpStatementContext ctx) {
		return this.ast.newExpressionStatement(this
				.<MethodInvocation> build(ctx.invokeExp()));
	}

	@Override
	public VariableDeclarationStatement visitLocalDeclaration(
			final LocalDeclarationContext ctx) {
		final VariableDeclarationFragment vdf = this.ast
				.newVariableDeclarationFragment();
		final VariableDeclarationStatement result = this.ast
				.newVariableDeclarationStatement(vdf);

		result.setType(this.<Type> build(ctx.type()));

		vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

		return result;
	}

	@Override
	public MethodDeclaration visitMainMethodDeclaration(
			final MainMethodDeclarationContext ctx) {
		final MethodDeclaration result = this.ast.newMethodDeclaration();
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
		result.setName(this.ast.newSimpleName("main"));

		final SingleVariableDeclaration svd = this.ast
				.newSingleVariableDeclaration();
		svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
				.newSimpleName("String"))));
		svd.setName(this.ast.newSimpleName(ctx.id3.getText()));
		add(result.parameters(), svd);
		result.setBody(this.<Block> build(ctx.methodBody()));

		return result;
	}

	@Override
	public Block visitMethodBody(final MethodBodyContext ctx) {
		final Block result = this.ast.newBlock();

		final List<LocalDeclarationContext> localDeclarations = ctx
				.localDeclaration();
		if (localDeclarations != null) {
			builds(result.statements(), localDeclarations);
		}

		final List<StatementContext> statements = ctx.statement();
		if (statements != null) {
			builds(result.statements(), statements);
		}

		return result;
	}

	@Override
	public MethodDeclaration visitMethodDeclaration(
			final MethodDeclarationContext ctx) {
		final MethodDeclaration result = this.ast.newMethodDeclaration();
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		result.setReturnType2(this.<Type> build(ctx.returnType()));

		result.setName(this.ast.newSimpleName(ctx.ID().getText()));

		final ParamsContext params = ctx.params();
		if (params != null) {
			builds(result.parameters(), params.param());
		}

		result.setBody(this.<Block> build(ctx.methodBody()));

		return result;
	}

	@Override
	public Type visitNonVoidReturnType(final NonVoidReturnTypeContext ctx) {
		return this.<Type> build(ctx.type());
	}
	
	@Override
	public NullLiteral visitNullLit(final NullLitContext ctx)
	{
		return this.ast.newNullLiteral();
	}
	
	@Override
	public SingleVariableDeclaration visitParam(final ParamContext ctx) {
		final SingleVariableDeclaration result = this.ast
				.newSingleVariableDeclaration();

		result.setType(this.<Type> build(ctx.type()));

		result.setName(this.ast.newSimpleName(ctx.ID().getText()));

		return result;
	}

	@Override
	public ParenthesizedExpression visitParenExp(final ParenExpContext ctx) {
		final ParenthesizedExpression result = this.ast
				.newParenthesizedExpression();

		result.setExpression(this.<Expression> build(ctx.exp()));

		return result;
	}

	@Override
	public ReturnStatement visitReturnStatement(final ReturnStatementContext ctx) {
		final ReturnStatement result = this.ast.newReturnStatement();

		final ExpContext exp = ctx.exp();
		if (exp != null) {
			result.setExpression(this.<Expression> build(exp));
		}

		return result;
	}

	
	
	@Override
	public PrefixExpression visitUnaryExp(final UnaryExpContext ctx) {
		final PrefixExpression result = this.ast.newPrefixExpression();

		result.setOperator(ExtendedStaticJavaASTBuilder.unopMap.get(ctx
				.unaryOp().getText()));

		result.setOperand(this.<Expression> build(ctx.exp()));

		return result;
	}

	@Override
	public PrimitiveType visitVoidType(final VoidTypeContext ctx) {
		return this.ast.newPrimitiveType(PrimitiveType.VOID);
	}

	@Override
	public WhileStatement visitWhileStatement(final WhileStatementContext ctx) {
		final WhileStatement result = this.ast.newWhileStatement();
		final Block whileBody = this.ast.newBlock();
		result.setBody(whileBody);
		
		if(ctx.exp() != null)
		{
			result.setExpression(this.<Expression> build(ctx.exp()));
		}

		final List<StatementContext> statements = ctx.statement();
		if (statements != null) {
			builds(whileBody.statements(), statements);
		}

		return result;
	}

	//TODO
	/*
	 * My method additions
	 */

	// MINE
	@Override
	public TypeDeclaration visitSimpleClassDeclaration(
			final SimpleClassDeclarationContext ctx) {
		final TypeDeclaration result = this.ast.newTypeDeclaration();
		result.setName(this.ast.newSimpleName(ctx.ID().getText()));

		final List<PublicFieldDeclarationContext> publicFieldDefinitions = ctx
				.publicFieldDeclaration();
		if (publicFieldDefinitions != null) {
			builds(result.bodyDeclarations(), publicFieldDefinitions);
		}

		return result;
	}

	// MINE
	@Override
	public FieldDeclaration visitPublicFieldDeclaration(
			final PublicFieldDeclarationContext ctx) {
		final VariableDeclarationFragment vdf = this.ast
				.newVariableDeclarationFragment();
		final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
		add(result.modifiers(),
				this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		result.setType(this.<Type> build(ctx.type()));
		vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

		return result;
	}

	// MINE
	@Override
	public Type visitType(final TypeContext ctx) {		
		if (ctx.t1 != null && ctx.arr != null) {
			return this.ast.newArrayType((Type) build(ctx.t1));
		} else if (ctx.t1 != null && ctx.arr == null) {
			return build(ctx.t1);
		} else if (ctx.t2 != null && ctx.arr != null) {
			return this.ast.newArrayType(this.ast.newSimpleType((this.ast.newSimpleName(ctx.ID().getText()))));
		} else{
			return this.ast.newSimpleType(this.ast.newSimpleName(ctx.ID().getText()));
		}
	}

	//MINE
	@Override
	public Assignment visitAssign(final AssignContext ctx)
	{
		final Assignment result = this.ast.newAssignment();
		result.setLeftHandSide(this.<Expression> build(ctx.lhs()));
		result.setRightHandSide(this.<Expression> build(ctx.exp()));
		return result;
	}
	
	//MINE
	@Override
	public SimpleName visitIDExp(final IDExpContext ctx) {
		return this.ast.newSimpleName(ctx.ID().getText());
	}
	
	//MINE
	@Override
	public FieldAccess visitFieldAccess(final FieldAccessContext ctx)
	{
		final FieldAccess result = this.ast.newFieldAccess();
		result.setExpression(this.<Expression> build(ctx.exp()));
		result.setName(this.ast.newSimpleName(ctx.ID().getText()));
		return result;
	}

	//MINE - LHS
	@Override
	public ArrayAccess visitArrayAccess(final ArrayAccessContext ctx)
	{
		final ArrayAccess result = this.ast.newArrayAccess();
		result.setArray(this.<Expression> build(ctx.arr));
		result.setIndex(this.<Expression> build(ctx.index));
		return result;
	}
	
	// MINE
	@Override
	public ForStatement visitForStatement(final ForStatementContext ctx) {
		final ForStatement result = this.ast.newForStatement();
		final Block forBody = this.ast.newBlock();
		result.setBody(forBody);
		//inits
		if (ctx.forInits() != null)
			builds(result.initializers(), ctx.forInits().assign());
		
		//expression
		if(ctx.exp() != null)
			result.setExpression(this.<Expression> build(ctx.exp()));
		
		//updaters
		if (ctx.forUpdates() != null)
			builds(result.updaters(), ctx.forUpdates().incDec());

		//statements 
		final List<StatementContext> statements = ctx.statement();
		if (statements != null) {
			builds(forBody.statements(), statements);
		}

		return result;
	}
	
	// MINE
	@Override
	public PostfixExpression visitIncDec(final IncDecContext ctx)
	{
		final PostfixExpression result = this.ast.newPostfixExpression();
		if(ctx.op != null)
			result.setOperator(PostfixExpression.Operator.INCREMENT);
		else
			result.setOperator(PostfixExpression.Operator.DECREMENT);
		result.setOperand(this.<Expression> build(ctx.lhs()));
		return result;
	}
	
	@Override
	public ExpressionStatement visitIncDecStatement(final IncDecStatementContext ctx)
	{
		final PostfixExpression result = this.ast.newPostfixExpression();
		if(ctx.incDec().op != null)
			result.setOperator(PostfixExpression.Operator.INCREMENT);
		else
			result.setOperator(PostfixExpression.Operator.DECREMENT);
		result.setOperand(this.<Expression> build(ctx.incDec().lhs()));
		
		final ExpressionStatement e = this.ast.newExpressionStatement(result);
		return e;
	}
	
	// MINE
	@Override
	public DoStatement visitDoWhileStatement(final DoWhileStatementContext ctx) {
		final DoStatement result = this.ast.newDoStatement();
		final Block doBody = this.ast.newBlock();

		result.setBody(doBody);

		final List<StatementContext> statements = ctx.statement();
		if (statements != null) {
			builds(doBody.statements(), statements);
		}
		result.setExpression(this.<Expression> build(ctx.exp()));
		return result;
	}

	//MINE
	@Override
	public NumberLiteral visitIntLit(final IntLitContext ctx)
	{
		final NumberLiteral result = this.ast.newNumberLiteral();
		result.setToken(ctx.getText());
		return result;
	}

	//MINE
	@Override 
	public BooleanLiteral visitTrueLiteral(final TrueLiteralContext ctx)
	{
		return this.ast.newBooleanLiteral(true);
	}
	
	//MINE
	@Override 
	public BooleanLiteral visitFalseLiteral(final FalseLiteralContext ctx)
	{
		  return this.ast.newBooleanLiteral(false);
	}
	//MINE
	@Override
	public InfixExpression visitBinaryExpr(final BinaryExprContext ctx)
	{
		final InfixExpression result = this.visitBinaryExp(ctx.binaryExp());
		result.setLeftOperand(this.<Expression> build(ctx.exp()));
		return result;
	}
	
	//MINE
	@Override
	public ArrayAccess visitArrayAccessr(final ArrayAccessrContext ctx)
	{
		final ArrayAccess result = this.ast.newArrayAccess();
		result.setArray(this.<Expression> build(ctx.exp()));
		result.setIndex(this.<Expression> build(ctx.arrayAccessExp().exp()));
		return result;
	}

	//MINE
	@Override
	public FieldAccess visitFieldAccessr(final FieldAccessrContext ctx)
	{
		final FieldAccess result = this.ast.newFieldAccess();
		result.setExpression(this.<Expression> build(ctx.exp()));
		result.setName(this.ast.newSimpleName(ctx.fieldAccessExp().ID().getText()));
		return result;
	}
	
	//MINE
	@Override
	public ConditionalExpression visitCondExpr(final CondExprContext ctx)
	{
		final ConditionalExpression result = this.ast.newConditionalExpression();
		result.setExpression(this.<Expression> build(ctx.exp()));
		result.setThenExpression(this.<Expression> build(ctx.condExp().e1));
		result.setElseExpression(this.<Expression> build(ctx.condExp().e2));
		
		return result;
	}
	
	
	//MINE
	@Override
	public ArrayCreation visitNewExprArrInit(final NewExprArrInitContext ctx)
	{
		final ArrayCreation result = this.ast.newArrayCreation();
		result.setType(this.ast.newArrayType(this.<Type> build(ctx.t)));
		result.setInitializer(this.<ArrayInitializer> build(ctx.arrayInit()));
		return result;
	}

	//MINE
	@Override
	public ArrayCreation visitNewExpArr(final NewExpArrContext ctx)
	{
		final ArrayCreation result = this.ast.newArrayCreation();
		result.setType(this.ast.newArrayType(this.<Type> build(ctx.t)));
		add(result.dimensions(), build(ctx.exp()));

		return result;
	}

	//MINE
	@Override
	public ClassInstanceCreation visitNewExpID(final NewExpIDContext ctx)
	{
		final ClassInstanceCreation result = this.ast.newClassInstanceCreation();
		result.setType(this.ast.newSimpleType(this.ast.newSimpleName(ctx.ID().getText())));
		
		return result;	
	}
	
	//MINE
	@Override
	public ArrayInitializer visitArrayInit(final ArrayInitContext ctx)
	{
		final ArrayInitializer result = this.ast.newArrayInitializer();
		if(ctx.exp()!= null)
			builds(result.expressions(), ctx.exp());
		
		return result;
	}
	
	
}
