package Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        //creating a array you can take user input to keep it simple lets take lyk this
        int arr[]={10,20,0,30,0,40,0,50};
        //calling method by passing arr
        moveallzerotoend(arr);
        //printing the array elements after calling the method
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
//method for moving all zeros to end of array
    private static void moveallzerotoend(int[] arr) {
        //pointer to track last non zero element
        int lastindex=0;
        //traverse the array
        for(int i=0;i<arr.length;i++){
            //checking if element is not equal to zero and if its not then put it to lastindex and increment the lastindex
            if(arr[i]!=0){
                arr[lastindex]=arr[i];
                lastindex++;
            }
        }
        //filling the remaining positions with zeros
        for(int i=lastindex;i<arr.length;i++){
            arr[i]=0;
        }

    }

}
