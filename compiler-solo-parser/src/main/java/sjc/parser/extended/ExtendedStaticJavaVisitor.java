// Generated from ExtendedStaticJava.g4 by ANTLR 4.4
package sjc.parser.extended;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtendedStaticJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtendedStaticJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NullLit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#literalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLit(@NotNull ExtendedStaticJavaParser.NullLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#fieldAccessExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessExp(@NotNull ExtendedStaticJavaParser.FieldAccessExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInit(@NotNull ExtendedStaticJavaParser.ArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(@NotNull ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LitExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLitExpr(@NotNull ExtendedStaticJavaParser.LitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(@NotNull ExtendedStaticJavaParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(@NotNull ExtendedStaticJavaParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ExtendedStaticJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExpr(@NotNull ExtendedStaticJavaParser.InvokeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturnType(@NotNull ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(@NotNull ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull ExtendedStaticJavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExpStatement(@NotNull ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#literalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull ExtendedStaticJavaParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(@NotNull ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessr(@NotNull ExtendedStaticJavaParser.ArrayAccessrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(@NotNull ExtendedStaticJavaParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExp(@NotNull ExtendedStaticJavaParser.IDExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp2}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp2(@NotNull ExtendedStaticJavaParser.BinaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDec(@NotNull ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(@NotNull ExtendedStaticJavaParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarRefr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRefr(@NotNull ExtendedStaticJavaParser.VarRefrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#binaryOp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp2(@NotNull ExtendedStaticJavaParser.BinaryOp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#condExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExp(@NotNull ExtendedStaticJavaParser.CondExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdates(@NotNull ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(@NotNull ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(@NotNull ExtendedStaticJavaParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#parenExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(@NotNull ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExprArrInit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExprArrInit(@NotNull ExtendedStaticJavaParser.NewExprArrInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull ExtendedStaticJavaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#literalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(@NotNull ExtendedStaticJavaParser.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#fieldOrMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrMethodDeclaration(@NotNull ExtendedStaticJavaParser.FieldOrMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(@NotNull ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull ExtendedStaticJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDeclaration(@NotNull ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(@NotNull ExtendedStaticJavaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(@NotNull ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(@NotNull ExtendedStaticJavaParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(@NotNull ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(@NotNull ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInits(@NotNull ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ExtendedStaticJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpID}
	 * labeled alternative in {@link ExtendedStaticJavaParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpID(@NotNull ExtendedStaticJavaParser.NewExpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccessr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessr(@NotNull ExtendedStaticJavaParser.FieldAccessrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(@NotNull ExtendedStaticJavaParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpArr}
	 * labeled alternative in {@link ExtendedStaticJavaParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpArr(@NotNull ExtendedStaticJavaParser.NewExpArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull ExtendedStaticJavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull ExtendedStaticJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#invokeExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExp(@NotNull ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#binaryLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogical(@NotNull ExtendedStaticJavaParser.BinaryLogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#simpleClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleClassDeclaration(@NotNull ExtendedStaticJavaParser.SimpleClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull ExtendedStaticJavaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(@NotNull ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStatement(@NotNull ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#arrayAccessExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExp(@NotNull ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicFieldDeclaration(@NotNull ExtendedStaticJavaParser.PublicFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ExtendedStaticJavaParser.AssignContext ctx);
}