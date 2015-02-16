// Generated from ExtendedStaticJava.g4 by ANTLR 4.4
package sjc.parser.extended;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExtendedStaticJavaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'"
	};
	public static final String[] ruleNames = {
		"T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", 
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"NUM", "WS", "ERROR"
	};


	public ExtendedStaticJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtendedStaticJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0126\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\7\62\u010f"+
		"\n\62\f\62\16\62\u0112\13\62\3\63\3\63\3\63\7\63\u0117\n\63\f\63\16\63"+
		"\u011a\13\63\5\63\u011c\n\63\3\64\6\64\u011f\n\64\r\64\16\64\u0120\3\64"+
		"\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66\3\2\5\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\u0129"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2"+
		"\2\7q\3\2\2\2\tv\3\2\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17\u0086\3\2\2\2"+
		"\21\u0089\3\2\2\2\23\u008f\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31"+
		"\u0098\3\2\2\2\33\u009b\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a3"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00a9\3\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2"+
		"+\u00b1\3\2\2\2-\u00b5\3\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf"+
		"\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2"+
		"\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00de"+
		"\3\2\2\2G\u00e0\3\2\2\2I\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00e9\3\2\2\2O"+
		"\u00eb\3\2\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00f6\3\2\2\2W\u00f8\3\2"+
		"\2\2Y\u00ff\3\2\2\2[\u0101\3\2\2\2]\u0106\3\2\2\2_\u0108\3\2\2\2a\u010a"+
		"\3\2\2\2c\u010c\3\2\2\2e\u011b\3\2\2\2g\u011e\3\2\2\2i\u0124\3\2\2\2k"+
		"l\7\61\2\2l\4\3\2\2\2mn\7p\2\2no\7g\2\2op\7y\2\2p\6\3\2\2\2qr\7v\2\2r"+
		"s\7t\2\2st\7w\2\2tu\7g\2\2u\b\3\2\2\2vw\7t\2\2wx\7g\2\2xy\7v\2\2yz\7w"+
		"\2\2z{\7t\2\2{|\7p\2\2|\n\3\2\2\2}~\7#\2\2~\177\7?\2\2\177\f\3\2\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7n\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2"+
		"\u0084\u0085\7u\2\2\u0085\16\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088\7"+
		"~\2\2\u0088\20\3\2\2\2\u0089\u008a\7y\2\2\u008a\u008b\7j\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e\22\3\2\2\2\u008f\u0090"+
		"\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093"+
		"\24\3\2\2\2\u0094\u0095\7=\2\2\u0095\26\3\2\2\2\u0096\u0097\7}\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7@\2\2\u009a\32\3\2\2\2\u009b"+
		"\u009c\7>\2\2\u009c\u009d\7>\2\2\u009d\34\3\2\2\2\u009e\u009f\7(\2\2\u009f"+
		"\u00a0\7(\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7\177\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2"+
		"\2\u00ab&\3\2\2\2\u00ac\u00ad\7A\2\2\u00ad(\3\2\2\2\u00ae\u00af\7>\2\2"+
		"\u00af\u00b0\7?\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2"+
		"\2\u00b3\u00b4\7v\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7"+
		"w\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7n\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7*\2\2\u00be\62"+
		"\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2"+
		"\66\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c88\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca"+
		":\3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2<\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6"+
		"\u00d7\7?\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7]\2\2\u00d9B\3\2\2\2\u00da\u00db"+
		"\7@\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7@\2\2\u00ddD\3\2\2\2\u00de\u00df"+
		"\7>\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2H\3"+
		"\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2\2\u00e5J\3\2\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7\u00e8\7-\2\2\u00e8L\3\2\2\2\u00e9\u00ea\7_\2\2\u00eaN\3"+
		"\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7d\2\2\u00ee"+
		"\u00ef\7n\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2\u00f1P\3\2\2\2\u00f2"+
		"\u00f3\7@\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7\u0080\2\2\u00f5T\3\2\2\2\u00f6"+
		"\u00f7\7#\2\2\u00f7V\3\2\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa"+
		"\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7e\2\2"+
		"\u00feX\3\2\2\2\u00ff\u0100\7\'\2\2\u0100Z\3\2\2\2\u0101\u0102\7g\2\2"+
		"\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\\\3\2"+
		"\2\2\u0106\u0107\7+\2\2\u0107^\3\2\2\2\u0108\u0109\7-\2\2\u0109`\3\2\2"+
		"\2\u010a\u010b\7/\2\2\u010bb\3\2\2\2\u010c\u0110\t\2\2\2\u010d\u010f\t"+
		"\3\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111d\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u011c\7\62\2\2"+
		"\u0114\u0118\4\63;\2\u0115\u0117\4\62;\2\u0116\u0115\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u0114\3\2\2\2\u011cf\3\2\2\2"+
		"\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\64\2\2"+
		"\u0123h\3\2\2\2\u0124\u0125\13\2\2\2\u0125j\3\2\2\2\7\2\u0110\u0118\u011b"+
		"\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}