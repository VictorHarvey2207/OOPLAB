import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        String[] validMonths = {
            "January", "February", "March", "April", "May", "June", "July", 
            "August", "September", "October", "November", "December",
            "Jan.", "Feb.", "Mar.", "Apr.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", 
            "Nov", "Dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "11", "12"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        String monthInput = scanner.nextLine();

        while (!Arrays.asList(validMonths).contains(monthInput)) {
            System.out.println("Invalid input!\nEnter month:");
            monthInput = scanner.nextLine();
        }

        System.out.println("Enter year:");
        int yearInput;
        while (true) {
            try {
                yearInput = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!\nEnter year:");
                scanner.next(); 
            }
        }

        scanner.close();

        String[] thirtyOneDays = {
            "January", "March", "May", "July", "August", "October", "December",
            "Jan.", "Mar.", "Aug.", "Oct.", "Dec.",
            "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec", "1", "3", "5", "7", "8", "10", "12"
        };
        
        String[] thirtyDays = {
            "April", "June", "September", "November", "Apr.", "Sept.", "Nov.",
            "Apr", "Jun", "Sep", "Nov", "4", "6", "9", "11"
        };

        if (Arrays.asList(thirtyOneDays).contains(monthInput)) {
            System.out.println("31 days");
        } else if (Arrays.asList(thirtyDays).contains(monthInput)) {
            System.out.println("30 days");
        } else {
            if (yearInput % 4 == 0 && (yearInput % 100 != 0 || yearInput % 400 == 0)) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        }
    }
}
