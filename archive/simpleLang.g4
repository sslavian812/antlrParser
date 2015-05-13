grammar GoodLang;


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

program: (declaration|statement)+ ;


statement:  (assignment
        | conditional
        | loopWhile
        | loopFor
        | writeOperator
        | readOperator
        | functionCall)
    SEMICOLON*;


assignment: lval ASSIGN rval;
conditional: IF LPAREN boolExpression RPAREN body (ELSE body)?;
loopWhile: WHILE LPAREN boolExpression RPAREN body;
loopFor: FOR LPAREN lval rval RANGE rval RPAREN body;
writeOperator: SHL writable (COMMA writable)*;
readOperator: SHR lvalblock;
functionCall: FUN ID LPAREN rvalblock RPAREN;

lvalblock: lval (COM lval)*;
lval: ID;

rvalblock: rval (COM rval)*;
rval: expression | QUESTION boolExpression | functionCall;

declaration: FUN ID LPAREN lvalblock? RPAREN LBRACE statement* LBRACE;

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

FUN : 'fun';
VAL : 'val';

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
