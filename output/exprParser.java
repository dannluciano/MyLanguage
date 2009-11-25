// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/dannluciano/Sources/MyLanguage/expr.g 2009-11-25 18:27:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SUB", "SUM", "LET", "IN", "VAR", "ID", "ATT", "IF", "LPAREN", "RPAREN", "THEN", "ELSE", "LT", "EQ", "GT", "NE", "MUL", "DIV", "INT", "FUNC", "LETTER", "DIGIT", "GE", "LE", "WS", "','"
    };
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
    public static final int IN=7;
    public static final int THEN=14;
    public static final int FUNC=23;
    public static final int GT=18;
    public static final int VAR=8;
    public static final int DIGIT=25;
    public static final int DIV=21;
    public static final int EQ=17;
    public static final int LE=27;
    public static final int LET=6;
    public static final int NE=19;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "fator", "program", "list_dec", "dec_var", "expr", 
        "termo", "expr_let", "expr_rel", "expr_if", "dec_func"
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
    		HashMap<String, Object> escopo = memoria.peek();
    		escopo.put(nomeID, valor);
    	}

    	Object getIdValue(String nomeId){
    		Stack<HashMap> aux = (Stack<HashMap>) memoria.clone();
    		Object object = null;
    		while(object == null){
    			if ( aux.empty() ){
    				try {
    					throw new Exception();
    				} catch (Exception e) {
    					System.out.println("Objeto nao encontrado");
    				}
    			}
    			object =  aux.peek().get(nomeId);
    			aux.pop();
    		}
    		return object;
    	}



    // $ANTLR start "program"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:34:1: program : e= expr ;
    public final void program() throws RecognitionException {
        int e = 0;


        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:34:9: (e= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:34:11: e= expr
            {
            dbg.location(34,12);
            pushFollow(FOLLOW_expr_in_program24);
            e=expr();

            state._fsp--;

            dbg.location(34,18);
             System.out.println(e); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(35, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "expr"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:37:1: expr returns [int valor] : (t1= termo ( (op= ( SUB | SUM ) t2= termo ) )* | e= expr_if | e= expr_let );
    public final int expr() throws RecognitionException {
        int valor = 0;

        Token op=null;
        int t1 = 0;

        int t2 = 0;

        int e = 0;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:38:2: (t1= termo ( (op= ( SUB | SUM ) t2= termo ) )* | e= expr_if | e= expr_let )
            int alt2=3;
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
            case ID:
            case LPAREN:
            case INT:
                {
                alt2=1;
                }
                break;
            case IF:
                {
                alt2=2;
                }
                break;
            case LET:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:38:4: t1= termo ( (op= ( SUB | SUM ) t2= termo ) )*
                    {
                    dbg.location(38,6);
                    pushFollow(FOLLOW_termo_in_expr43);
                    t1=termo();

                    state._fsp--;

                    dbg.location(38,13);
                    valor = t1;
                    dbg.location(39,4);
                    // /Users/dannluciano/Sources/MyLanguage/expr.g:39:4: ( (op= ( SUB | SUM ) t2= termo ) )*
                    try { dbg.enterSubRule(1);

                    loop1:
                    do {
                        int alt1=2;
                        try { dbg.enterDecision(1);

                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SUB && LA1_0<=SUM)) ) {
                            alt1=1;
                        }


                        } finally {dbg.exitDecision(1);}

                        switch (alt1) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:39:5: (op= ( SUB | SUM ) t2= termo )
                    	    {
                    	    dbg.location(39,5);
                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:39:5: (op= ( SUB | SUM ) t2= termo )
                    	    dbg.enterAlt(1);

                    	    // /Users/dannluciano/Sources/MyLanguage/expr.g:39:7: op= ( SUB | SUM ) t2= termo
                    	    {
                    	    dbg.location(39,10);
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

                    	    dbg.location(39,25);
                    	    pushFollow(FOLLOW_termo_in_expr67);
                    	    t2=termo();

                    	    state._fsp--;

                    	    dbg.location(39,33);

                    	    		 	if (op.getText().equals("+"))
                    	    		 		valor+= t2;
                    	    		 	else if (op.getText().equals("-"))
                    	    		 		valor -= t2;
                    	    		 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:46:6: e= expr_if
                    {
                    dbg.location(46,8);
                    pushFollow(FOLLOW_expr_if_in_expr88);
                    e=expr_if();

                    state._fsp--;

                    dbg.location(46,18);
                    valor = e;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:47:6: e= expr_let
                    {
                    dbg.location(47,8);
                    pushFollow(FOLLOW_expr_let_in_expr101);
                    e=expr_let();

                    state._fsp--;

                    dbg.location(47,19);
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
        dbg.location(48, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr"


    // $ANTLR start "expr_let"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:50:1: expr_let returns [int valor] : LET ( list_dec ) IN e= expr ;
    public final int expr_let() throws RecognitionException {
        int valor = 0;

        int e = 0;


        try { dbg.enterRule(getGrammarFileName(), "expr_let");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:52:2: ( LET ( list_dec ) IN e= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:52:5: LET ( list_dec ) IN e= expr
            {
            dbg.location(52,5);
            match(input,LET,FOLLOW_LET_in_expr_let122); 
            dbg.location(52,9);
            memoria.push(new HashMap<String, Object>());
            dbg.location(53,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:53:3: ( list_dec )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:53:4: list_dec
            {
            dbg.location(53,4);
            pushFollow(FOLLOW_list_dec_in_expr_let129);
            list_dec();

            state._fsp--;


            }

            dbg.location(53,14);
            match(input,IN,FOLLOW_IN_in_expr_let132); 
            dbg.location(53,19);
            pushFollow(FOLLOW_expr_in_expr_let138);
            e=expr();

            state._fsp--;

            dbg.location(53,26);
             valor = e; 

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
            dbg.exitRule(getGrammarFileName(), "expr_let");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return valor;
    }
    // $ANTLR end "expr_let"


    // $ANTLR start "list_dec"
    // /Users/dannluciano/Sources/MyLanguage/expr.g:56:1: list_dec : ( dec_var | dec_func );
    public final void list_dec() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "list_dec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:57:2: ( dec_var | dec_func )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==IN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:57:4: dec_var
                    {
                    dbg.location(57,4);
                    pushFollow(FOLLOW_dec_var_in_list_dec151);
                    dec_var();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:57:14: dec_func
                    {
                    dbg.location(57,14);
                    pushFollow(FOLLOW_dec_func_in_list_dec155);
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
        dbg.location(57, 23);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:59:1: dec_func : ;
    public final void dec_func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dec_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:60:2: ()
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:61:2: 
            {
            }

        }
        finally {
        }
        dbg.location(61, 2);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:63:1: dec_var : VAR (i1= ID ATT e1= expr ) ( ',' i2= ID ATT e2= expr )* ;
    public final void dec_var() throws RecognitionException {
        Token i1=null;
        Token i2=null;
        int e1 = 0;

        int e2 = 0;


        try { dbg.enterRule(getGrammarFileName(), "dec_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:64:2: ( VAR (i1= ID ATT e1= expr ) ( ',' i2= ID ATT e2= expr )* )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:64:4: VAR (i1= ID ATT e1= expr ) ( ',' i2= ID ATT e2= expr )*
            {
            dbg.location(64,4);
            match(input,VAR,FOLLOW_VAR_in_dec_var174); 
            dbg.location(64,8);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:64:8: (i1= ID ATT e1= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:64:9: i1= ID ATT e1= expr
            {
            dbg.location(64,12);
            i1=(Token)match(input,ID,FOLLOW_ID_in_dec_var181); 
            dbg.location(64,17);
            match(input,ATT,FOLLOW_ATT_in_dec_var183); 
            dbg.location(64,24);
            pushFollow(FOLLOW_expr_in_dec_var189);
            e1=expr();

            state._fsp--;


            }

            dbg.location(64,31);

            			adicionaId(i1.getText(), new Integer(e1));
            		
            dbg.location(66,5);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:66:5: ( ',' i2= ID ATT e2= expr )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:66:6: ',' i2= ID ATT e2= expr
            	    {
            	    dbg.location(66,6);
            	    match(input,29,FOLLOW_29_in_dec_var194); 
            	    dbg.location(66,13);
            	    i2=(Token)match(input,ID,FOLLOW_ID_in_dec_var200); 
            	    dbg.location(66,18);
            	    match(input,ATT,FOLLOW_ATT_in_dec_var202); 
            	    dbg.location(66,25);
            	    pushFollow(FOLLOW_expr_in_dec_var208);
            	    e2=expr();

            	    state._fsp--;

            	    dbg.location(66,31);

            	    			adicionaId(i2.getText(), new Integer(e2));
            	    		

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(70, 2);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:72:1: expr_if returns [int valor] : IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr ;
    public final int expr_if() throws RecognitionException {
        int valor = 0;

        boolean bool = false;

        int e1 = 0;

        int e2 = 0;


        try { dbg.enterRule(getGrammarFileName(), "expr_if");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:73:2: ( IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:73:4: IF LPAREN bool= expr_rel RPAREN THEN e1= expr ELSE e2= expr
            {
            dbg.location(73,4);
            match(input,IF,FOLLOW_IF_in_expr_if229); 
            dbg.location(73,7);
            match(input,LPAREN,FOLLOW_LPAREN_in_expr_if231); 
            dbg.location(73,19);
            pushFollow(FOLLOW_expr_rel_in_expr_if237);
            bool=expr_rel();

            state._fsp--;

            dbg.location(73,31);
            match(input,RPAREN,FOLLOW_RPAREN_in_expr_if240); 
            dbg.location(73,38);
            match(input,THEN,FOLLOW_THEN_in_expr_if242); 
            dbg.location(73,46);
            pushFollow(FOLLOW_expr_in_expr_if248);
            e1=expr();

            state._fsp--;

            dbg.location(73,53);
            match(input,ELSE,FOLLOW_ELSE_in_expr_if250); 
            dbg.location(73,61);
            pushFollow(FOLLOW_expr_in_expr_if256);
            e2=expr();

            state._fsp--;

            dbg.location(74,3);

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
        dbg.location(78, 2);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:80:1: expr_rel returns [boolean valor] : e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr ;
    public final boolean expr_rel() throws RecognitionException {
        boolean valor = false;

        Token oprel=null;
        int e1 = 0;

        int e2 = 0;


        try { dbg.enterRule(getGrammarFileName(), "expr_rel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:81:2: (e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:81:4: e1= expr oprel= ( LT | EQ | GT | NE ) e2= expr
            {
            dbg.location(81,7);
            pushFollow(FOLLOW_expr_in_expr_rel279);
            e1=expr();

            state._fsp--;

            dbg.location(81,20);
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

            dbg.location(81,47);
            pushFollow(FOLLOW_expr_in_expr_rel307);
            e2=expr();

            state._fsp--;

            dbg.location(82,3);

            			if (oprel.getText().equals("==") )
            				valor = e1 == e2;
            			else if (oprel.getText().equals("!=") )
            				valor = e1 != e2;
            			else if (oprel.getText().equals(">") )
            				valor = e1 > e2;
            			else if (oprel.getText().equals("<") )
            				valor = e1 < e2;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(92, 2);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:94:1: termo returns [int valor] : f1= fator ( (op= ( MUL | DIV ) f2= fator ) )* ;
    public final int termo() throws RecognitionException {
        int valor = 0;

        Token op=null;
        int f1 = 0;

        int f2 = 0;


        try { dbg.enterRule(getGrammarFileName(), "termo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:95:2: (f1= fator ( (op= ( MUL | DIV ) f2= fator ) )* )
            dbg.enterAlt(1);

            // /Users/dannluciano/Sources/MyLanguage/expr.g:95:4: f1= fator ( (op= ( MUL | DIV ) f2= fator ) )*
            {
            dbg.location(95,7);
            pushFollow(FOLLOW_fator_in_termo330);
            f1=fator();

            state._fsp--;

            dbg.location(95,15);
            valor = f1;
            dbg.location(96,3);
            // /Users/dannluciano/Sources/MyLanguage/expr.g:96:3: ( (op= ( MUL | DIV ) f2= fator ) )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MUL && LA5_0<=DIV)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:96:4: (op= ( MUL | DIV ) f2= fator )
            	    {
            	    dbg.location(96,4);
            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:96:4: (op= ( MUL | DIV ) f2= fator )
            	    dbg.enterAlt(1);

            	    // /Users/dannluciano/Sources/MyLanguage/expr.g:96:6: op= ( MUL | DIV ) f2= fator
            	    {
            	    dbg.location(96,9);
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

            	    dbg.location(96,26);
            	    pushFollow(FOLLOW_fator_in_termo355);
            	    f2=fator();

            	    state._fsp--;

            	    dbg.location(96,34);

            	    		 	if (op.getText().equals( "*"))
            	    		 		valor = valor * f2;
            	    		 	else if (op.getText().equals( "/"))
            	    		 		valor = valor / f2;
            	    		 

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(103, 4);

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
    // /Users/dannluciano/Sources/MyLanguage/expr.g:105:1: fator returns [int valor] : ( LPAREN e= expr RPAREN | i= INT | i= ID );
    public final int fator() throws RecognitionException {
        int valor = 0;

        Token i=null;
        int e = 0;


        try { dbg.enterRule(getGrammarFileName(), "fator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /Users/dannluciano/Sources/MyLanguage/expr.g:106:2: ( LPAREN e= expr RPAREN | i= INT | i= ID )
            int alt6=3;
            try { dbg.enterDecision(6);

            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt6=1;
                }
                break;
            case INT:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:106:4: LPAREN e= expr RPAREN
                    {
                    dbg.location(106,4);
                    match(input,LPAREN,FOLLOW_LPAREN_in_fator382); 
                    dbg.location(106,13);
                    pushFollow(FOLLOW_expr_in_fator388);
                    e=expr();

                    state._fsp--;

                    dbg.location(106,20);
                    match(input,RPAREN,FOLLOW_RPAREN_in_fator390); 
                    dbg.location(106,27);
                    valor = e;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:107:6: i= INT
                    {
                    dbg.location(107,8);
                    i=(Token)match(input,INT,FOLLOW_INT_in_fator403); 
                    dbg.location(107,14);
                    valor = Integer.parseInt(i.getText());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dannluciano/Sources/MyLanguage/expr.g:108:6: i= ID
                    {
                    dbg.location(108,8);
                    i=(Token)match(input,ID,FOLLOW_ID_in_fator416); 
                    dbg.location(108,13);
                    valor = (Integer) getIdValue(i.getText()); 

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
        dbg.location(109, 3);

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


 

    public static final BitSet FOLLOW_expr_in_program24 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termo_in_expr43 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr57 = new BitSet(new long[]{0x0000000000401200L});
    public static final BitSet FOLLOW_termo_in_expr67 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_expr_if_in_expr88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_let_in_expr101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_expr_let122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_list_dec_in_expr_let129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IN_in_expr_let132 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_expr_let138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_list_dec151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_list_dec155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_dec_var174 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_dec_var181 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ATT_in_dec_var183 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_dec_var189 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_dec_var194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_dec_var200 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ATT_in_dec_var202 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_dec_var208 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IF_in_expr_if229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_if231 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_rel_in_expr_if237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_if240 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_expr_if242 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_expr_if248 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_expr_if250 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_expr_if256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_rel279 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_set_in_expr_rel285 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_expr_rel307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fator_in_termo330 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_termo343 = new BitSet(new long[]{0x0000000000401200L});
    public static final BitSet FOLLOW_fator_in_termo355 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_LPAREN_in_fator382 = new BitSet(new long[]{0x0000000000401A40L});
    public static final BitSet FOLLOW_expr_in_fator388 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_fator390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fator403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator416 = new BitSet(new long[]{0x0000000000000002L});

}