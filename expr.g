grammar expr;

@header {
	import java.util.HashMap;
	import java.util.Stack;
}

@members {
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
}

program	:	e=expr	{ System.out.println(e); }
	;

expr returns [int valor]
	:	t1=termo {valor = t1;}
		 (( op = (SUB|SUM) t2 = termo {
		 	if (op.getText().equals("+"))
		 		valor+= t2;
		 	else if (op.getText().equals("-"))
		 		valor -= t2;
		 }
		 ) )*
		 | e = expr_if {valor = e;}
		 | e = expr_let {valor = e;}
	;

expr_let returns [int valor]
		//adicionar novo escopo
	: 	LET {memoria.push(new HashMap<String, Object>());}
		(list_dec) IN e = expr { valor = e; }
	;

list_dec
	:	dec_var | dec_func	;

dec_func
	:
	;

dec_var
	:	VAR (i1 = ID ATT e1 = expr){
			adicionaId(i1.getText(), new Integer(e1));
		} (',' i2 = ID ATT e2 = expr{
			adicionaId(i2.getText(), new Integer(e2));
		}
		)*
	;

expr_if returns [int valor]
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
				valor = e1 == e2;
			else if (oprel.getText().equals("!=") )
				valor = e1 != e2;
			else if (oprel.getText().equals(">") )
				valor = e1 > e2;
			else if (oprel.getText().equals("<") )
				valor = e1 < e2;
		}
	;

termo returns [int valor]
	:	f1 = fator {valor = f1;}
		(( op = (MUL | DIV) f2 = fator {
		 	if (op.getText().equals( "*"))
		 		valor = valor * f2;
		 	else if (op.getText().equals( "/"))
		 		valor = valor / f2;
		 }
		 ) )*
		 ;

fator returns [int valor]
	:	LPAREN e = expr RPAREN {valor = e;}
	 	| i = INT {valor = Integer.parseInt(i.getText());}
	 	| i = ID {valor = (Integer) getIdValue(i.getText()); }
		;

IF	:	'if';
THEN	:	'then';
ELSE	:	'else';

LET	:	'let';
VAR	: 	'var';
IN	:	'in';
FUNC	:	'func';

//OP_REL	:	( LT | EQ | GT | NE );

ATT	:	'='	;
ID	:	LETTER ( LETTER | INT )*;
fragment
LETTER	:	'a'..'z'	;
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

