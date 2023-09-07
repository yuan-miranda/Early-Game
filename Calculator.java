import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JFrame frame;
    private JTextField Field;
    private JPanel Panel;

    private String Input = "";
    private double result = 0.0;
    private char operator = ' ';

    public CalculatorApp() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        Field = new JTextField();
        Field.setEditable(false);
        frame.add(Field, BorderLayout.NORTH);

        Panel = new JPanel(new GridLayout(4, 4));
        frame.add(Panel, BorderLayout.CENTER);

        addButton("7");
        addButton("8");
        addButton("9");
        addButton("/");
        addButton("4");
        addButton("5");
        addButton("6");
        addButton("*");
        addButton("1");
        addButton("2");
        addButton("3");
        addButton("-");
        addButton("0");
        addButton(".");
        addButton("=");
        addButton("+");

        frame.setVisible(true);
    }

    private void addButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(label);
            }
        });
        Panel.add(button);
    }

    private void handleButtonClick(String label) {
        if (label.matches("[0-9]+") || label.equals(".")) {
            Input += label;
            textField.setText(Input);
        } else if (label.equals("=")) {
            calculateResult();
        } else {
            if (!Input.isEmpty()) {
                calculateResult();
            }
            operator = label.charAt(0);
            Input = "";
        }
    }

    private void calculateResult() {
        if (!Input.isEmpty()) {
            double Value = Double.parseDouble(Input);
            switch (operator) {
                case '+':
                    result += Value;
                    break;
                case '-':
                    result -= Value;
                    break;
                case '*':
                    result *= Value;
                    break;
                case '/':
                    if (Value != 0) {
                        result /= Value;
                    } else {
                        textField.setText("Error");
                        result = 0.0;
                        Input = "";
                        operator = ' ';
                        return;
                    }
                    break;
            }
        }
        Input = Double.toString(result);
        textField.setText(Input);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
