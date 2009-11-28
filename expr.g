grammar expr;

@header {
	import java.util.HashMap;
	import java.util.Stack;
}

@members {
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
}

program	:	list_cmd;

list_cmd
	:
		cmd+
	;

cmd	:
		(cmd_att|cmd_print)';'
	;

cmd_print
	:
		PRINT e=expr {System.out.println(e);}
	;

cmd_att	:
	i=ID ATT e=expr{adicionaId(i.getText(), e);}
	;

expr returns [Object valor]
	:	t1=termo {valor = t1;}
		 (( op = (SUB|SUM) t2 = termo {
		 	if (op.getText().equals("+"))
		 		valor = (Integer)valor + (Integer)t2;
		 	else if (op.getText().equals("-"))
		 		valor = (Integer)valor - (Integer)t2;
		 }
		 ) )*
		 | e = expr_if {valor = e;}
		 | e = expr_let {valor = e;}
		 | e = expr_length {valor = e;}
		 | e = expr_concat {valor = e;}
	;
	
expr_length returns[Object valor]
	:	LENGTH s=STRING {valor = s.getText().substring(1,(s.getText().length()-1)).length();}
	;
	
expr_concat returns[Object valor]
	:	s1=STRING DOT s2=STRING{valor = s1.getText() + s2.getText();}
	;

expr_let returns [Object valor]
	: 	LET {memoria.push(new HashMap<String, Object>());}
		(list_dec) IN e = expr { valor = e; }
	;

list_dec
	:	dec_var | dec_func	;

dec_func
	:
	;

dec_var
	:	VAR cmd_att (',' cmd_att)*
	;

expr_if returns [Object valor]
	:	IF LPAREN bool = expr_rel  RPAREN THEN e1 = expr ELSE e2 = expr
		{
			if (bool) { valor = e1;}
			else { valor = e2;}
		}
	;

expr_rel returns [boolean valor]
	:	e1 = expr oprel = ( LT | EQ | GT | NE ) e2 = expr
		{
			if (oprel.getText().equals("==") )
				valor = (Integer) e1 == (Integer) e2;
			else if (oprel.getText().equals("!=") )
				valor = (Integer) e1 != (Integer) e2;
			else if (oprel.getText().equals(">") )
				valor = (Integer) e1 > (Integer) e2;
			else if (oprel.getText().equals("<") )
				valor = (Integer) e1 < (Integer) e2;
		}
	;

termo returns [Object valor]
	:	f1 = fator {valor = f1;}
		(( op = (MUL | DIV) f2 = fator {
		 	if (op.getText().equals( "*"))
		 		valor = (Integer)valor * (Integer)f2;
		 	else if (op.getText().equals( "/"))
		 		valor = (Integer)valor / (Integer)f2;
		 }
		 ) )*
		 ;

fator returns [Object valor]
	:	LPAREN e = expr RPAREN {valor = e;}
	 	| i = INT {valor = Integer.parseInt(i.getText());}
	 	| i = ID {valor = getIdValue(i.getText()); }
//	 	| i = ID { printStack(); }
	 	| s = STRING {valor = s.getText().substring(1,(s.getText().length()-1));}
		;

IF	:	'if';
THEN	:	'then';
ELSE	:	'else';

LET	:	'let';
VAR	: 	'var';
IN	:	'in';
FUNC	:	'func';

PRINT	:	'print';

LENGTH	:	'length';
STRING	:  	'"' (LETTER|DIGIT)* '"'
	;

ATT	:	'='	;
ID	:	LETTER ( LETTER | INT )*;
fragment
LETTER	:	'a'..'z'|'A'..'Z'	;
fragment
DIGIT	:	'0'..'9'	;
EQ	:	'=='	;
NE	:	'!='	;
GT	:	'>'	;
GE	:	'>='	;
LT	:	'<'	;
LE	:	'<='	;

INT	:	DIGIT+;

SUM	:	'+';

DOT	:	'.';

SUB	:	'-';

MUL	:	'*';

DIV	:	'/';

LPAREN	:	'(';

RPAREN	:	')';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;