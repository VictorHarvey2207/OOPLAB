package lab01;
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String str1, str2;
        str1 = JOptionPane.showInputDialog(null, "Enter the first number: ");
        str2 = JOptionPane.showInputDialog(null, "Enter the second number: ");
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Division by zero is not allowed.");
        } else {
            quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\n" + "The difference is: " + difference + "\n" + "The product is: " + product + "\n" + "The quotient is: "+ quotient);
        }
    }
}