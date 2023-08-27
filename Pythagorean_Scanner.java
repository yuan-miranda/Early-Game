import java.util.Scanner;

public class PythagorianTheorem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Computation 
        System.out.print("What side are you looking for? A, B or C: ");
        char input = readChar(scanner);
        
        double a;
        double b;
        double c;

        if (input == 'a'|| input == 'A') {
            c = readDouble(scanner, "What is your Hypotenuse / C = ");
            b = readDouble(scanner, "What is your Opposite / B = ");

            a = Math.sqrt((c * c) - (b * b));
            System.out.println("Your Base is = " + a);
            
            
        } else if (input == 'b' || input == 'B') {
            a = readDouble(scanner, "What is your base / A = ");
            c = readDouble(scanner, "What is your Hypotenuse / C = ");

            b = Math.sqrt((a * a) - (c * c));
            System.out.println("Opposite is = " + b);
            
            
        } else if (input == 'c'|| input == 'C') {
            a = readDouble(scanner, "What is your Base / A = ");
            b = readDouble(scanner, "What is your Opposite / B = ");

            c = Math.sqrt((a * a) + (b * b));
            System.out.println("Your Hypotenuse is = " + c);
            
            
        } else {
            System.out.println("Here's your extra chomosomes... Retard");
        }

        scanner.close();
    }

    // Only Trinagle's side
    public static char readChar(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char character = input.charAt(0);
                if (validChar(character)) {
                    return character;
                }
            }
            System.out.println("Enter a side of a triangle.");
        }
    }

    // Length of the Triangle's Side
    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.");
            }
        }
    }

    // Allowed Char of Triangle's Side
    public static boolean validChar(char character) {
        return (character == 'a' || character == 'b' || character == 'c' || character == 'A' || character == 'B' || character == 'C');
    }
}
