package Arrays;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Arrays.sort(arr);
        System.out.println("Using built in method : "+arr[arr.length-1]);
        System.out.println(largestNumber(arr));
    }

    private static int largestNumber(int[] arr) {
        int max=arr[0];
       
            for (int j = 1; j < arr.length; j++) {
                if(max<arr[j]){
                    max=arr[j];
                }
            }
        
      return max;
    }
}
