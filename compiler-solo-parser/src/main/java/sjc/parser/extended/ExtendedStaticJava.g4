grammar ExtendedStaticJava;

compilationUnit
  : simpleClassDefinition* classDefinition simpleClassDefinition* EOF
  ;

classDefinition
  : 'public' 'class' ID '{' 
    mainMethodDeclaration
    ( fieldDeclaration | methodDeclaration )*
    '}'
  ;
  
  simpleClassDefinition
  : 'class' ID '{' publicFieldDefinition* '}'
  ;
  
  publicFieldDefinition
  : 'public' type ID ';'
  ;

mainMethodDeclaration
  : 'public' 'static' 'void'
    id1=ID                   { "main".equals($id1.text) }? 
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'	
    '{' methodBody '}'
  ;
  
  fieldOrMethodDeclaration
  : fieldDeclaration | methodDeclaration
  ;
  
fieldDeclaration
  : 'static' type ID ';'
  ;
  
methodDeclaration
  : 'static' returnType ID '(' params? ')' '{' methodBody '}'
  ;
  
type
: ( basicType | ID ) ( '[' ']' )?
;
  
basicType
  : 'boolean'                #BooleanType
  | 'int'                    #IntType
  ;
  
returnType
  : 'void'                   #VoidType
  | type                     #NonVoidReturnType
  ;
  
params
  : param ( ',' param )*
  ;
  
param
  : type ID
  ;

methodBody
  : localDeclaration* statement*
  ;

localDeclaration
  : type ID ';'
  ;
  
statement
  : ( assignStatement
    | ifStatement
    | whileStatement
    | invokeExpStatement
    | returnStatement
    | forStatement
    | doWhileStatement
    | incDecStatement
    )
  ;
  
assignStatement
  : assign ';'
  ;
  
ifStatement
  : 'if' '(' exp ')' '{' statement* '}'
    ( 'else' '{' statement* '}' )?
  ;
  
whileStatement
  : 'while' '(' exp ')' '{' statement* '}'
  ;
  
invokeExpStatement
  : invokeExp ';'
  ;
  
returnStatement
  : 'return' exp? ';'
  ;
  
incDecStatement
  : incDec ';'
  ;
  
assign
  : lhs '=' exp
  ;
  
lhs
  : ID 
  | exp '.' ID
  | exp '[' exp ']'
  ;
  
forStatement
  : 'for' '(' forInits? ';' exp? ';' forUpdates? ')' '{' statement* '}'
  ;
  
forInits
  : assign ( ',' assign )*
  ;
  
forUpdates
  : incDec ( ',' incDec )*
  ;
  
incDec
  : lhs '++' | lhs '--'
  ;
  
doWhileStatement
  : 'do' '{' statement* '}' 'while' '(' exp ')' ';'
  ;
  
exp
  : literalExp
  | unaryExp
  | exp binaryExp
  | parenExp
  | invokeExp
  | varRef
  | newExp
  | exp arrayAccessExp
  | exp fieldAccessExp
  | exp condExp
  ;
  
literalExp
  : booleanLiteral
  | NUM	{ new java.math.BigInteger($NUM.text).bitLength() < 32 }?
  | 'null'
  ;
  
booleanLiteral
  : 'true' | 'false'
  ;
  
unaryExp
  : unaryOp exp
  ;
  
unaryOp
  : '+' | '-' | '!' | '~'
  ;
  
binaryExp
  : binaryOp exp
  ;
  
binaryOp
  : '+' | '-' | '*' | '/' | '%' | '>' | '>=' | '==' 
  | '<' | '<=' | '!=' | '&&' | '||' | '<<' | '>>' | '>>>'
  ;
  
parenExp
  : '(' exp ')'
  ;
  
invokeExp
  : ( ID '.' )? ID '(' args? ')'
  ;
  
args
  : exp ( ',' exp )*
  ;
  
varRef
  : ID
  ;
  
condExp
  : '?' exp ':' exp
  ;
  
newExp
  : 'new' ID '(' ')'
  | 'new' type '[' exp ']'
  | 'new' type '[' ']' arrayInit
  ;
 
arrayInit
  : '{' exp ( ',' exp )* '}'
  ;
  
fieldAccessExp
  : '.' ID
  ;
  
arrayAccessExp
  : '[' exp ']'
  ;
  
ID
:( 'a'..'z' | 'A'..'Z' | '_' | '$' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
;

NUM
: '0' | ('1'..'9') ('0'..'9')* 
;


invoke
  : (ID '.' )? ID '(' args? ')'
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;
  
// Any other character is an error character
ERROR
  : .
  ;
  
 