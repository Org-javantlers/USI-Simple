//package org.example;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
    public static void main(String[] args) {
        // A string de entrada que você quer analisar
        String expression = "10 + 2 * 3 -  1000";
        //String test  = "thisisaTest";
        // Criar um lexer que processa a entrada
        MathLexer lexer = new MathLexer(CharStreams.fromString(expression));

        // Criar um stream de tokens a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criar um parser que consome o stream de tokens
        MathParser parser = new MathParser(tokens);

        // Especificar a regra da gramática para começar a análise (e.g., a regra 'expr' da gramática Math.g4)
        ParseTree tree = parser.expr(); // 'expr' é o nome da regra inicial na gramática Math.g4

        // Imprimir a árvore de análise em formato LISP (útil para depuração)
        System.out.println(tree.toStringTree(parser));
    }
}
