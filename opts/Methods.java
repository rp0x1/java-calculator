package opts;

import terminal.Terminal;
import terminal.Ansi;

// Operants class
public class Methods {

    // ADD METHOD OPERANT
    public static void Add(int fv, int sv) 
    {
        System.out.println("Your sum: " + Ansi.CYAN + fv + " + " + sv + " = " + (fv + sv) + Ansi.RESET);
    }

    // SUB METHOD OPERANT
    public static void Sub(int fv, int sv)
    {
        System.out.println("Your sum: " + Ansi.CYAN + fv + " - " + sv + " = " + (fv - sv) + Ansi.RESET);
    }
    
    // DIV METHOD OPERANT
    public static void Div(int fv, int sv)
    {
        System.out.println("Your sum: " + Ansi.CYAN + fv + " / " + sv + " = " + (fv / sv) + Ansi.RESET);
    }

    // MUL METHOD OPERANT
    public static void Mul(int fv, int sv)
    {
        System.out.println("Your sum: " + Ansi.CYAN + fv + " * " + sv + " = " + (fv * sv) + Ansi.RESET);
    }

}
