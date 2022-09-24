import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = """
                >++++++++[<+++++++++>-]<.
                >++++[<+++++++>-]<+.
                +++++++..
                +++.
                >>++++++[<+++++++>-]<++.
                ------------.
                >++++++[<+++++++++>-]<+.
                <.
                +++.
                ------.
                --------.
                >>>++++[<++++++++>-]<+.""";
        int[] res = Interpreter.brainfuck(input.toCharArray()); // Hello, World!
    }
}