import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side to calculate (A, B, or C): ");
        char side = gC(sc);
        double a, b, c;

        switch (Character.toLowerCase(side)) {
            case 'a':
                c = rD(sc, "Hypotenuse (C) = ");
                b = rD(sc, "Opposite (B) = ");
                a = Math.sqrt(c * c - b * b);
                System.out.println("Base (A) = " + a);
                break;

            case 'b':
                a = rD(sc, "Base (A) = ");
                c = rD(sc, "Hypotenuse (C) = ");
                b = Math.sqrt(a * a - c * c);
                System.out.println("Opposite (B) = " + b);
                break;

            case 'c':
                a = rD(sc, "Base (A) = ");
                b = rD(sc, "Opposite (B) = ");
                c = Math.sqrt(a * a + b * b);
                System.out.println("Hypotenuse (C) = " + c);
                break;

            default:
                System.out.println("Invalid inp.");
        }

        sc.close();
    }

    public static char gC(Scanner sc) {
        while (true) {
            String inp = sc.nextLine().toLowerCase();
            if (inp.length() == 1 && "abc".contains(inp)) {
                return inp.charAt(0);
            }
            System.out.println("Enter a Side");
        }
    }

    public static double rD(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String inp = sc.nextLine();
            try {
                return Double.parseDouble(inp);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.");
            }
        }
    }
}
