package terminal;

// Imports
import java.util.Scanner;
import terminal.Ansi;
import opts.Methods;

// Terminal class holds our terminal functionality & input reading
public class Terminal {

    // newTerminal will initialize a new terminal for input reading 
    public static void newTerminal(String consoleMessage) {
        // Create a new terminal scanner with java.util.Scanner
        Scanner Terminal = new Scanner(System.in);

        // Print the terminal input
        System.out.print(Ansi.GREEN + consoleMessage + Ansi.RESET + ": ");

        // Read the input & handle input
        String inp = Terminal.nextLine();
       
       // Switch the input & check which operant has been passed in, and handle the request
        switch(inp.toLowerCase()) 
        {
            case "add":
                System.out.print("Enter first number: ");
                int fna = Integer.parseInt(Terminal.nextLine());

                System.out.print("Enter second number: ");
                int sna = Integer.parseInt(Terminal.nextLine());

                // Add the values together
                Methods.Add(fna, sna);
                break;

            case "sub":
                System.out.print("Enter first number: ");
                int fns = Integer.parseInt(Terminal.nextLine());

                System.out.print("Enter second number: ");
                int sns = Integer.parseInt(Terminal.nextLine());

                // Add the values together
                Methods.Sub(fns, sns);
                break;

            case "div":
                System.out.print("Enter first number: ");
                int fnd = Integer.parseInt(Terminal.nextLine());

                System.out.print("Enter second number: ");
                int snd = Integer.parseInt(Terminal.nextLine());

                // Add the values together
                Methods.Div(fnd, snd);
                break;

            case "mul":
                System.out.print("Enter first number: ");
                int fnm = Integer.parseInt(Terminal.nextLine());

                System.out.print("Enter second number: ");
                int snm = Integer.parseInt(Terminal.nextLine());

                // Add the values together
                Methods.Mul(fnm, snm);
                break;

            default:
                System.out.println("Could not recognize input: [" + Ansi.CYAN + inp + Ansi.RESET + "].");
                break;
        }
    }  
}   