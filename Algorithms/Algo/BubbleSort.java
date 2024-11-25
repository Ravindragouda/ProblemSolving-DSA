package Algorithms.Algo;

public class BubbleSort {
    public static void main(String[] args) {
        // Input array to be sorted
        int arr[] = {6, 4, 10, 15, 8, 2};

        // Display the array before sorting
        System.out.print("Array before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Call the bubbleSort method to sort the array
        int res[] = bubbleSort(arr);

        // Display the array after sorting
        System.out.print("Array after sorting: ");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    /**
     * Bubble Sort algorithm to sort an integer array in ascending order.
     * @param arr The input array to be sorted
     * @return The sorted array
     */
    private static int[] bubbleSort(int[] arr) {
        // Outer loop to control the number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to perform comparisons and swaps for each pass
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap using XOR operator to avoid temporary variable
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        // Return the sorted array
        return arr;
    }
}
