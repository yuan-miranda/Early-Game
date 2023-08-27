import java.math.BigDecimal;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Emcc {
    public static void main(String[] args) {
        Scanner sc;
        BigDecimal m;
        BigDecimal c;
        String e;
        NumberFormat a;
        
        sc = new Scanner(System.in);
                
        System.out.print("Mass = ");
        m = sc.nextBigDecimal();
        c = new BigDecimal("299792458");
        a = NumberFormat.getNumberInstance(Locale.US);
        e = a.format(m.multiply(c.pow(2)));
        
        System.out.println("Energy= " + e + " Joules");
    }
}
