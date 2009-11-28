// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/dannluciano/Sources/MyLanguage/expr.g 2009-11-28 04:29:34

	import java.util.HashMap;
	import java.util.Stack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class exprParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PRINT", "ID", "ATT", "SUB", "SUM", "LENGTH", "STRING", "DOT", "LET", "IN", "VAR", "IF", "LPAREN", "RPAREN", "THEN", "ELSE", "LT", "EQ", "GT", "NE", "MUL", "DIV", "INT", "FUNC", "LETTER", "DIGIT", "GE", "LE", "WS", "';'", "','"
    };
    public static final int GE=30;
    public static final int LT=20;
    public static final int LETTER=28;
    public static final int ELSE=19;
    public static final int SUB=7;
    public static final int INT=26;
    public static final int ID=5;
    public static final int SUM=8;
    public static final int EOF=-1;
    public static final int MUL=24;
    public static final int PRINT=4;
    public static final int ATT=6;
    public static final int LENGTH=9;
    public static final int LPAREN=16;
    public static final int IF=15;
    public static final int RPAREN=17;
    public static final int WS=32;
    public static final int T__33=33;
    public static final int THEN=18;
    public static final int T__34=34;
    public static final int IN=13;
    public static final int FUNC=27;
    public static final int GT=22;
    public static final int VAR=14;
    public static final int DIGIT=29;
    public static final int DIV=25;
    public static final int EQ=21;
    public static final int DOT=11;
    public static final int LE=31;
    public static final int LET=12;
    public static final int STRING=10;
    public static final int NE=23;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "expr_rel", "program", "list_cmd", "expr_let", "expr_length", 
        "fator", "cmd", "list_dec", "termo", "dec_func", "cmd_print", "expr", 
        "expr_concat", "cmd_att", "expr_if", "dec_var"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public exprParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public exprParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public exprParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return exprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/dannluciano/Sources/MyLanguage/expr.g"; }


    	Stack<HashMap<String, Object>> memoria = new Stack<HashMap<String, Object>>();

    	void adicionaId(String nomeID, Object valor ){
    		memoria.peek().put(nomeID, valor);
    	}
    	
    	void printStack(){
    		Stack<HashMap> auxStack = (Stack<HashMap>) memoria.clone();
    		HashMap<String, Object> aux;
    		int count = 0;
    		while(auxStack.empty() == false ){
    			System.out.println("Pilha "+ count);
    			aux = auxStack.pop();
    			for (Object object : aux.values()) {
    				System.out.println(object);
    			}
    			count++;
    		}
    	}

    	Object getIdValue(String nomeId){
    		Stack<HashMap> aux = (Stack<HashMap>) memoria.clone();
    		Object object = null;
    		while(object == null){
    			if ( aux.empty() ){
    				System.out.println("Objeto nao encontrado");
    				//System.exit(0);
    				// PQ?????
    			}
    			object =  aux.peek().get(nomeId);
    			aux.pop();
    		}
    		return object;
    	}



    // $ANTLR start "program"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:45:1: program : list_cmd ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:45:9: ( list_cmd )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:45:11: list_cmd
            {
            dbg.location(45,11);
            pushFollow(FOLLOW_list_cmd_in_program22);
            list_cmd();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(45, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "list_cmd"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:47:1: list_cmd : ( cmd )+ ;
    public final void list_cmd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "list_cmd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:48:2: ( ( cmd )+ )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:49:3: ( cmd )+
            {
            dbg.location(49,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:49:3: ( cmd )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=PRINT && LA1_0<=ID)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:49:3: cmd
            	    {
            	    dbg.location(49,3);
            	    pushFollow(FOLLOW_cmd_in_list_cmd33);
            	    cmd();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(50, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list_cmd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "list_cmd"


    // $ANTLR start "cmd"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:52:1: cmd : ( cmd_att | cmd_print ) ';' ;
    public final void cmd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cmd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:52:5: ( ( cmd_att | cmd_print ) ';' )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:53:3: ( cmd_att | cmd_print ) ';'
            {
            dbg.location(53,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:53:3: ( cmd_att | cmd_print )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==PRINT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:53:4: cmd_att
                    {
                    dbg.location(53,4);
                    pushFollow(FOLLOW_cmd_att_in_cmd47);
                    cmd_att();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:53:12: cmd_print
                    {
                    dbg.location(53,12);
                    pushFollow(FOLLOW_cmd_print_in_cmd49);
                    cmd_print();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(53,22);
            match(input,33,FOLLOW_33_in_cmd51); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(54, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cmd"


    // $ANTLR start "cmd_print"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:56:1: cmd_print : PRINT e= expr ;
    public final void cmd_print() throws RecognitionException {
        Object e = null;


        try { dbg.enterRule(getGrammarFileName(), "cmd_print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:57:2: ( PRINT e= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:58:3: PRINT e= expr
            {
            dbg.location(58,3);
            match(input,PRINT,FOLLOW_PRINT_in_cmd_print64); 
            dbg.location(58,10);
            pushFollow(FOLLOW_expr_in_cmd_print68);
            e=expr();

            state._fsp--;

            dbg.location(58,16);
            System.out.println(e);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(59, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmd_print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cmd_print"


    // $ANTLR start "cmd_att"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:61:1: cmd_att : i= ID ATT e= expr ;
    public final void cmd_att() throws RecognitionException {
        Token i=null;
        Object e = null;


        try { dbg.enterRule(getGrammarFileName(), "cmd_att");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:61:9: (i= ID ATT e= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:62:2: i= ID ATT e= expr
            {
            dbg.location(62,3);
            i=(Token)match(input,ID,FOLLOW_ID_in_cmd_att83); 
            dbg.location(62,7);
            match(input,ATT,FOLLOW_ATT_in_cmd_att85); 
            dbg.location(62,12);
            pushFollow(FOLLOW_expr_in_cmd_att89);
            e=expr();

            state._fsp--;

            dbg.location(62,17);
            adicionaId(i.getText(), e);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmd_att");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cmd_att"


    // $ANTLR start "expr"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:65:1: expr returns [Object valor] : (t1= termo ( (op= ( SUB | SUM ) t2= termo ) )* | e= expr_if | e= expr_let | e= expr_length | e= expr_concat );
    public final Object expr() throws RecognitionException {
        Object valor = null;

        Token op=null;
        Object t1 = null;

        Object t2 = null;

        Object e = null;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:66:2: (t1= termo ( (op= ( SUB | SUM ) t2= termo ) )* | e= expr_if | e= expr_let | e= expr_length | e= expr_concat )
            int alt4=5;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case ID:
            case LPAREN:
            case INT:
                {
                alt4=1;
                }
                break;
            case STRING:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==DOT) ) {
                    alt4=5;
                }
                else if ( ((LA4_2>=SUB && LA4_2<=SUM)||LA4_2==IN||LA4_2==RPAREN||(LA4_2>=ELSE && LA4_2<=DIV)||(LA4_2>=33 && LA4_2<=34)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt4=2;
                }
                break;
            case LET:
                {
                alt4=3;
                }
                break;
            case LENGTH:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:66:4: t1= termo ( (op= ( SUB | SUM ) t2= termo ) )*
                    {
                    dbg.location(66,6);
                    pushFollow(FOLLOW_termo_in_expr107);
                    t1=termo();

                    state._fsp--;

                    dbg.location(66,13);
                    valor = t1;
                    dbg.location(67,4);
                    // /Users/dannluciano/Sources/MyLanguage/expr.g:67:4: ( (op= ( SUB | SUM ) t2= termo ) )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=2;
                        try { dbg.enterDecision(3);

                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=SUB && LA3_0<=SUM)) ) {
                            alt3=1;
                        }


                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:67:5: (op= ( SUB | SUM ) t2= termo )
                    	    {
                    	    dbg.location(67,5);
                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:67:5: (op= ( SUB | SUM ) t2= termo )
                    	    dbg.enterAlt(1);

                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:67:7: op= ( SUB | SUM ) t2= termo
                    	    {
                    	    dbg.location(67,10);
                    	    op=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=SUB && input.LA(1)<=SUM) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        dbg.recognitionException(mse);
                    	        throw mse;
                    	    }

                    	    dbg.location(67,25);
                    	    pushFollow(FOLLOW_termo_in_expr131);
                    	    t2=termo();

                    	    state._fsp--;

                    	    dbg.location(67,33);

                    	    		 	if (op.getText().equals("+"))
                    	    		 		valor = (Integer)valor + (Integer)t2;
                    	    		 	else if (op.getText().equals("-"))
                    	    		 		valor = (Integer)valor - (Integer)t2;
                    	    		 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:74:6: e= expr_if
                    {
                    dbg.location(74,8);
                    pushFollow(FOLLOW_expr_if_in_expr152);
                    e=expr_if();

                    state._fsp--;

                    dbg.location(74,18);
                    valor = e;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:75:6: e= expr_let
                    {
                    dbg.location(75,8);
                    pushFollow(FOLLOW_expr_let_in_expr165);
                    e=expr_let();

                    state._fsp--;

                    dbg.location(75,19);
                    valor = e;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:76:6: e= expr_length
                    {
                    dbg.location(76,8);
                    pushFollow(FOLLOW_expr_length_in_expr178);
                    e=expr_length();

                    state._fsp--;

                    dbg.location(76,22);
                    valor = e;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:77:6: e= expr_concat
                    {
                    dbg.location(77,8);
                    pushFollow(FOLLOW_expr_concat_in_expr191);
                    e=expr_concat();

                    state._fsp--;

                    dbg.location(77,22);
                    valor = e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(78, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr"


    // $ANTLR start "expr_length"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:80:1: expr_length returns [Object valor] : LENGTH s= STRING ;
    public final Object expr_length() throws RecognitionException {
        Object valor = null;

        Token s=null;

        try { dbg.enterRule(getGrammarFileName(), "expr_length");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:81:2: ( LENGTH s= STRING )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:81:4: LENGTH s= STRING
            {
            dbg.location(81,4);
            match(input,LENGTH,FOLLOW_LENGTH_in_expr_length208); 
            dbg.location(81,12);
            s=(Token)match(input,STRING,FOLLOW_STRING_in_expr_length212); 
            dbg.location(81,20);
            valor = s.getText().substring(1,(s.getText().length()-1)).length();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(82, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_length");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_length"


    // $ANTLR start "expr_concat"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:84:1: expr_concat returns [Object valor] : s1= STRING DOT s2= STRING ;
    public final Object expr_concat() throws RecognitionException {
        Object valor = null;

        Token s1=null;
        Token s2=null;

        try { dbg.enterRule(getGrammarFileName(), "expr_concat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:85:2: (s1= STRING DOT s2= STRING )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:85:4: s1= STRING DOT s2= STRING
            {
            dbg.location(85,6);
            s1=(Token)match(input,STRING,FOLLOW_STRING_in_expr_concat231); 
            dbg.location(85,14);
            match(input,DOT,FOLLOW_DOT_in_expr_concat233); 
            dbg.location(85,20);
            s2=(Token)match(input,STRING,FOLLOW_STRING_in_expr_concat237); 
            dbg.location(85,27);
            valor = s1.getText() + s2.getText();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(86, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_concat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_concat"


    // $ANTLR start "expr_let"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:88:1: expr_let returns [Object valor] : LET ( list_dec ) IN e= expr ;
    public final Object expr_let() throws RecognitionException {
        Object valor = null;

        Object e = null;


        try { dbg.enterRule(getGrammarFileName(), "expr_let");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:89:2: ( LET ( list_dec ) IN e= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:89:5: LET ( list_dec ) IN e= expr
            {
            dbg.location(89,5);
            match(input,LET,FOLLOW_LET_in_expr_let254); 
            dbg.location(89,9);
            memoria.push(new HashMap<String, Object>());
            dbg.location(90,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:90:3: ( list_dec )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:90:4: list_dec
            {
            dbg.location(90,4);
            pushFollow(FOLLOW_list_dec_in_expr_let261);
            list_dec();

            state._fsp--;


            }

            dbg.location(90,14);
            match(input,IN,FOLLOW_IN_in_expr_let264); 
            dbg.location(90,19);
            pushFollow(FOLLOW_expr_in_expr_let270);
            e=expr();

            state._fsp--;

            dbg.location(90,26);
             valor = e; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(91, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_let");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_let"


    // $ANTLR start "list_dec"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:93:1: list_dec : ( dec_var | dec_func );
    public final void list_dec() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "list_dec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:94:2: ( dec_var | dec_func )
            int alt5=2;
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==VAR) ) {
                alt5=1;
            }
            else if ( (LA5_0==IN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:94:4: dec_var
                    {
                    dbg.location(94,4);
                    pushFollow(FOLLOW_dec_var_in_list_dec283);
                    dec_var();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:94:14: dec_func
                    {
                    dbg.location(94,14);
                    pushFollow(FOLLOW_dec_func_in_list_dec287);
                    dec_func();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(94, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list_dec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "list_dec"


    // $ANTLR start "dec_func"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:96:1: dec_func : ;
    public final void dec_func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dec_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:97:2: ()
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:98:2: 
            {
            }

        }
        finally {
        }
        dbg.location(98, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dec_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dec_func"


    // $ANTLR start "dec_var"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:100:1: dec_var : VAR cmd_att ( ',' cmd_att )* ;
    public final void dec_var() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dec_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:101:2: ( VAR cmd_att ( ',' cmd_att )* )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:101:4: VAR cmd_att ( ',' cmd_att )*
            {
            dbg.location(101,4);
            match(input,VAR,FOLLOW_VAR_in_dec_var306); 
            dbg.location(101,8);
            pushFollow(FOLLOW_cmd_att_in_dec_var308);
            cmd_att();

            state._fsp--;

            dbg.location(101,16);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:101:16: ( ',' cmd_att )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:101:17: ',' cmd_att
            	    {
            	    dbg.location(101,17);
            	    match(input,34,FOLLOW_34_in_dec_var311); 
            	    dbg.location(101,21);
            	    pushFollow(FOLLOW_cmd_att_in_dec_var313);
            	    cmd_att();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(102, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dec_var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dec_var"


    // $ANTLR start "expr_if"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:104:1: expr_if returns [Object valor] : IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr ;
    public final Object expr_if() throws RecognitionException {
        Object valor = null;

        boolean bool = false;

        Object e1 = null;

        Object e2 = null;


        try { dbg.enterRule(getGrammarFileName(), "expr_if");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:105:2: ( IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:105:4: IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr
            {
            dbg.location(105,4);
            match(input,IF,FOLLOW_IF_in_expr_if330); 
            dbg.location(105,7);
            match(input,LPAREN,FOLLOW_LPAREN_in_expr_if332); 
            dbg.location(105,19);
            pushFollow(FOLLOW_expr_rel_in_expr_if338);
            bool=expr_rel();

            state._fsp--;

            dbg.location(105,31);
            match(input,RPAREN,FOLLOW_RPAREN_in_expr_if341); 
            dbg.location(105,38);
            match(input,THEN,FOLLOW_THEN_in_expr_if343); 
            dbg.location(105,46);
            pushFollow(FOLLOW_expr_in_expr_if349);
            e1=expr();

            state._fsp--;

            dbg.location(105,53);
            match(input,ELSE,FOLLOW_ELSE_in_expr_if351); 
            dbg.location(105,61);
            pushFollow(FOLLOW_expr_in_expr_if357);
            e2=expr();

            state._fsp--;

            dbg.location(106,3);

            			if (bool) { valor = e1;}
            			else { valor = e2;}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(110, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_if");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_if"


    // $ANTLR start "expr_rel"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:112:1: expr_rel returns [boolean valor] : e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr ;
    public final boolean expr_rel() throws RecognitionException {
        boolean valor = false;

        Token oprel=null;
        Object e1 = null;

        Object e2 = null;


        try { dbg.enterRule(getGrammarFileName(), "expr_rel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:113:2: (e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:113:4: e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr
            {
            dbg.location(113,7);
            pushFollow(FOLLOW_expr_in_expr_rel380);
            e1=expr();

            state._fsp--;

            dbg.location(113,20);
            oprel=(Token)input.LT(1);
            if ( (input.LA(1)>=LT && input.LA(1)<=NE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(113,47);
            pushFollow(FOLLOW_expr_in_expr_rel408);
            e2=expr();

            state._fsp--;

            dbg.location(114,3);

            			if (oprel.getText().equals("==") )
            				valor = (Integer) e1 == (Integer) e2;
            			else if (oprel.getText().equals("!=") )
            				valor = (Integer) e1 != (Integer) e2;
            			else if (oprel.getText().equals(">") )
            				valor = (Integer) e1 > (Integer) e2;
            			else if (oprel.getText().equals("<") )
            				valor = (Integer) e1 < (Integer) e2;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(124, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_rel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_rel"


    // $ANTLR start "termo"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:126:1: termo returns [Object valor] : f1= fator ( (op= ( MUL | DIV ) f2= fator ) )* ;
    public final Object termo() throws RecognitionException {
        Object valor = null;

        Token op=null;
        Object f1 = null;

        Object f2 = null;


        try { dbg.enterRule(getGrammarFileName(), "termo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:127:2: (f1= fator ( (op= ( MUL | DIV ) f2= fator ) )* )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:127:4: f1= fator ( (op= ( MUL | DIV ) f2= fator ) )*
            {
            dbg.location(127,7);
            pushFollow(FOLLOW_fator_in_termo431);
            f1=fator();

            state._fsp--;

            dbg.location(127,15);
            valor = f1;
            dbg.location(128,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:128:3: ( (op= ( MUL | DIV ) f2= fator ) )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MUL && LA7_0<=DIV)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:128:4: (op= ( MUL | DIV ) f2= fator )
            	    {
            	    dbg.location(128,4);
            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:128:4: (op= ( MUL | DIV ) f2= fator )
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:128:6: op= ( MUL | DIV ) f2= fator
            	    {
            	    dbg.location(128,9);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(128,26);
            	    pushFollow(FOLLOW_fator_in_termo456);
            	    f2=fator();

            	    state._fsp--;

            	    dbg.location(128,34);

            	    		 	if (op.getText().equals( "*"))
            	    		 		valor = (Integer)valor * (Integer)f2;
            	    		 	else if (op.getText().equals( "/"))
            	    		 		valor = (Integer)valor / (Integer)f2;
            	    		 

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(135, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "termo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "termo"


    // $ANTLR start "fator"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:137:1: fator returns [Object valor] : ( LPAREN e= expr RPAREN | i= INT | i= ID | s= STRING );
    public final Object fator() throws RecognitionException {
        Object valor = null;

        Token i=null;
        Token s=null;
        Object e = null;


        try { dbg.enterRule(getGrammarFileName(), "fator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:138:2: ( LPAREN e= expr RPAREN | i= INT | i= ID | s= STRING )
            int alt8=4;
            try { dbg.enterDecision(8);

            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt8=1;
                }
                break;
            case INT:
                {
                alt8=2;
                }
                break;
            case ID:
                {
                alt8=3;
                }
                break;
            case STRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:138:4: LPAREN e= expr RPAREN
                    {
                    dbg.location(138,4);
                    match(input,LPAREN,FOLLOW_LPAREN_in_fator483); 
                    dbg.location(138,13);
                    pushFollow(FOLLOW_expr_in_fator489);
                    e=expr();

                    state._fsp--;

                    dbg.location(138,20);
                    match(input,RPAREN,FOLLOW_RPAREN_in_fator491); 
                    dbg.location(138,27);
                    valor = e;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:139:6: i= INT
                    {
                    dbg.location(139,8);
                    i=(Token)match(input,INT,FOLLOW_INT_in_fator504); 
                    dbg.location(139,14);
                    valor = Integer.parseInt(i.getText());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:140:6: i= ID
                    {
                    dbg.location(140,8);
                    i=(Token)match(input,ID,FOLLOW_ID_in_fator517); 
                    dbg.location(140,13);
                    valor = getIdValue(i.getText()); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:142:6: s= STRING
                    {
                    dbg.location(142,8);
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_fator531); 
                    dbg.location(142,17);
                    valor = s.getText().substring(1,(s.getText().length()-1));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(143, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "fator"

    // Delegated rules


 

    public static final BitSet FOLLOW_list_cmd_in_program22 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cmd_in_list_cmd33 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_cmd_att_in_cmd47 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_cmd_print_in_cmd49 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_cmd51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_cmd_print64 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_cmd_print68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_cmd_att83 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ATT_in_cmd_att85 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_cmd_att89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termo_in_expr107 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_expr121 = new BitSet(new long[]{0x0000000004010420L});
    public static final BitSet FOLLOW_termo_in_expr131 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_expr_if_in_expr152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_let_in_expr165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_length_in_expr178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_concat_in_expr191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LENGTH_in_expr_length208 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_expr_length212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr_concat231 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_expr_concat233 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_expr_concat237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_expr_let254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_list_dec_in_expr_let261 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_IN_in_expr_let264 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_expr_let270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_list_dec283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_list_dec287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_dec_var306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cmd_att_in_dec_var308 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_dec_var311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_cmd_att_in_dec_var313 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IF_in_expr_if330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_if332 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_rel_in_expr_if338 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_if341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_THEN_in_expr_if343 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_expr_if349 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ELSE_in_expr_if351 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_expr_if357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_rel380 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_set_in_expr_rel386 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_expr_rel408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fator_in_termo431 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_set_in_termo444 = new BitSet(new long[]{0x0000000004010420L});
    public static final BitSet FOLLOW_fator_in_termo456 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_LPAREN_in_fator483 = new BitSet(new long[]{0x0000000004019620L});
    public static final BitSet FOLLOW_expr_in_fator489 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAREN_in_fator491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fator504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_fator531 = new BitSet(new long[]{0x0000000000000002L});

}