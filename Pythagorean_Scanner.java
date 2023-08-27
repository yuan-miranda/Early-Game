import java.util.Scanner;

public class PythagorianTheorem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Computation 
        System.out.print("What side are you looking for? A, B or C: ");
        char input = getUserCharInput(scanner);

        if (input == 'a'|| input == 'A') {
            double c = readDoubleFromUser(scanner, "What is your Hypotenuse / C = ");
            double b = readDoubleFromUser(scanner, "What is your Opposite / B = ");

            double a = Math.sqrt((c * c) - (b * b));
            System.out.println("Your Base is = " + a);
            
            
        } else if (input == 'b' || input == 'B') {
            double a = readDoubleFromUser(scanner, "What is your base / A = ");
            double c = readDoubleFromUser(scanner, "What is your Hypotenuse / C = ");

            double b = Math.sqrt((a * a) - (c * c));
            System.out.println("Opposite is = " + b);
            
            
        } else if (input == 'c'|| input == 'C') {
            double a = readDoubleFromUser(scanner, "What is your Base / A = ");
            double b = readDoubleFromUser(scanner, "What is your Opposite / B = ");

            double c = Math.sqrt((a * a) + (b * b));
            System.out.println("Your Hypotenuse is = " + c);
            
            
        } else {
            System.out.println("Here's your extra chomosomes... Retard");
        }

        scanner.close();
    }

    // Only Trinagle's side
    public static char getUserCharInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char character = input.charAt(0);
                if (isValidCharacter(character)) {
                    return character;
                }
            }
            System.out.println("Enter a side of a triangle.");
        }
    }

    // Length of the Triangle's Side
    public static double readDoubleFromUser(Scanner scanner, String prompt) {
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
    public static boolean isValidCharacter(char character) {
        return (character == 'a' || character == 'b' || character == 'c' || character == 'A' || character == 'B' || character == 'C');
    }
}
