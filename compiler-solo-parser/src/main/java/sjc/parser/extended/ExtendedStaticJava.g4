grammar ExtendedStaticJava;

compilationUnit
  : scd1+=simpleClassDeclaration* classDefinition scd2+=simpleClassDeclaration* EOF
  ;

classDefinition
  : 'public' 'class' ID '{' 
    mainMethodDeclaration
    ( fieldOrMethodDeclaration )*
    '}'
  ;
  
  simpleClassDeclaration
  : 'class' ID '{' publicFieldDeclaration* '}'
  ;
  
  publicFieldDeclaration
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
: ( t1=basicType | t2=ID ) ( arr='[' ']' )?
;
  
basicType
  : t1='boolean'                #BooleanType
  | t2='int'                    #IntType
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
  : 'if' '(' exp ')' '{' ts+=statement* '}'
    ( 'else' '{' fs+=statement* '}' )?
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
  : ID 								#IDExp
  | exp '.' ID						#fieldAccess
  | arr=exp '[' index=exp ']'		#arrayAccess
  ;
  
forStatement
  : 'for' '(' forInits? ';' e1=exp? ';' forUpdates? ')' '{' statement* '}'
  ;
  
forInits
  : assign ( ',' assign )*
  ;
  
forUpdates
  : incDec ( ',' incDec )*
  ;
  
incDec
  : lhs op='++' 
  | lhs '--'
  ;
  
doWhileStatement
  : 'do' '{' statement* '}' 'while' '(' exp ')' ';'
  ;
  
exp
  : literalExp					#LitExpr
  | unaryExp					#UnaryExpr
  | exp binaryExp			#BinaryExpr
  | parenExp					#ParenExpr
  | invokeExp					#InvokeExpr
  | varRef						#VarRefr
  | newExp						#NewExpr
  | exp arrayAccessExp			#ArrayAccessr
  | exp fieldAccessExp			#FieldAccessr
  | exp condExp					#CondExpr
  ;
  
literalExp
  : booleanLiteral													#BoolLit
  | NUM	{ new java.math.BigInteger($NUM.text).bitLength() < 32 }?   #IntLit
  |	'null'															#NullLit
  ;
  
booleanLiteral
  : bool='true' 		#TrueLiteral
  | 'false'				#FalseLiteral
  ;
  
unaryExp
  : op=unaryOp e2=exp
  ;
  
unaryOp
  : '+' | '-' | '!' | '~'
  ;
  
binaryExp
  : op=binaryOp e2=exp
  ;
  
binaryOp
  : '+' | '-' | '*' | '/' | '%' | '>' | '>=' | '==' 
  | '<' | '<=' | '!=' | '&&' | '||' | '<<' | '>>' | '>>>'
  ;
  
parenExp
  : '(' exp ')'
  ;
  
invokeExp
  : ( id1=ID '.' )? id2=ID '(' args? ')'
  ;
  
args
  : exp ( ',' exp )*
  ;
  
varRef
  : ID
  ;
  
condExp
  : '?' e1=exp ':' e2=exp
  ;
  
newExp
  : 'new' ID '(' ')'				 #NewExpID
  | 'new' t=type '[' e1=exp ']'		 #NewExpArr
  | 'new' t=type '[' ']' e1=arrayInit#NewExprArrInit
  ;
 
arrayInit
  : '{' exp ( ',' exp )* '}'
  ;
  
fieldAccessExp
  : '.' ID
  ;
  
arrayAccessExp
  : '[' index=exp ']'
  ;
  
ID
:( 'a'..'z' | 'A'..'Z' | '_' | '$' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
;

NUM
: '0' | ('1'..'9') ('0'..'9')* 
;


// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;
  
// Any other character is an error character
ERROR
  : .
  ;
  
 