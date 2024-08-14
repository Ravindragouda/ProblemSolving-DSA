package Algorithms.DSA.Solutions;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums []={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
        
    }
    public static int searchInsert(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]> target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                    low=mid+1;
            }
            else{
                return mid;
            }
        }
        return low;

        

    }
}
