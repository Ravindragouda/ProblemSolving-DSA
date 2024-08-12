package Arrays;

import java.util.Arrays;

public class SmallestNUmberInArray {
    public static void main(String[] args) {
        int arr[]={10,20,3,40,50};
        Arrays.sort(arr);
        System.out.println("Using arrays sort approach :  "+arr[0]);
       System.out.println(smallestNumber(arr)); 
    }

    private static int smallestNumber(int[] arr) {
        int min=arr[0];
        
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            
        
        return min;
      
    }


}
