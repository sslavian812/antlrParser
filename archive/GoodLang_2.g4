grammar GoodLang;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

program: (statement)+ ;

statement:  (assignment
        | conditional
        | loopWhile
        | loopFor
        | writeOperator
        | readOperator)
    SEMICOLON*;


assignment: lvalblock ASSIGN rvalblock;
conditional: IF LPAREN boolExpression RPAREN body (ELSE body)?;
loopWhile: WHILE LPAREN boolExpression RPAREN body;
loopFor: FOR LPAREN lval rval RANGE rval RPAREN body;
writeOperator: SHL writable (COMMA writable)*;
readOperator: SHR lvalblock;

lvalblock: lval  (COMMA lval)*;
lval: ID;

rvalblock: rval (COMMA rval)*;
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
