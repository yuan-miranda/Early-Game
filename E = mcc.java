import java.math.BigDecimal;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Emcc {
    public static void main(String[] args) {
        Scanner sc;
        BigDecimal m;
        BigDecimal c;
        BigDecimal e;
        NumberFormat a;
        String b;
        
        
        sc = new Scanner(System.in); // New Scanner
        
        c = new BigDecimal("299792458"); // Speed of Light
        System.out.print("Mass = "); // Mass(KG) & Number only Input
        while (!sc.hasNextDouble()) {
            System.out.println("Must be a Number."); 
            sc.next();
        }
        m = sc.nextBigDecimal();
        
        e = m.multiply(c.pow(2)); // Energy
        
        a = NumberFormat.getNumberInstance(Locale.US); // Formating
        b = a.format(e);
        
        System.out.println("Energy= " + b + " Joules"); // Printing Formatted Number
        
        sc.close();
    }
}
