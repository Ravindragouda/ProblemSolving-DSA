package Algorithms.Algo;


public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {2,8,4,6};
        //selectionSort(arr);
        SelectionSortApp.selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        // int n=arr.length;

        // for (int i = 0; i < n-1; i++) {
        //     int min_idx=i;
        //     for (int j = i+1; j < n; j++) {
        //         if(arr[j]<arr[min_idx]){
        //             min_idx=j;
        //         }
        //         int temp=arr[min_idx];
        //         arr[min_idx]=arr[i];
        //         arr[i]=temp;
        //     }
        // }
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted aray is : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class SelectionSortApp {
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min!=i) {
                arr[min] = arr[min] ^ arr[i];
                arr[i] = arr[min] ^ arr[i];
                arr[min] = arr[min] ^ arr[i];
            }
        }
        System.out.println("Array sorted using selection sort :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}