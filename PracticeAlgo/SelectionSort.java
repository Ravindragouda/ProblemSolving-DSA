package PracticeAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 2, 1 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    /*
     * private static void selectionSort(int[] arr) {
     * int temp=0;
     * for(int i=arr.length;i>0;i--){
     * for(int j=arr.length-1;j>0;j--){
     * if(arr[j]<arr[j-1]){
     * temp=arr[j];
     * arr[j]=arr[j-1];
     * arr[j-1]=temp;
     * }
     * }
     * }
     * 
     * }
     */

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_idx]) {
                    min_idx=j;
                    
                }
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
     

    }
}
