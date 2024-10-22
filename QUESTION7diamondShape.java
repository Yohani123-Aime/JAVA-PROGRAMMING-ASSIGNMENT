import java.util.Scanner;
public class QUESTION7diamondShape{
    public static void main (String[]args){
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the number for the diamond (half): ");
        int num = obj.nextInt();
        for (int i = 1; i <= num; i++) {
        for (int j = num; j > i; j--) {
        System.out.print(" ");
        }
            
        for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
        }
            
        System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            
         for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
            }
        System.out.println();
        }

      
        }
        }
