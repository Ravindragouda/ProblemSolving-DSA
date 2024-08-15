package Algorithms.DSA.Solutions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int arr[]={9};
        
     //  System.out.println(Arrays.toString(plusone(arr)));

       //for(int x:plusone(arr)){
        //    System.out.println(x+" ");
      // }

   System.out.println(Arrays.toString(adding1tolast(arr)));
    }

    private static int[] plusone(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]+1!=10){
                arr[i]+=1;
                return arr;
            }
            arr[i]=0;
        }
        int newarr[]=new int[arr.length+1];
        newarr[0]=1;
        return newarr;
       
    }

    static int[] adding1tolast(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]+1!=10){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int [] rr=new int[arr.length+1];
            rr[0]=1;
            return rr;
        
    }
    
}
