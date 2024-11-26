package lab01;
import java.util.Scanner;
public class SolveEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of equation you want to solve:" + "\n" + "1: 1st deg, 1-var"
                                                                    + "\n" + "2: 1st deg, 2-var"
                                                                    + "\n" + "3: 2nd deg, 1-var");
        double type = scanner.nextDouble();
        if (type == 1) {
            System.out.println("a =: ");
            double a = scanner.nextDouble();

            System.out.println("b =: ");
            double b = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Infinite many solutions");
            }
            else {
                double sol = (-b)/a;
                System.out.println("x =: " + sol);
            }
        } else if (type == 2) {
            System.out.println("a11 =: ");
            double a11 = scanner.nextDouble();

            System.out.println("a12 =: ");
            double a12 = scanner.nextDouble();

            System.out.println("b1 =: ");
            double b1 = scanner.nextDouble();

            System.out.println("a21 =: ");
            double a21 = scanner.nextDouble();

            System.out.println("a22 =: ");
            double a22 = scanner.nextDouble();

            System.out.println("b2 = ");
            double b2 = scanner.nextDouble();
            
            double D1 = b1*a22 - b2*a12;
            double D2 = b2*a11 - b1*a21;
            double D = a11*a22 - a21*a12;

            if (D1 == 0 && D2 == 0 && D == 0) {
                System.out.println("Infinite solutions");
            } else if (D1 != 0 && D2 != 0 && D == 0) {
                System.out.println("No solutions");
            } else {
                double x1 = D1/D;
                double x2 = D2/D;
                System.out.println("x1 and x2 are: " + x1 + "," + x2);
            }
        } else {
            System.out.println("a =: ");
            double a = scanner.nextDouble();

            System.out.println("b =: ");
            double b = scanner.nextDouble();

            System.out.println("c =: ");
            double c = scanner.nextDouble();

            double delta = b*b - 4*a*c;
            if (a == 0) {
                double sol = (-c)/b;
                System.out.println("The solution is: " + sol);
            } else if (delta < 0) {
                System.out.println("No root");
            } else if (delta == 0) {
                double sol = (-b)/(2*a);
                System.out.println("The root is: " + sol);
            } else {
                double sol1 = ((-b) + Math.sqrt(delta))/(2*a);
                double sol2 = ((-b) - Math.sqrt(delta))/(2*a);
                System.out.println("The roots are: " + sol1 + "," + sol2);
            }
        } 
    } 
}
