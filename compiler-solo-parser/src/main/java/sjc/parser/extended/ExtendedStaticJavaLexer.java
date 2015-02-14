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
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, ID=38, INT=39, WS=40, 
		ERROR=41;
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
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "ID", "INT", "WS", "ERROR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'"+
		"\u00d8\n\'\f\'\16\'\u00db\13\'\3(\3(\3(\7(\u00e0\n(\f(\16(\u00e3\13(\5"+
		"(\u00e5\n(\3)\6)\u00e8\n)\r)\16)\u00e9\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+\3\2\5\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\""+
		"\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7\\\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\rl\3\2"+
		"\2\2\17o\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0081"+
		"\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0088\3\2\2\2!\u008b\3\2"+
		"\2\2#\u008f\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+\u009a"+
		"\3\2\2\2-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2"+
		"\2\65\u00af\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00bd"+
		"\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C\u00c8\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00d1\3\2\2\2K\u00d3\3\2\2\2M\u00d5\3\2\2\2O\u00e4\3\2"+
		"\2\2Q\u00e7\3\2\2\2S\u00ed\3\2\2\2UV\7\61\2\2V\4\3\2\2\2WX\7v\2\2XY\7"+
		"t\2\2YZ\7w\2\2Z[\7g\2\2[\6\3\2\2\2\\]\7t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2"+
		"\2`a\7t\2\2ab\7p\2\2b\b\3\2\2\2cd\7#\2\2de\7?\2\2e\n\3\2\2\2fg\7e\2\2"+
		"gh\7n\2\2hi\7c\2\2ij\7u\2\2jk\7u\2\2k\f\3\2\2\2lm\7~\2\2mn\7~\2\2n\16"+
		"\3\2\2\2op\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\20\3\2\2\2uv\7"+
		"=\2\2v\22\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7k\2\2z{\7f\2\2{\24\3\2\2\2|}\7"+
		"}\2\2}\26\3\2\2\2~\177\7(\2\2\177\u0080\7(\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7?\2\2\u0082\32\3\2\2\2\u0083\u0084\7\177\2\2\u0084\34\3\2\2\2"+
		"\u0085\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\36\3\2\2\2\u0088\u0089\7"+
		">\2\2\u0089\u008a\7?\2\2\u008a \3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7v\2\2\u008e\"\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7w\2\2\u0091\u0092\7n\2\2\u0092\u0093\7n\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7*\2\2\u0095&\3\2\2\2\u0096\u0097\7,\2\2\u0097(\3\2\2\2\u0098\u0099\7"+
		".\2\2\u0099*\3\2\2\2\u009a\u009b\7\60\2\2\u009b,\3\2\2\2\u009c\u009d\7"+
		"h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\62\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7>\2\2\u00b38\3\2\2\2\u00b4"+
		"\u00b5\7_\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7d\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7e\2\2"+
		"\u00bc<\3\2\2\2\u00bd\u00be\7@\2\2\u00be>\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0"+
		"@\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7e\2\2\u00c7B\3\2\2\2\u00c8"+
		"\u00c9\7\'\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0"+
		"H\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4L"+
		"\3\2\2\2\u00d5\u00d9\t\2\2\2\u00d6\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00daN\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00e5\7\62\2\2\u00dd\u00e1\4\63;\2\u00de\u00e0"+
		"\4\62;\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00dd\3\2\2\2\u00e5P\3\2\2\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b)\2\2\u00ecR\3\2\2\2\u00ed\u00ee\13\2\2\2"+
		"\u00eeT\3\2\2\2\7\2\u00d9\u00e1\u00e4\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}