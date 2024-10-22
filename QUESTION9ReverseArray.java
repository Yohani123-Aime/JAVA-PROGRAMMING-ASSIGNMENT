public class QUESTION9ReverseArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {3, 4, 6, 1, 9, 7, 5, 8};

        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Reverse the array
        System.out.print("\nReversed Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

