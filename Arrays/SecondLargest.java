package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,2,30,40};
        System.out.println(secondLargest(arr));

    }
    public static int secondLargest(int arr[]){
        int large=-1,secondLargest=-1;
        for(int i:arr){
            if(i>large){
                secondLargest=large;
                large=i;
            }
            if(i>secondLargest && i<large){
                secondLargest=i;
            }
        }
        return secondLargest;

    }
}
