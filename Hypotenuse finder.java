import java.util.*;
import java.util.Scanner;

public class Dcoder
 {
   public static void main(String args[])
   { 
   
   double a;
   double b;
   double c;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Opposite/A = ");
    a = scan.nextDouble();
    System.out.print("Adjacent/B = ");
    b = scan.nextDouble();
    
    c = Math.sqrt((a*a)+(b*b));
    
    System.out.println("Hypotenuse/C = "+c);
    
   }
 }