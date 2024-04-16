grammar Math;

// Define the entry point
expr:   (term ('+' term | '-' term)*)? EOF;

// Define terms for multiplication/division
term:   factor ('*' factor | '/' factor)*;

// Define factors as numbers or expressions in parentheses
factor: INT | '(' expr ')';

// Lexer rules
INT :   [0-9]+;
WS  :   [ \t\r\n]+ -> skip; // Skip whitespace