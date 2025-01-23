package PracticeAlgo;

import java.util.Arrays;

public class SearchingAlgo {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 2, 1 };
        int key = 5;
        System.out.println(linearSearch(arr, key));
          //Array must be sorted inorder todo binarysearch
          Arrays.sort(arr);
        boolean res = binarySearch(arr, key);
        System.out.println("Binary search output >> "+res);

    }
//linear search O(N) time complexity
    private static boolean linearSearch(int arr[], int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }

        }
        return false;
    }
//binary serach O(LogN) time complexity
    private static boolean binarySearch(int[] arr, int key) {
      
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
            return false;
        

    }

}
