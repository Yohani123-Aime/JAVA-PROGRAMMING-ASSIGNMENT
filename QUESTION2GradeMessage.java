import java.util.Scanner;

public class QUESTION2GradeMessage {
    public static void main(String[] args) {
        // Ask the user to enter a grade (A, B, C, D, F)
        try ( // Create a Scanner object to get input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Ask the user to enter a grade (A, B, C, D, F)
            System.out.print("Enter your grade (A, B, C, D, F): ");
            char grade = scanner.next().charAt(0);
            // Use a switch statement to print messages based on the grade
            switch (grade) {
                case 'A' -> System.out.println("Excellent job!");
                case 'B' -> System.out.println("Good job!");
                case 'C' -> System.out.println("Well done, but there is room for improvement.");
                case 'D' -> System.out.println("You passed, but you need to work harder.");
                case 'F' -> System.out.println("You failed. Better luck next time.");
                default -> System.out.println("Invalid grade entered.");
            }
            // Close the scanner
        }
    }
}

