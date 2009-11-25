// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/dannluciano/Sources/MyLanguage/expr.g 2009-11-25 18:27:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class exprLexer extends Lexer {
    public static final int GE=26;
    public static final int LT=16;
    public static final int T__29=29;
    public static final int LETTER=24;
    public static final int ELSE=15;
    public static final int SUB=4;
    public static final int INT=22;
    public static final int SUM=5;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int MUL=20;
    public static final int ATT=10;
    public static final int LPAREN=12;
    public static final int IF=11;
    public static final int RPAREN=13;
    public static final int WS=28;
    public static final int THEN=14;
    public static final int IN=7;
    public static final int FUNC=23;
    public static final int GT=18;
    public static final int VAR=8;
    public static final int DIGIT=25;
    public static final int EQ=17;
    public static final int DIV=21;
    public static final int LET=6;
    public static final int LE=27;
    public static final int NE=19;

    // delegates
    // delegators

    public exprLexer() {;} 
    public exprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public exprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/dannluciano/Sources/MyLanguage/expr.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:3:7: ( ',' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:3:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:111:4: ( 'if' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:111:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:112:6: ( 'then' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:112:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:113:6: ( 'else' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:113:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:115:5: ( 'let' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:115:7: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:116:5: ( 'var' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:116:8: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:117:4: ( 'in' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:117:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:118:6: ( 'func' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:118:8: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ATT"
    public final void mATT() throws RecognitionException {
        try {
            int _type = ATT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:122:5: ( '=' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:122:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:123:4: ( LETTER ( LETTER | INT )* )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:123:6: LETTER ( LETTER | INT )*
            {
            mLETTER(); 
            // /Users/dannluciano/Sources/MyLanguage/expr.g:123:13: ( LETTER | INT )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:123:15: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:123:24: INT
            	    {
            	    mINT(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:125:8: ( 'a' .. 'z' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:125:10: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:127:7: ( '0' .. '9' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:127:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:128:4: ( '==' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:128:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:129:4: ( '!=' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:129:6: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:130:4: ( '>' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:130:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:131:4: ( '>=' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:131:6: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:132:4: ( '<' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:132:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:133:4: ( '<=' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:133:6: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:135:5: ( ( DIGIT )+ )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:135:7: ( DIGIT )+
            {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:135:7: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:135:7: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:137:5: ( '+' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:137:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:139:5: ( '-' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:139:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:141:5: ( '*' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:141:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:143:5: ( '/' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:143:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:145:8: ( '(' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:145:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:147:8: ( ')' )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:147:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dannluciano/Sources/MyLanguage/expr.g:149:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/dannluciano/Sources/MyLanguage/expr.g:149:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/dannluciano/Sources/MyLanguage/expr.g:1:8: ( T__29 | IF | THEN | ELSE | LET | VAR | IN | FUNC | ATT | ID | EQ | NE | GT | GE | LT | LE | INT | SUM | SUB | MUL | DIV | LPAREN | RPAREN | WS )
        int alt3=24;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:10: T__29
                {
                mT__29(); 

                }
                break;
            case 2 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:16: IF
                {
                mIF(); 

                }
                break;
            case 3 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:19: THEN
                {
                mTHEN(); 

                }
                break;
            case 4 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:24: ELSE
                {
                mELSE(); 

                }
                break;
            case 5 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:29: LET
                {
                mLET(); 

                }
                break;
            case 6 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:33: VAR
                {
                mVAR(); 

                }
                break;
            case 7 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:37: IN
                {
                mIN(); 

                }
                break;
            case 8 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:40: FUNC
                {
                mFUNC(); 

                }
                break;
            case 9 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:45: ATT
                {
                mATT(); 

                }
                break;
            case 10 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:49: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:52: EQ
                {
                mEQ(); 

                }
                break;
            case 12 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:55: NE
                {
                mNE(); 

                }
                break;
            case 13 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:58: GT
                {
                mGT(); 

                }
                break;
            case 14 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:61: GE
                {
                mGE(); 

                }
                break;
            case 15 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:64: LT
                {
                mLT(); 

                }
                break;
            case 16 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:67: LE
                {
                mLE(); 

                }
                break;
            case 17 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:70: INT
                {
                mINT(); 

                }
                break;
            case 18 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:74: SUM
                {
                mSUM(); 

                }
                break;
            case 19 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:78: SUB
                {
                mSUB(); 

                }
                break;
            case 20 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:82: MUL
                {
                mMUL(); 

                }
                break;
            case 21 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:86: DIV
                {
                mDIV(); 

                }
                break;
            case 22 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:90: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 23 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:97: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 24 :
                // /Users/dannluciano/Sources/MyLanguage/expr.g:1:104: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\2\uffff\6\11\1\35\2\uffff\1\37\1\41\10\uffff\1\42\1\43\5\11\10"+
        "\uffff\2\11\1\53\1\54\1\11\1\56\1\57\2\uffff\1\60\3\uffff";
    static final String DFA3_eofS =
        "\61\uffff";
    static final String DFA3_minS =
        "\1\11\1\uffff\1\146\1\150\1\154\1\145\1\141\1\165\1\75\2\uffff\2"+
        "\75\10\uffff\2\60\1\145\1\163\1\164\1\162\1\156\10\uffff\1\156\1"+
        "\145\2\60\1\143\2\60\2\uffff\1\60\3\uffff";
    static final String DFA3_maxS =
        "\1\172\1\uffff\1\156\1\150\1\154\1\145\1\141\1\165\1\75\2\uffff"+
        "\2\75\10\uffff\2\172\1\145\1\163\1\164\1\162\1\156\10\uffff\1\156"+
        "\1\145\2\172\1\143\2\172\2\uffff\1\172\3\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\7\uffff\1\12\1\14\2\uffff\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\7\uffff\1\13\1\11\1\16\1\15\1\20\1\17\1\2\1\7\7"+
        "\uffff\1\5\1\6\1\uffff\1\3\1\4\1\10";
    static final String DFA3_specialS =
        "\61\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\12\6\uffff\1\22\1\23\1\20"+
            "\1\16\1\1\1\17\1\uffff\1\21\12\15\2\uffff\1\14\1\10\1\13\42"+
            "\uffff\4\11\1\4\1\7\2\11\1\2\2\11\1\5\7\11\1\3\1\11\1\6\4\11",
            "",
            "\1\25\7\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\11\47\uffff\32\11",
            "\12\11\47\uffff\32\11",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\12\11\47\uffff\32\11",
            "\12\11\47\uffff\32\11",
            "\1\55",
            "\12\11\47\uffff\32\11",
            "\12\11\47\uffff\32\11",
            "",
            "",
            "\12\11\47\uffff\32\11",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | IF | THEN | ELSE | LET | VAR | IN | FUNC | ATT | ID | EQ | NE | GT | GE | LT | LE | INT | SUM | SUB | MUL | DIV | LPAREN | RPAREN | WS );";
        }
    }
 

}