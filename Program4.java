import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 3, 1 };

        System.out.println("Original Array: " + Arrays.toString(array));

        // Sorting the array in ascending order
        bubbleSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped during an iteration, the array is already
            // sorted
            if (!swapped) {
                break;
            }
        }
    }
}