grammar Simple;

// productions for syntax analysis
program returns [String s]: e=expr EOF {$s = $e.s; } ;
expr returns [String s]: t=term r=rest {$s = $t.s + $r.s;} ;
rest returns [String s]
 : PLUS t=term r=rest                  {$s = $t.s + "+" + $r.s;}
 | MINUS t=term r=rest                 {$s = $t.s + "-" + $r.s;}
 | /* empty */                         {$s = "";} ;
term returns [String s] : DIGIT        {$s = $DIGIT.text;};

// productions for lexical analysis
PLUS : '+' ;
MINUS : '-' ;
DIGIT : [0-9];
