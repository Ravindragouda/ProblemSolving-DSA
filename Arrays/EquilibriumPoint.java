package Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int res=equilibriumpoint(arr);
        System.out.println(res);
        System.out.println(equilibriumpoint(arr));
    }

    private static int equilibriumpoint(int[] arr) {
        int totalsum=0;
        for(int i:arr){
            totalsum+=i;
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            int rightsum=(totalsum-leftsum-arr[i]);
            if(leftsum==rightsum){
                return i+1;
            }
            leftsum+=arr[i];
        }
        return  -1;
    }

}
