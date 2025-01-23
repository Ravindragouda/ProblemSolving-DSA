package PracticeAlgo;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

}
