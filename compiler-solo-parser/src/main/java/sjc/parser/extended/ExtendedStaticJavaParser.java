// Generated from ExtendedStaticJava.g4 by ANTLR 4.4
package sjc.parser.extended;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExtendedStaticJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__47=1, T__46=2, T__45=3, T__44=4, T__43=5, T__42=6, T__41=7, T__40=8, 
		T__39=9, T__38=10, T__37=11, T__36=12, T__35=13, T__34=14, T__33=15, T__32=16, 
		T__31=17, T__30=18, T__29=19, T__28=20, T__27=21, T__26=22, T__25=23, 
		T__24=24, T__23=25, T__22=26, T__21=27, T__20=28, T__19=29, T__18=30, 
		T__17=31, T__16=32, T__15=33, T__14=34, T__13=35, T__12=36, T__11=37, 
		T__10=38, T__9=39, T__8=40, T__7=41, T__6=42, T__5=43, T__4=44, T__3=45, 
		T__2=46, T__1=47, T__0=48, ID=49, NUM=50, WS=51, ERROR=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'new'", "'true'", "'return'", "'!='", "'class'", 
		"'||'", "'while'", "'void'", "';'", "'{'", "'&&'", "'>>'", "'<<'", "'='", 
		"'}'", "'for'", "'if'", "'?'", "'<='", "'int'", "'null'", "'do'", "'('", 
		"'*'", "','", "'false'", "'.'", "'boolean'", "':'", "'>='", "'['", "'=='", 
		"'<'", "'>>>'", "'--'", "'++'", "']'", "'public'", "'>'", "'~'", "'!'", 
		"'static'", "'%'", "'else'", "')'", "'+'", "'-'", "ID", "NUM", "WS", "ERROR"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_classDefinition = 1, RULE_simpleClassDeclaration = 2, 
		RULE_publicFieldDeclaration = 3, RULE_mainMethodDeclaration = 4, RULE_fieldOrMethodDeclaration = 5, 
		RULE_fieldDeclaration = 6, RULE_methodDeclaration = 7, RULE_type = 8, 
		RULE_basicType = 9, RULE_returnType = 10, RULE_params = 11, RULE_param = 12, 
		RULE_methodBody = 13, RULE_localDeclaration = 14, RULE_statement = 15, 
		RULE_assignStatement = 16, RULE_ifStatement = 17, RULE_whileStatement = 18, 
		RULE_invokeExpStatement = 19, RULE_returnStatement = 20, RULE_incDecStatement = 21, 
		RULE_assign = 22, RULE_lhs = 23, RULE_forStatement = 24, RULE_forInits = 25, 
		RULE_forUpdates = 26, RULE_incDec = 27, RULE_doWhileStatement = 28, RULE_exp = 29, 
		RULE_literalExp = 30, RULE_booleanLiteral = 31, RULE_unaryExp = 32, RULE_unaryOp = 33, 
		RULE_binaryOp = 34, RULE_binaryOp2 = 35, RULE_binaryLogical = 36, RULE_parenExp = 37, 
		RULE_invokeExp = 38, RULE_args = 39, RULE_varRef = 40, RULE_condExp = 41, 
		RULE_newExp = 42, RULE_arrayInit = 43, RULE_fieldAccessExp = 44, RULE_arrayAccessExp = 45;
	public static final String[] ruleNames = {
		"compilationUnit", "classDefinition", "simpleClassDeclaration", "publicFieldDeclaration", 
		"mainMethodDeclaration", "fieldOrMethodDeclaration", "fieldDeclaration", 
		"methodDeclaration", "type", "basicType", "returnType", "params", "param", 
		"methodBody", "localDeclaration", "statement", "assignStatement", "ifStatement", 
		"whileStatement", "invokeExpStatement", "returnStatement", "incDecStatement", 
		"assign", "lhs", "forStatement", "forInits", "forUpdates", "incDec", "doWhileStatement", 
		"exp", "literalExp", "booleanLiteral", "unaryExp", "unaryOp", "binaryOp", 
		"binaryOp2", "binaryLogical", "parenExp", "invokeExp", "args", "varRef", 
		"condExp", "newExp", "arrayInit", "fieldAccessExp", "arrayAccessExp"
	};

	@Override
	public String getGrammarFileName() { return "ExtendedStaticJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtendedStaticJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public SimpleClassDeclarationContext simpleClassDeclaration;
		public List<SimpleClassDeclarationContext> scd1 = new ArrayList<SimpleClassDeclarationContext>();
		public List<SimpleClassDeclarationContext> scd2 = new ArrayList<SimpleClassDeclarationContext>();
		public SimpleClassDeclarationContext simpleClassDeclaration(int i) {
			return getRuleContext(SimpleClassDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ExtendedStaticJavaParser.EOF, 0); }
		public List<SimpleClassDeclarationContext> simpleClassDeclaration() {
			return getRuleContexts(SimpleClassDeclarationContext.class);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(92); ((CompilationUnitContext)_localctx).simpleClassDeclaration = simpleClassDeclaration();
				((CompilationUnitContext)_localctx).scd1.add(((CompilationUnitContext)_localctx).simpleClassDeclaration);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); classDefinition();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(99); ((CompilationUnitContext)_localctx).simpleClassDeclaration = simpleClassDeclaration();
				((CompilationUnitContext)_localctx).scd2.add(((CompilationUnitContext)_localctx).simpleClassDeclaration);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public List<FieldOrMethodDeclarationContext> fieldOrMethodDeclaration() {
			return getRuleContexts(FieldOrMethodDeclarationContext.class);
		}
		public FieldOrMethodDeclarationContext fieldOrMethodDeclaration(int i) {
			return getRuleContext(FieldOrMethodDeclarationContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(T__9);
			setState(108); match(T__42);
			setState(109); match(ID);
			setState(110); match(T__37);
			setState(111); mainMethodDeclaration();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(112); fieldOrMethodDeclaration();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public PublicFieldDeclarationContext publicFieldDeclaration(int i) {
			return getRuleContext(PublicFieldDeclarationContext.class,i);
		}
		public List<PublicFieldDeclarationContext> publicFieldDeclaration() {
			return getRuleContexts(PublicFieldDeclarationContext.class);
		}
		public SimpleClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClassDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitSimpleClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClassDeclarationContext simpleClassDeclaration() throws RecognitionException {
		SimpleClassDeclarationContext _localctx = new SimpleClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__42);
			setState(121); match(ID);
			setState(122); match(T__37);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(123); publicFieldDeclaration();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicFieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PublicFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicFieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitPublicFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicFieldDeclarationContext publicFieldDeclaration() throws RecognitionException {
		PublicFieldDeclarationContext _localctx = new PublicFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_publicFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(T__9);
			setState(132); type();
			setState(133); match(ID);
			setState(134); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Token id3;
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(T__9);
			setState(137); match(T__5);
			setState(138); match(T__39);
			setState(139); ((MainMethodDeclarationContext)_localctx).id1 = match(ID);
			setState(140);
			if (!( "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(141); match(T__24);
			setState(142); ((MainMethodDeclarationContext)_localctx).id2 = match(ID);
			setState(143);
			if (!( "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(144); match(T__16);
			setState(145); match(T__10);
			setState(146); ((MainMethodDeclarationContext)_localctx).id3 = match(ID);
			setState(147); match(T__2);
			setState(148); match(T__37);
			setState(149); methodBody();
			setState(150); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldOrMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FieldOrMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldOrMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrMethodDeclarationContext fieldOrMethodDeclaration() throws RecognitionException {
		FieldOrMethodDeclarationContext _localctx = new FieldOrMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldOrMethodDeclaration);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__5);
			setState(157); type();
			setState(158); match(ID);
			setState(159); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(T__5);
			setState(162); returnType();
			setState(163); match(ID);
			setState(164); match(T__24);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				setState(165); params();
				}
			}

			setState(168); match(T__2);
			setState(169); match(T__37);
			setState(170); methodBody();
			setState(171); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext t1;
		public Token t2;
		public Token arr;
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case T__27:
			case T__19:
				{
				setState(173); ((TypeContext)_localctx).t1 = basicType();
				}
				break;
			case ID:
				{
				setState(174); ((TypeContext)_localctx).t2 = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(177); ((TypeContext)_localctx).arr = match(T__16);
				setState(178); match(T__10);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
	 
		public BasicTypeContext() { }
		public void copyFrom(BasicTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTypeContext extends BasicTypeContext {
		public Token t1;
		public BooleanTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends BasicTypeContext {
		public Token t2;
		public IntTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicType);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((BooleanTypeContext)_localctx).t1 = match(T__19);
				}
				break;
			case T__27:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182); ((IntTypeContext)_localctx).t2 = match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidTypeContext extends ReturnTypeContext {
		public VoidTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonVoidReturnTypeContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNonVoidReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__39:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(T__39);
				}
				break;
			case T__27:
			case T__19:
			case ID:
				_localctx = new NonVoidReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); param();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(190); match(T__22);
				setState(191); param();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); type();
			setState(198); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200); localDeclaration();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(206); statement();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); type();
			setState(213); match(ID);
			setState(214); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IncDecStatementContext incDecStatement() {
			return getRuleContext(IncDecStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(216); assignStatement();
				}
				break;
			case 2:
				{
				setState(217); ifStatement();
				}
				break;
			case 3:
				{
				setState(218); whileStatement();
				}
				break;
			case 4:
				{
				setState(219); invokeExpStatement();
				}
				break;
			case 5:
				{
				setState(220); returnStatement();
				}
				break;
			case 6:
				{
				setState(221); forStatement();
				}
				break;
			case 7:
				{
				setState(222); doWhileStatement();
				}
				break;
			case 8:
				{
				setState(223); incDecStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); assign();
			setState(227); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> ts = new ArrayList<StatementContext>();
		public List<StatementContext> fs = new ArrayList<StatementContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(T__30);
			setState(230); match(T__24);
			setState(231); exp(0);
			setState(232); match(T__2);
			setState(233); match(T__37);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(234); ((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).ts.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); match(T__32);
			setState(250);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(241); match(T__3);
				setState(242); match(T__37);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(243); ((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).fs.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249); match(T__32);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(T__40);
			setState(253); match(T__24);
			setState(254); exp(0);
			setState(255); match(T__2);
			setState(256); match(T__37);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(257); statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeExpStatementContext extends ParserRuleContext {
		public InvokeExpContext invokeExp() {
			return getRuleContext(InvokeExpContext.class,0);
		}
		public InvokeExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invokeExpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); invokeExp();
			setState(266); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(T__44);
			setState(270);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__26) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(269); exp(0);
				}
			}

			setState(272); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStatementContext extends ParserRuleContext {
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public IncDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStatementContext incDecStatement() throws RecognitionException {
		IncDecStatementContext _localctx = new IncDecStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_incDecStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); incDec();
			setState(275); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); lhs();
			setState(278); match(T__33);
			setState(279); exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
	 
		public LhsContext() { }
		public void copyFrom(LhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDExpContext extends LhsContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public IDExpContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIDExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends LhsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldAccessContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends LhsContext {
		public ExpContext arr;
		public ExpContext index;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayAccessContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lhs);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IDExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(ID);
				}
				break;
			case 2:
				_localctx = new FieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282); exp(0);
				setState(283); match(T__20);
				setState(284); match(ID);
				}
				break;
			case 3:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286); ((ArrayAccessContext)_localctx).arr = exp(0);
				setState(287); match(T__16);
				setState(288); ((ArrayAccessContext)_localctx).index = exp(0);
				setState(289); match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ExpContext e1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForInitsContext forInits() {
			return getRuleContext(ForInitsContext.class,0);
		}
		public ForUpdatesContext forUpdates() {
			return getRuleContext(ForUpdatesContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(T__31);
			setState(294); match(T__24);
			setState(296);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__26) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(295); forInits();
				}
			}

			setState(298); match(T__38);
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__26) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(299); ((ForStatementContext)_localctx).e1 = exp(0);
				}
			}

			setState(302); match(T__38);
			setState(304);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__26) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(303); forUpdates();
				}
			}

			setState(306); match(T__2);
			setState(307); match(T__37);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(308); statement();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ForInitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInits; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForInits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitsContext forInits() throws RecognitionException {
		ForInitsContext _localctx = new ForInitsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forInits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); assign();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(317); match(T__22);
				setState(318); assign();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdatesContext extends ParserRuleContext {
		public IncDecContext incDec(int i) {
			return getRuleContext(IncDecContext.class,i);
		}
		public List<IncDecContext> incDec() {
			return getRuleContexts(IncDecContext.class);
		}
		public ForUpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdates; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdatesContext forUpdates() throws RecognitionException {
		ForUpdatesContext _localctx = new ForUpdatesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forUpdates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); incDec();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(325); match(T__22);
				setState(326); incDec();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecContext extends ParserRuleContext {
		public Token op;
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_incDec);
		try {
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); lhs();
				setState(333); ((IncDecContext)_localctx).op = match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); lhs();
				setState(336); match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(T__25);
			setState(341); match(T__37);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__40) | (1L << T__31) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(342); statement();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348); match(T__32);
			setState(349); match(T__40);
			setState(350); match(T__24);
			setState(351); exp(0);
			setState(352); match(T__2);
			setState(353); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldAccessrContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FieldAccessExpContext fieldAccessExp() {
			return getRuleContext(FieldAccessExpContext.class,0);
		}
		public FieldAccessrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldAccessr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeExprContext extends ExpContext {
		public InvokeExpContext invokeExp() {
			return getRuleContext(InvokeExpContext.class,0);
		}
		public InvokeExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitExprContext extends ExpContext {
		public LiteralExpContext literalExp() {
			return getRuleContext(LiteralExpContext.class,0);
		}
		public LitExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpContext {
		public ExpContext e1;
		public BinaryOpContext op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExp2Context extends ExpContext {
		public ExpContext e1;
		public BinaryLogicalContext op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public BinaryLogicalContext binaryLogical() {
			return getRuleContext(BinaryLogicalContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExp2Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExprContext extends ExpContext {
		public NewExpContext newExp() {
			return getRuleContext(NewExpContext.class,0);
		}
		public NewExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpContext {
		public ParenExpContext parenExp() {
			return getRuleContext(ParenExpContext.class,0);
		}
		public ParenExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpContext {
		public UnaryOpContext op;
		public ExpContext e2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarRefrContext extends ExpContext {
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public VarRefrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitVarRefr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExpContext {
		public ExpContext e1;
		public BinaryOp2Context op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public BinaryOp2Context binaryOp2() {
			return getRuleContext(BinaryOp2Context.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public CondExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessrContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArrayAccessExpContext arrayAccessExp() {
			return getRuleContext(ArrayAccessExpContext.class,0);
		}
		public ArrayAccessrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayAccessr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(356); ((UnaryExprContext)_localctx).op = unaryOp();
				setState(357); ((UnaryExprContext)_localctx).e2 = exp(8);
				}
				break;
			case 2:
				{
				_localctx = new LitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359); literalExp();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360); parenExp();
				}
				break;
			case 4:
				{
				_localctx = new InvokeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361); invokeExp();
				}
				break;
			case 5:
				{
				_localctx = new VarRefrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362); varRef();
				}
				break;
			case 6:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363); newExp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(384);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(366);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(367); ((BinaryExprContext)_localctx).op = binaryOp();
						setState(368); ((BinaryExprContext)_localctx).e2 = exp(8);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(371); ((BinaryExpContext)_localctx).op = binaryOp2();
						setState(372); ((BinaryExpContext)_localctx).e2 = exp(7);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExp2Context(new ExpContext(_parentctx, _parentState));
						((BinaryExp2Context)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(374);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(375); ((BinaryExp2Context)_localctx).op = binaryLogical();
						setState(376); ((BinaryExp2Context)_localctx).e2 = exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ArrayAccessrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(378);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(379); arrayAccessExp();
						}
						break;
					case 5:
						{
						_localctx = new FieldAccessrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(380);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(381); fieldAccessExp();
						}
						break;
					case 6:
						{
						_localctx = new CondExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383); condExp();
						}
						break;
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralExpContext extends ParserRuleContext {
		public LiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExp; }
	 
		public LiteralExpContext() { }
		public void copyFrom(LiteralExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLitContext extends LiteralExpContext {
		public NullLitContext(LiteralExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNullLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitContext extends LiteralExpContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(ExtendedStaticJavaParser.NUM, 0); }
		public IntLitContext(LiteralExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLitContext extends LiteralExpContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BoolLitContext(LiteralExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpContext literalExp() throws RecognitionException {
		LiteralExpContext _localctx = new LiteralExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literalExp);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case T__45:
			case T__21:
				_localctx = new BoolLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389); booleanLiteral();
				}
				break;
			case NUM:
				_localctx = new IntLitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390); ((IntLitContext)_localctx).NUM = match(NUM);
				setState(391);
				if (!( new java.math.BigInteger((((IntLitContext)_localctx).NUM!=null?((IntLitContext)_localctx).NUM.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($NUM.text).bitLength() < 32 ");
				}
				break;
			case T__26:
				_localctx = new NullLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(392); match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueLiteralContext extends BooleanLiteralContext {
		public Token bool;
		public TrueLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends BooleanLiteralContext {
		public FalseLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_booleanLiteral);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case T__45:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395); ((TrueLiteralContext)_localctx).bool = match(T__45);
				}
				break;
			case T__21:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396); match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryOpContext op;
		public ExpContext e2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); ((UnaryExpContext)_localctx).op = unaryOp();
			setState(400); ((UnaryExpContext)_localctx).e2 = exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__35) | (1L << T__34) | (1L << T__23) | (1L << T__13) | (1L << T__4) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOp2Context extends ParserRuleContext {
		public BinaryOp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOp2Context binaryOp2() throws RecognitionException {
		BinaryOp2Context _localctx = new BinaryOp2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_binaryOp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__28) | (1L << T__17) | (1L << T__15) | (1L << T__14) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryLogicalContext extends ParserRuleContext {
		public BinaryLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLogicalContext binaryLogical() throws RecognitionException {
		BinaryLogicalContext _localctx = new BinaryLogicalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_binaryLogical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExpContext parenExp() throws RecognitionException {
		ParenExpContext _localctx = new ParenExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parenExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(T__24);
			setState(411); exp(0);
			setState(412); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeExpContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpContext invokeExp() throws RecognitionException {
		InvokeExpContext _localctx = new InvokeExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_invokeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(414); ((InvokeExpContext)_localctx).id1 = match(ID);
				setState(415); match(T__20);
				}
				break;
			}
			setState(418); ((InvokeExpContext)_localctx).id2 = match(ID);
			setState(419); match(T__24);
			setState(421);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__26) | (1L << T__24) | (1L << T__21) | (1L << T__7) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(420); args();
				}
			}

			setState(423); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); exp(0);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(426); match(T__22);
				setState(427); exp(0);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpContext extends ParserRuleContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CondExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCondExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpContext condExp() throws RecognitionException {
		CondExpContext _localctx = new CondExpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_condExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(T__29);
			setState(436); ((CondExpContext)_localctx).e1 = exp(0);
			setState(437); match(T__18);
			setState(438); ((CondExpContext)_localctx).e2 = exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpContext extends ParserRuleContext {
		public NewExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExp; }
	 
		public NewExpContext() { }
		public void copyFrom(NewExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExpArrContext extends NewExpContext {
		public TypeContext t;
		public ExpContext e1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewExpArrContext(NewExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExpArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExprArrInitContext extends NewExpContext {
		public TypeContext t;
		public ArrayInitContext e1;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public NewExprArrInitContext(NewExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExprArrInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpIDContext extends NewExpContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public NewExpIDContext(NewExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExpID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpContext newExp() throws RecognitionException {
		NewExpContext _localctx = new NewExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_newExp);
		try {
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new NewExpIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440); match(T__46);
				setState(441); match(ID);
				setState(442); match(T__24);
				setState(443); match(T__2);
				}
				break;
			case 2:
				_localctx = new NewExpArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(T__46);
				setState(445); ((NewExpArrContext)_localctx).t = type();
				setState(446); match(T__16);
				setState(447); ((NewExpArrContext)_localctx).e1 = exp(0);
				setState(448); match(T__10);
				}
				break;
			case 3:
				_localctx = new NewExprArrInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(450); match(T__46);
				setState(451); ((NewExprArrInitContext)_localctx).t = type();
				setState(452); match(T__16);
				setState(453); match(T__10);
				setState(454); ((NewExprArrInitContext)_localctx).e1 = arrayInit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(T__37);
			setState(459); exp(0);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(460); match(T__22);
				setState(461); exp(0);
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldAccessExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccessExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldAccessExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessExpContext fieldAccessExp() throws RecognitionException {
		FieldAccessExpContext _localctx = new FieldAccessExpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fieldAccessExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(T__20);
			setState(470); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessExpContext extends ParserRuleContext {
		public ExpContext index;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArrayAccessExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayAccessExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessExpContext arrayAccessExp() throws RecognitionException {
		ArrayAccessExpContext _localctx = new ArrayAccessExpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrayAccessExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(T__16);
			setState(473); ((ArrayAccessExpContext)_localctx).index = exp(0);
			setState(474); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 29: return exp_sempred((ExpContext)_localctx, predIndex);
		case 30: return literalExp_sempred((LiteralExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean literalExp_sempred(LiteralExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return  new java.math.BigInteger((((IntLitContext)_localctx).NUM!=null?((IntLitContext)_localctx).NUM.getText():null)).bitLength() < 32 ;
		}
		return true;
	}
	private boolean mainMethodDeclaration_sempred(MainMethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return  "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) ;
		case 1: return  "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) ;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 7);
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 11);
		case 6: return precpred(_ctx, 10);
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u01df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\5\7\u009d\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a9\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\5\n\u00b6"+
		"\n\n\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\5\f\u00be\n\f\3\r\3\r\3\r\7\r\u00c3"+
		"\n\r\f\r\16\r\u00c6\13\r\3\16\3\16\3\16\3\17\7\17\u00cc\n\17\f\17\16\17"+
		"\u00cf\13\17\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e3\n\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1\13"+
		"\23\3\23\3\23\3\23\3\23\7\23\u00f7\n\23\f\23\16\23\u00fa\13\23\3\23\5"+
		"\23\u00fd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0105\n\24\f\24\16\24"+
		"\u0108\13\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u0111\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0126\n\31\3\32\3\32\3\32\5\32\u012b\n\32\3\32"+
		"\3\32\5\32\u012f\n\32\3\32\3\32\5\32\u0133\n\32\3\32\3\32\3\32\7\32\u0138"+
		"\n\32\f\32\16\32\u013b\13\32\3\32\3\32\3\33\3\33\3\33\7\33\u0142\n\33"+
		"\f\33\16\33\u0145\13\33\3\34\3\34\3\34\7\34\u014a\n\34\f\34\16\34\u014d"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0155\n\35\3\36\3\36\3\36\7"+
		"\36\u015a\n\36\f\36\16\36\u015d\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016f\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0183\n\37\f\37\16\37\u0186\13\37\3 \3 \3 \3 \5 "+
		"\u018c\n \3!\3!\5!\u0190\n!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\5(\u01a3\n(\3(\3(\3(\5(\u01a8\n(\3(\3(\3)\3)\3)\7)\u01af"+
		"\n)\f)\16)\u01b2\13)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u01cb\n,\3-\3-\3-\3-\7-\u01d1\n-\f-\16-\u01d4\13"+
		"-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\2\3<\60\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\4\2+,\61\62\b\2"+
		"\3\3\17\20\33\33%%..\61\62\7\2\7\7\26\26!!#$**\4\2\t\t\16\16\u01e7\2a"+
		"\3\2\2\2\4m\3\2\2\2\6z\3\2\2\2\b\u0085\3\2\2\2\n\u008a\3\2\2\2\f\u009c"+
		"\3\2\2\2\16\u009e\3\2\2\2\20\u00a3\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3"+
		"\2\2\2\26\u00bd\3\2\2\2\30\u00bf\3\2\2\2\32\u00c7\3\2\2\2\34\u00cd\3\2"+
		"\2\2\36\u00d6\3\2\2\2 \u00e2\3\2\2\2\"\u00e4\3\2\2\2$\u00e7\3\2\2\2&\u00fe"+
		"\3\2\2\2(\u010b\3\2\2\2*\u010e\3\2\2\2,\u0114\3\2\2\2.\u0117\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u013e\3\2\2\2\66\u0146\3\2\2\28\u0154"+
		"\3\2\2\2:\u0156\3\2\2\2<\u016e\3\2\2\2>\u018b\3\2\2\2@\u018f\3\2\2\2B"+
		"\u0191\3\2\2\2D\u0194\3\2\2\2F\u0196\3\2\2\2H\u0198\3\2\2\2J\u019a\3\2"+
		"\2\2L\u019c\3\2\2\2N\u01a2\3\2\2\2P\u01ab\3\2\2\2R\u01b3\3\2\2\2T\u01b5"+
		"\3\2\2\2V\u01ca\3\2\2\2X\u01cc\3\2\2\2Z\u01d7\3\2\2\2\\\u01da\3\2\2\2"+
		"^`\5\6\4\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2"+
		"dh\5\4\3\2eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2kl\7\2\2\3l\3\3\2\2\2mn\7)\2\2no\7\b\2\2op\7\63\2\2pq\7\r\2"+
		"\2qu\5\n\6\2rt\5\f\7\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2"+
		"\2wu\3\2\2\2xy\7\22\2\2y\5\3\2\2\2z{\7\b\2\2{|\7\63\2\2|\u0080\7\r\2\2"+
		"}\177\5\b\5\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\7\3\2\2\2\u0085\u0086\7)\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\63\2"+
		"\2\u0088\u0089\7\f\2\2\u0089\t\3\2\2\2\u008a\u008b\7)\2\2\u008b\u008c"+
		"\7-\2\2\u008c\u008d\7\13\2\2\u008d\u008e\7\63\2\2\u008e\u008f\6\6\2\3"+
		"\u008f\u0090\7\32\2\2\u0090\u0091\7\63\2\2\u0091\u0092\6\6\3\3\u0092\u0093"+
		"\7\"\2\2\u0093\u0094\7(\2\2\u0094\u0095\7\63\2\2\u0095\u0096\7\60\2\2"+
		"\u0096\u0097\7\r\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\22\2\2\u0099"+
		"\13\3\2\2\2\u009a\u009d\5\16\b\2\u009b\u009d\5\20\t\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\r\3\2\2\2\u009e\u009f\7-\2\2\u009f\u00a0"+
		"\5\22\n\2\u00a0\u00a1\7\63\2\2\u00a1\u00a2\7\f\2\2\u00a2\17\3\2\2\2\u00a3"+
		"\u00a4\7-\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\63\2\2\u00a6\u00a8\7"+
		"\32\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\5"+
		"\34\17\2\u00ad\u00ae\7\22\2\2\u00ae\21\3\2\2\2\u00af\u00b2\5\24\13\2\u00b0"+
		"\u00b2\7\63\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b6\7(\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00ba\7\37\2\2\u00b8\u00ba\7\27"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00be"+
		"\7\13\2\2\u00bc\u00be\5\22\n\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\27\3\2\2\2\u00bf\u00c4\5\32\16\2\u00c0\u00c1\7\34\2\2\u00c1\u00c3"+
		"\5\32\16\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\5\22\n\2\u00c8\u00c9\7\63\2\2\u00c9\33\3\2\2\2\u00ca\u00cc\5\36\20\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5 \21\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\35\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\5\22\n\2\u00d7\u00d8"+
		"\7\63\2\2\u00d8\u00d9\7\f\2\2\u00d9\37\3\2\2\2\u00da\u00e3\5\"\22\2\u00db"+
		"\u00e3\5$\23\2\u00dc\u00e3\5&\24\2\u00dd\u00e3\5(\25\2\u00de\u00e3\5*"+
		"\26\2\u00df\u00e3\5\62\32\2\u00e0\u00e3\5:\36\2\u00e1\u00e3\5,\27\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e5\5.\30\2\u00e5\u00e6\7\f\2\2"+
		"\u00e6#\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea"+
		"\5<\37\2\u00ea\u00eb\7\60\2\2\u00eb\u00ef\7\r\2\2\u00ec\u00ee\5 \21\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00fc\7\22\2\2"+
		"\u00f3\u00f4\7/\2\2\u00f4\u00f8\7\r\2\2\u00f5\u00f7\5 \21\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\22\2\2\u00fc\u00f3\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd%\3\2\2\2\u00fe\u00ff\7\n\2\2\u00ff\u0100"+
		"\7\32\2\2\u0100\u0101\5<\37\2\u0101\u0102\7\60\2\2\u0102\u0106\7\r\2\2"+
		"\u0103\u0105\5 \21\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\22\2\2\u010a\'\3\2\2\2\u010b\u010c\5N(\2\u010c\u010d\7\f\2\2"+
		"\u010d)\3\2\2\2\u010e\u0110\7\6\2\2\u010f\u0111\5<\37\2\u0110\u010f\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\f\2\2\u0113"+
		"+\3\2\2\2\u0114\u0115\58\35\2\u0115\u0116\7\f\2\2\u0116-\3\2\2\2\u0117"+
		"\u0118\5\60\31\2\u0118\u0119\7\21\2\2\u0119\u011a\5<\37\2\u011a/\3\2\2"+
		"\2\u011b\u0126\7\63\2\2\u011c\u011d\5<\37\2\u011d\u011e\7\36\2\2\u011e"+
		"\u011f\7\63\2\2\u011f\u0126\3\2\2\2\u0120\u0121\5<\37\2\u0121\u0122\7"+
		"\"\2\2\u0122\u0123\5<\37\2\u0123\u0124\7(\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0120\3\2\2\2\u0126\61\3\2\2"+
		"\2\u0127\u0128\7\23\2\2\u0128\u012a\7\32\2\2\u0129\u012b\5\64\33\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\f"+
		"\2\2\u012d\u012f\5<\37\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\7\f\2\2\u0131\u0133\5\66\34\2\u0132\u0131\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\60\2\2\u0135"+
		"\u0139\7\r\2\2\u0136\u0138\5 \21\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\7\22\2\2\u013d\63\3\2\2\2\u013e\u0143\5.\30"+
		"\2\u013f\u0140\7\34\2\2\u0140\u0142\5.\30\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\65\3\2\2"+
		"\2\u0145\u0143\3\2\2\2\u0146\u014b\58\35\2\u0147\u0148\7\34\2\2\u0148"+
		"\u014a\58\35\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\67\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\5\60\31\2\u014f\u0150\7\'\2\2\u0150\u0155\3\2\2\2\u0151\u0152\5\60\31"+
		"\2\u0152\u0153\7&\2\2\u0153\u0155\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0151"+
		"\3\2\2\2\u01559\3\2\2\2\u0156\u0157\7\31\2\2\u0157\u015b\7\r\2\2\u0158"+
		"\u015a\5 \21\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\7\22\2\2\u015f\u0160\7\n\2\2\u0160\u0161\7\32\2\2\u0161\u0162\5"+
		"<\37\2\u0162\u0163\7\60\2\2\u0163\u0164\7\f\2\2\u0164;\3\2\2\2\u0165\u0166"+
		"\b\37\1\2\u0166\u0167\5D#\2\u0167\u0168\5<\37\n\u0168\u016f\3\2\2\2\u0169"+
		"\u016f\5> \2\u016a\u016f\5L\'\2\u016b\u016f\5N(\2\u016c\u016f\5R*\2\u016d"+
		"\u016f\5V,\2\u016e\u0165\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2"+
		"\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0184"+
		"\3\2\2\2\u0170\u0171\f\t\2\2\u0171\u0172\5F$\2\u0172\u0173\5<\37\n\u0173"+
		"\u0183\3\2\2\2\u0174\u0175\f\b\2\2\u0175\u0176\5H%\2\u0176\u0177\5<\37"+
		"\t\u0177\u0183\3\2\2\2\u0178\u0179\f\7\2\2\u0179\u017a\5J&\2\u017a\u017b"+
		"\5<\37\b\u017b\u0183\3\2\2\2\u017c\u017d\f\r\2\2\u017d\u0183\5\\/\2\u017e"+
		"\u017f\f\f\2\2\u017f\u0183\5Z.\2\u0180\u0181\f\3\2\2\u0181\u0183\5T+\2"+
		"\u0182\u0170\3\2\2\2\u0182\u0174\3\2\2\2\u0182\u0178\3\2\2\2\u0182\u017c"+
		"\3\2\2\2\u0182\u017e\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185=\3\2\2\2\u0186\u0184\3\2\2\2"+
		"\u0187\u018c\5@!\2\u0188\u0189\7\64\2\2\u0189\u018c\6 \n\3\u018a\u018c"+
		"\7\30\2\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018a\3\2\2\2"+
		"\u018c?\3\2\2\2\u018d\u0190\7\5\2\2\u018e\u0190\7\35\2\2\u018f\u018d\3"+
		"\2\2\2\u018f\u018e\3\2\2\2\u0190A\3\2\2\2\u0191\u0192\5D#\2\u0192\u0193"+
		"\5<\37\2\u0193C\3\2\2\2\u0194\u0195\t\2\2\2\u0195E\3\2\2\2\u0196\u0197"+
		"\t\3\2\2\u0197G\3\2\2\2\u0198\u0199\t\4\2\2\u0199I\3\2\2\2\u019a\u019b"+
		"\t\5\2\2\u019bK\3\2\2\2\u019c\u019d\7\32\2\2\u019d\u019e\5<\37\2\u019e"+
		"\u019f\7\60\2\2\u019fM\3\2\2\2\u01a0\u01a1\7\63\2\2\u01a1\u01a3\7\36\2"+
		"\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\7\63\2\2\u01a5\u01a7\7\32\2\2\u01a6\u01a8\5P)\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\60\2\2\u01aaO\3\2\2\2"+
		"\u01ab\u01b0\5<\37\2\u01ac\u01ad\7\34\2\2\u01ad\u01af\5<\37\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"Q\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7\63\2\2\u01b4S\3\2\2\2\u01b5"+
		"\u01b6\7\25\2\2\u01b6\u01b7\5<\37\2\u01b7\u01b8\7 \2\2\u01b8\u01b9\5<"+
		"\37\2\u01b9U\3\2\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01bc\7\63\2\2\u01bc\u01bd"+
		"\7\32\2\2\u01bd\u01cb\7\60\2\2\u01be\u01bf\7\4\2\2\u01bf\u01c0\5\22\n"+
		"\2\u01c0\u01c1\7\"\2\2\u01c1\u01c2\5<\37\2\u01c2\u01c3\7(\2\2\u01c3\u01cb"+
		"\3\2\2\2\u01c4\u01c5\7\4\2\2\u01c5\u01c6\5\22\n\2\u01c6\u01c7\7\"\2\2"+
		"\u01c7\u01c8\7(\2\2\u01c8\u01c9\5X-\2\u01c9\u01cb\3\2\2\2\u01ca\u01ba"+
		"\3\2\2\2\u01ca\u01be\3\2\2\2\u01ca\u01c4\3\2\2\2\u01cbW\3\2\2\2\u01cc"+
		"\u01cd\7\r\2\2\u01cd\u01d2\5<\37\2\u01ce\u01cf\7\34\2\2\u01cf\u01d1\5"+
		"<\37\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7\22"+
		"\2\2\u01d6Y\3\2\2\2\u01d7\u01d8\7\36\2\2\u01d8\u01d9\7\63\2\2\u01d9[\3"+
		"\2\2\2\u01da\u01db\7\"\2\2\u01db\u01dc\5<\37\2\u01dc\u01dd\7(\2\2\u01dd"+
		"]\3\2\2\2(ahu\u0080\u009c\u00a8\u00b1\u00b5\u00b9\u00bd\u00c4\u00cd\u00d3"+
		"\u00e2\u00ef\u00f8\u00fc\u0106\u0110\u0125\u012a\u012e\u0132\u0139\u0143"+
		"\u014b\u0154\u015b\u016e\u0182\u0184\u018b\u018f\u01a2\u01a7\u01b0\u01ca"+
		"\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}