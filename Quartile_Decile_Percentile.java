import java.util.*;
import java.util.Scanner;



 public class Dcoder
 {
   public static void main(String args[])
   { 
    
    Scanner scan = new Scanner(System.in);
    
    
    double k;
    double LB;
    double N;
    double Cfb;
    double f;
    double i;
    double Ans;
    double Opr;
    /* Opr:
       4    quartile 
       10   decile
       100  percentile */ 
         
         
    System.out.print("k = ");
    k = scan.nextDouble();
    
    System.out.print("LB = ");
    LB = scan.nextDouble();
    
    System.out.print("N = ");
    N = scan.nextDouble();
    
    System.out.print("Cfb = ");
    Cfb = scan.nextDouble();
    
    System.out.print("f = ");
    f = scan.nextDouble();
    
    System.out.print("i = ");
    i = scan.nextDouble();
    
    System.out.print("Operation = ");
    Opr = scan.nextDouble();
    
    
    Ans = (((((k*N/Opr)-Cfb)/f)*i)+LB);
    System.out.print("Ans = "+Ans);
    
   }
 }
