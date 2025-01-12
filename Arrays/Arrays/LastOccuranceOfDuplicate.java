package Arrays;

public class LastOccuranceOfDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5};
       int[] res= lastOccuranceOfuplicates(arr);
       for (int i : res) {
        System.out.printf(i+" ");
       }
               
           }
       
           private static int[] lastOccuranceOfuplicates(int[] arr) {

                for (int i = arr.length-1; i >=0 ; i--) {
                    if(arr[i]==arr[i-1]){
                        return new int[]{i,arr[i]};
                    }
                    
                }
                return new int[]{-1,-1};
           }
}
