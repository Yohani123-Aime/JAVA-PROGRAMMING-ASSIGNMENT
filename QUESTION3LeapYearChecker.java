import java.util.Scanner;

public class QUESTION3LeapYearChecker {
    public static void main(String[] args) {
        // Ask the user to enter a year
        try ( // Create a Scanner object to get input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Ask the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            // Close the scanner
        }
    }
}

