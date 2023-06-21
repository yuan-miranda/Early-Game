import java.util.Scanner;
import java.util.*;

public class Dcoder{
    public static void main(String[] args){
        double Opr;
        double n;
        double i;
        double Ans;
                
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Operation = ");
        Opr = scan.nextDouble();
        
        System.out.print("n = ");
        n = scan.nextDouble();
        
        System.out.print("i = ");
        i = scan.nextDouble();
        
        
        Ans = (((n + 1) * i) / Opr);
        System.out.print("Answere = "+Ans);
       
      }
  }
