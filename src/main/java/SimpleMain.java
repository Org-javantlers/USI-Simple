import org.antlr.v4.runtime.*;

public class SimpleMain {
  public static void main(final String[] args) {
    String string = "90-5+57+93";
    SimpleLexer lexer = new SimpleLexer(CharStreams.fromString((string)));
    SimpleParser parser = new SimpleParser(new CommonTokenStream(lexer));
    String postfix = parser.program().s;
    System.out.println(postfix);
  }
}
