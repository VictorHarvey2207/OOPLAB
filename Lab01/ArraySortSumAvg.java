import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element [%d]: ", i);
            array[i] = scanner.nextDouble();
        }

        Arrays.sort(array);

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}