public class QUESTION10LargestInArray {
    public static void main(String[] args) {
        int[] array = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}

