package Algorithms.Algo;

public class BubbleSort {
    public static void main(String[] args) {
        int arr []={6,4,10,15,8,2};
        System.out.print("Array before sorting : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int res[]=bubbleSort(arr);
        System.out.print(" Array after sorting :  ");
        for(int i:res){
            System.out.print(i+" ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;

                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }

        }
        return arr;
    }
}
