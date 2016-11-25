// Define a grammar called Calc
grammar Calc;
options{
language=Java;

}

//Lexer Rules

INT : '0'..'9'+;
WS: (' '|'\t'|'\r'|'\n') + -> skip;

//Parser Rules

multDivExpr:INT(('*'|'/') INT)*;

addSubExpr:multDivExpr (('+'|'-') multDivExpr)*;

