grammar UpdatedLanguage;

// Updated Parser Rules

program: statementList;

statementList: statement*;

statement: 
    assignment ';' 
  | conditional
  | loop  
  | functionCall ';'
  | fileStatement
  | printStatement ';'
  ;

assignment: IDENTIFIER '=' expression;  

conditional: 'if' '(' expression ')' statementList (ELSE statementList)? ;

loop: WHILE '(' expression ')' statementList
    | FOR '(' assignment ';' expression ';' assignment ')' statementList ;

functionCall: IDENTIFIER'('argumentList?')';

argumentList: expression (',' expression)* ;

fileStatement: fileDeclaration | fileFunctionCall ;

fileFunctionCall: OPEN '(' FILENAME ')'
                | READ '(' fileRef ')'   
                | WRITE '(' fileRef ',' expression ')'
                | CLOSE '(' fileRef ')'
                ;
                
fileDeclaration: FILE IDENTIFIER '=' OPEN '(' FILENAME ')' ';';

fileRef: IDENTIFIER;               

printStatement: PRINT '(' expression ')';

expression: 
     INT_LITERAL
   | IDENTIFIER    
   | expression BinaryOperator expression 
   | '(' expression ')'    
   ;
   
BinaryOperator: '+' | '-' | '*' | '/' ;   

// Updated Lexer Rules  

IDENTIFIER: LETTER(LETTER|DIGIT)*;  
INT_LITERAL: DIGIT+; 

FILE : 'file';
OPEN : 'open';
READ : 'read';
WRITE : 'write'; 
CLOSE : 'close';   
PRINT: 'print';

FOR: 'for';
WHILE: 'while'; 
IF: 'if';
ELSE: 'else';

FILENAME: LETTER(LETTER|DIGIT|' '|'.')*;    

fragment DIGIT: [0-9]; 
fragment LETTER: [a-zA-Z];

WHITESPACE: [ \t\n\r]+ -> skip ;

