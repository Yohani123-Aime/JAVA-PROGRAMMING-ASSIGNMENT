public class QUESTION8AverageOfelementofArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {10, 12, 34, 23, 56, 78};

        // Variable to store the sum of all elements
        int sum = 0;

        // Loop through the array and calculate the sum of elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Print the sum and the average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}


