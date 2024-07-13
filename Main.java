// Imports
import opts.Methods;
import terminal.Terminal;
import terminal.Ansi;


public class Main
{
    // Main function
    public static void main(String... args)
    {
        // Clear terminal
        System.out.print("\u001bc");

        // Initialize a new terminal
        System.out.println("Welcome to the JAVA Calculator... I made this for learning purposes.\nLet's see what you want to calculate, choose one of the options below;\n" + Ansi.BG_WHITE + "ADD, SUB, DIV, MUL" + Ansi.RESET);
        Terminal.newTerminal("Please enter a valid operant: ");
    }
}
