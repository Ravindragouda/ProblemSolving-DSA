package Algorithms.Algo;



public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int target=40;
        System.out.println(binarySearch(arr,target));
    

   
}

    private static int binarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid])
            {
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            
        }
        return -1;
       
       
       
       
    }
}
