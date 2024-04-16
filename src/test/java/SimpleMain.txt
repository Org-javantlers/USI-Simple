import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class SimpleMainbk {
  public static void main(final String[] args) throws IOException {
    String printSource = null, printSymTab = null,
      printIR = null, printAsm = null;
    SimpleLexer lexer = new SimpleLexer(new ANTLRInputStream(args[0]));
    SimpleParser parser = new SimpleParser(new CommonTokenStream(lexer));
    String postfix = parser.program().s;
    System.out.println(postfix);
  }
}
