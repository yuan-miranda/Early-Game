import javax.swing.JOptionPane;

public class aint {
    public static void main(String[] args) {
        char input = getUserCharInput("What side are you looking for? A, B or C");

        if (input == 'a') {
            double c = readDoubleFromUser("What is your Hypotenuse / C = ");
            double b = readDoubleFromUser("What is your Opposite / B = ");

            double a = Math.sqrt((c * c) - (b * b));
            JOptionPane.showMessageDialog(null, "Your Base is = " + a);
        } else if (input == 'b') {
            double a = readDoubleFromUser("What is your base / A = ");
            double c = readDoubleFromUser("What is your Hypotenuse / C = ");

            double b = Math.sqrt((a * a) - (c * c));
            JOptionPane.showMessageDialog(null, "Opposite is = " + b);
        } else if (input == 'c') {
            double a = readDoubleFromUser("What is your Base / A = ");
            double b = readDoubleFromUser("What is your Opposite / B = ");

            double c = Math.sqrt((a * a) + (b * b));
            JOptionPane.showMessageDialog(null, "Your Hypotenuse is = " + c);
        } else {
            JOptionPane.showMessageDialog(null, "Here's your extra chromosomes... Retard.");
        }
    }

    public static char getUserCharInput(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            if (input != null && input.length() == 1) {
                char character = input.charAt(0);
                if (isValidCharacter(character)) {
                    return character;
                }
            }
            JOptionPane.showMessageDialog(null, "Enter a side of a triangle.");
        }
    }

    public static double readDoubleFromUser(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a number.");
            }
        }
    }

    public static boolean isValidCharacter(char character) {
        return (character == 'a' || character == 'b' || character == 'c');
    }
}
import javax.swing.JOptionPane;

public class aint {
    public static void main(String[] args) {
        char input = getUserCharInput("What side are you looking for? A, B or C");

        if (input == 'a') {
            double c = readDoubleFromUser("What is your Hypotenuse / C = ");
            double b = readDoubleFromUser("What is your Opposite / B = ");

            double a = Math.sqrt((c * c) - (b * b));
            JOptionPane.showMessageDialog(null, "Your Base is = " + a);
        } else if (input == 'b') {
            double a = readDoubleFromUser("What is your base / A = ");
            double c = readDoubleFromUser("What is your Hypotenuse / C = ");

            double b = Math.sqrt((a * a) - (c * c));
            JOptionPane.showMessageDialog(null, "Opposite is = " + b);
        } else if (input == 'c') {
            double a = readDoubleFromUser("What is your Base / A = ");
            double b = readDoubleFromUser("What is your Opposite / B = ");

            double c = Math.sqrt((a * a) + (b * b));
            JOptionPane.showMessageDialog(null, "Your Hypotenuse is = " + c);
        } else {
            JOptionPane.showMessageDialog(null, "Here's your extra chromosomes... Retard.");
        }
    }

    public static char getUserCharInput(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            if (input != null && input.length() == 1) {
                char character = input.charAt(0);
                if (isValidCharacter(character)) {
                    return character;
                }
            }
            JOptionPane.showMessageDialog(null, "Enter a side of a triangle.");
        }
    }

    public static double readDoubleFromUser(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a number.");
            }
        }
    }

    public static boolean isValidCharacter(char character) {
        return (character == 'a' || character == 'b' || character == 'c');
    }
}
