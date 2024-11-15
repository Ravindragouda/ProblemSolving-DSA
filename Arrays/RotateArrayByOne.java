package Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        rotate(arr);

    }

        public static void rotate(int[] arr) {
            // code here
            int n=arr.length;
            for(int i=0;i<n;i++){
                int p=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=p;
            }
            for(int i:arr){
                System.out.print(i+" ");
            }

        }

}
