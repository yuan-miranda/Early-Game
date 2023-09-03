import javax.swing.JOptionPane;

public class PythagoreanTheorem {
    private static double a, b, c;

    public static void main(String[] args) {
        char side = gC("Side to calculate (A, B, or C): ");

        switch (Character.toLowerCase(side)) {
            case 'a':
                c = gD("Hypotenuse (C) = ");
                b = gD("Opposite (B) = ");
                a = Math.sqrt(c * c - b * b);
                System.out.println("Base (A) = " + a);
                break;

            case 'b':
                a = gD("Base (A) = ");
                c = gD("Hypotenuse (C) = ");
                b = Math.sqrt(a * a - c * c);
                System.out.println("Opposite (B) = " + b);
                break;

            case 'c':
                a = gD("Base (A) = ");
                b = gD("Opposite (B) = ");
                c = Math.sqrt(a * a + b * b);
                System.out.println("Hypotenuse (C) = " + c);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }

    // Only Triangle's Side
    public static char gC(String pr) {
        while (true) {
            String inp = JOptionPane.showInputDialog(pr).toLowerCase();
            if (inp != null && inp.length() == 1 && "abc".contains(inp)) {
                return inp.charAt(0);
            }
            JOptionPane.showMessageDialog(null, "Enter a Side");
        }
    }

    // Length of the Triangle's Side
    public static double gD(String pr) {
        while (true) {
            String inp = JOptionPane.showInputDialog(pr);
            try {
                return Double.parseDouble(inp);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter number.");
            }
        }
    }
}
