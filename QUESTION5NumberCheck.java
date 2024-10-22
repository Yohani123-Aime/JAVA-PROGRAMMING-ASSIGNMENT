import java.util.Scanner;

public class QUESTION5NumberCheck {
    public static void main(String[] args) {
        // Ask the user to enter a number
        try ( // Create a Scanner object to get input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            // Check if the number is positive, negative, or zero
            if (num > 0) {
                System.out.println(num + " is a positive number.");
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
            // Close the scanner
        }
    }
}

