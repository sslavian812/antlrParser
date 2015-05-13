grammar GoodLang;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

program: {System.out.println("#include <iostream>\n#include <cstdio>\nint main() {");} declaration (statement)+ SEMICOLON;

declaration: VARCOLON declvar {System.out.println("int "+ $declvar.text);} (COMMA declvar {System.out.println("int "+ $declvar.text);} )+ ;

declvar : ID;

statement:  (assignment
        | conditional
        | loopWhile
        | loopFor
        | writeOperator
        | readOperator)
    SEMICOLON*;


assignment: lval {System.out.println($lvar.text+ " = ");} ASSIGN rval {System.out.println($rvar.text);} ;
conditional: IF LPAREN {System.out.println("if ( \n");} boolExpression RPAREN {System.out.println(")\n");} body (ELSE {Syste.out.println("else {\n");} body)?;
loopWhile: WHILE LPAREN {System.out.println("while(");} boolExpression RPAREN body;
loopFor: FOR LPAREN lval rval RANGE rval RPAREN {System.out.println("for( ")} body;
writeOperator: SHL writable (COMMA writable)*;
readOperator: SHR lvalblock;

lval: ID;
rval: expression | QUESTION boolExpression;

body: statement | LBRACE statement* RBRACE;

writable: rval | QUOTE string QUOTE;
string: (~('\r' | '\n' | '"'))*;


expression : ((PLS | MNS))? term ((PLS | MNS) term)*;
term       : atom ((MLP | DIV) atom )*;
atom       : INTEGER | lval | LPAREN expression RPAREN;

boolExpression : boolTerm ((AND | OR) boolTerm)*;
boolTerm   : NOT? boolAtom;
boolAtom   : boolConst | comparison | rval | LPAREN boolExpression RPAREN;


comparison : rval (LESS | GREATER | LESSEQUAL | GREATEREQUAL| EQUAL | NEQUAL) rval;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

boolConst  : 'true'|'false';

LPAREN : '(';
RPAREN : ')';

LBRACE : '{';
RBRACE : '}';

PLS : '+';
MNS : '-';
MLP : '*';
DIV : '/';

OR  : '|';
AND : '&';
NOT : '!';

VARCOLON : 'var:';

LESS  : '<';
LESSEQUAL  : '<=';
GREATER  : '>';
GREATEREQUAL: '>=';
EQUAL : '==';
NEQUAL : '!=' | '<>';

ASSIGN : '=';
COMMA : ',';
RANGE: '..';

SHL : '<<';
SHR : '>>';

QUESTION : '?';
QUOTE :  '"';

IF  : 'if';
ELSE: 'else';
WHILE: 'while';
FOR : 'for';


INTEGER: [0-9]+;
ID: ([a-z]|[A-Z])+;
SEMICOLON: ';';
WHITESPACE: [ \t]+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
