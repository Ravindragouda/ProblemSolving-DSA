package Algorithms.Algo;


public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int target=40;

       
       System.out.println(linearSearch(arr,target)); 
    }

    static int linearSearch(int[] arr, int target) {
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            return i;
        }
       }
    return -1;
    }
    
}