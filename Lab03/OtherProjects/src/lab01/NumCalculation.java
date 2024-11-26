import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputNum1 = input.nextLine();
        String inputNum2 = input.nextLine();

        double firstNum = Double.parseDouble(inputNum1);
        double secondNum = Double.parseDouble(inputNum2);

        double sum = firstNum + secondNum;
        double difference = firstNum - secondNum;
        double product = firstNum * secondNum;

        if (secondNum != 0) {
            double quotient = firstNum / secondNum;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
