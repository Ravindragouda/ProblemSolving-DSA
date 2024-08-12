public class SmallestNumber {
    public static void main(String[] args) {
        //int arr[]=new int[5];
       int arr[]={7,2,3,4,5};
       //smallest(arr);
       prime(arr);
    }

    private static void prime(int[] arr) {
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            count=0;
            for(int j=2;j<=arr[i];j++){
               if(arr[i]%j==0){
                    count++;
               }
            }
            if(count==1){
                System.out.println(arr[i]+" ");
            }
        }
    }

    private static void smallest(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
    System.out.println(min);
    }
}
