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
        | functionCall
        | variableDeclaration
        | returnStatement
        | swap)
    SEMICOLON*;

declaration: FUN ID LPAREN lvalblock? RPAREN body;

assignment: lvalblock ASSIGN rval;
conditional: IF LPAREN boolExpression RPAREN body (ELSE body)?;
loopWhile: WHILE LPAREN boolExpression RPAREN body;
loopFor: FOR LPAREN lval rval RANGE rval RPAREN body;
writeOperator: SHL writable (COMMA writable)*;
readOperator: SHR lvalblock;
functionCall: ID LPAREN rvalblock RPAREN;
variableDeclaration: VAL (lvalblock|assignment); // may have initialization
returnStatement: RET rval SEMICOLON*;
swap: SWAP lval COMMA lval;


lvalblock: lval (COMMA lval)*;
lval: ID;

rvalblock: rval (COMMA rval)*;
rval: expression | functionCall;


body: statement | LBRACE statement*  RBRACE;

writable: rval | QUOTE string QUOTE;



expression : ((PLS | MNS))? term ((PLS | MNS) term)*;
term       : atom ((MLP | DIV) atom )*;
atom       : INTEGER | lval | functionCall | LPAREN expression RPAREN;

boolExpression : boolTerm ((AND | OR) boolTerm)*;
boolTerm   : NOT? boolAtom;
boolAtom   : boolConst | comparison | rval | LPAREN boolExpression RPAREN;
comparison : rval (LESS | GREATER | LESSEQUAL | GREATEREQUAL| EQUAL | NEQUAL) rval;


string: (~('\r' | '\n' | '"')|':'|'.')*;


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
RET: 'ret';
FUN : 'fun';
VAL : 'val';
SWAP: 'swap';


INTEGER: [0-9]+;
ID: ([a-z]|[A-Z])+;
SEMICOLON: ';';
WHITESPACE: [ \t]+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
NL: '\n' -> skip;   // because of LL(1) there can be some collisions with NEWLINE

SHARP: '#';
