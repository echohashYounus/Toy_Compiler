import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestDriver {
    public static void main(String[] args) throws Exception {
        String inputFile = "input.txt";
        CharStream input = CharStreams.fromFileName(inputFile);

        UpdatedLanguageLexer lexer = new UpdatedLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UpdatedLanguageParser parser = new UpdatedLanguageParser(tokens);

        ParseTree tree = parser.program(); // Assuming 'program' is the start rule.

        // Print the tree to the console in a readable format
        System.out.println(tree.toStringTree(parser));
    }
}

