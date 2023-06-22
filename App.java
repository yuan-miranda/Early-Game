import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Inputs
        double k;
        double LB;
        double N;
        double Cfb;
        double f;
        double i;
        double Ans;
        double Opr;

        Opr = Double.parseDouble(JOptionPane.showInputDialog("Operation = "));
        k = Double.parseDouble(JOptionPane.showInputDialog("k = "));
        LB = Double.parseDouble(JOptionPane.showInputDialog("Lower Boundary = "));
        N = Double.parseDouble(JOptionPane.showInputDialog("N = "));
        Cfb = Double.parseDouble(JOptionPane.showInputDialog("Commulative Frequncy Before = "));
        f = Double.parseDouble(JOptionPane.showInputDialog("Frequency = "));
        i = Double.parseDouble(JOptionPane.showInputDialog("Class Interval = "));
        
        //Outputs
        Ans = (((((k*N/Opr)-Cfb)/f)*i)+LB);
        JOptionPane.showMessageDialog(null, "Answer = "+Ans);
        
    }
}
