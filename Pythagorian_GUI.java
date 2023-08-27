import javax.swing.JOptionPane;

public class PythagorianTheorem {
    public static void main(String[] args) {
        char input = readChar("What side are you looking for? A, B or C");

        double a;
        double b;
        double c;
        
        // Computation
        if (input == 'a' || input == 'A') {
            c = readDouble("What is your Hypotenuse / C = ");
            b = readDouble("What is your Opposite / B = ");

            a = Math.sqrt((c * c) - (b * b));
            JOptionPane.showMessageDialog(null, "Your Base is = " + a);

            
        } else if (input == 'b' || input == 'B') {
            a = readDouble("What is your base / A = ");
            c = readDouble("What is your Hypotenuse / C = ");

            b = Math.sqrt((a * a) - (c * c));
            JOptionPane.showMessageDialog(null, "Opposite is = " + b);

            
        } else if (input == 'c' || input == 'C') {
            a = readDouble("What is your Base / A = ");
            b = readDouble("What is your Opposite / B = ");

            c = Math.sqrt((a * a) + (b * b));
            JOptionPane.showMessageDialog(null, "Your Hypotenuse is = " + c);

            
        } else {
            JOptionPane.showMessageDialog(null, "Here's your extra chromosomes... Retard.");
        }
    }

    // Only Triangle's Side
    public static char readChar(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            if (input != null && input.length() == 1) {
                char character = input.charAt(0);
                if (validChar(character)) {
                    return character;
                }
            }
            JOptionPane.showMessageDialog(null, "Enter a side of a triangle.");
        }
    }

    // Length of the Triangle's Side
    public static double readDouble(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a number.");
            }
        }
    }

    // Allowed Char of Triangle's Side
    public static boolean validChar(char character) {
        return (character == 'a' || character == 'b' || character == 'c' || character == 'A' || character == 'B' || character == 'C');
    }
}
