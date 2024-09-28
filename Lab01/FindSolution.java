import java.util.Scanner;

public class SolutionFinder {
    public static class LinearEquation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inputA = scanner.nextLine();
            String inputB = scanner.nextLine();
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            
            if (a == 0) {
                System.out.println("The equation has no root!");
            } else {
                double solution = -b / a;
                System.out.println("The solution is: " + solution);
            }
        }
    }

    public static class QuadraticEquation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inputA = scanner.nextLine();
            String inputB = scanner.nextLine();
            String inputC = scanner.nextLine();

            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double c = Double.parseDouble(inputC);

            double discriminant = b * b - 4.0 * a * c;
            if (a == 0) {
                System.out.println("a cannot equal 0");
            } else if (discriminant < 0) {
                System.out.println("There is no real root!");
            } else if (discriminant == 0) {
                System.out.println(-b / (2 * a));
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminant)) / (2.0));
                System.out.println("x2 = " + (-b - Math.sqrt(discriminant)) / (2.0));
            }
        }
    }

    public static class TwoVariableSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inputA = scanner.nextLine();
            String inputB = scanner.nextLine();
            String inputC = scanner.nextLine();
            String inputD = scanner.nextLine();
            String inputE = scanner.nextLine();
            String inputF = scanner.nextLine();

            double a11 = Double.parseDouble(inputA);
            double a12 = Double.parseDouble(inputB);
            double b1 = Double.parseDouble(inputC);
            double a21 = Double.parseDouble(inputD);
            double a22 = Double.parseDouble(inputE);
            double b2 = Double.parseDouble(inputF);

            double determinant = a11 * a22 - a12 * a21;
            double determinant1 = b1 * a22 - b2 * a12;
            double determinant2 = a11 * b2 - a21 * b1;

            if (determinant == 0) {
                if ((a21 != 0 && a22 != 0 && b2 != 0) &&
                        (a11 / a21 == a12 / a22) &&
                        (a12 / a22 == b1 / b2) &&
                        (a11 / a21 == b1 / b2)) {
                    System.out.println("The system has infinitely many solutions!");
                } else {
                    System.out.println("The system has no root!");
                }
            } else {
                System.out.println("x1 = " + determinant1 / determinant);
                System.out.println("x2 = " + determinant2 / determinant);
            }
        }
    }
}
