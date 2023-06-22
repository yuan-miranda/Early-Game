import javax.swing.JOptionPane;

public class App{
  public static void main(String[] args){
    double a = Double.parseDouble(JOptionPane.showInputDialog("Opposite = "));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Adjacent = "));

    double c = Math.sqrt((a*a)+(b*b));
    
    JOptionPane.showMessageDialog(null,"Hypotenuse = "+c);
  }
}
