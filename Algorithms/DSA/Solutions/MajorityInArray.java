package Algorithms.DSA.Solutions;

import java.util.Arrays;

public class MajorityInArray {
    public static void main(String[] args) {
        int arr[]={3, 1, 3, 3, 2};
        int size=arr.length;
        System.out.println(majaorityElement(arr,size));
        
    }
   
        private static int majaorityElement(int[] a, int size) {
            if(size ==1) return a[0];
            Arrays.sort(a);
            int count =1;
        for(int i  = 0 ;i<size-1;++i){
            if(a[i]==a[i+1]) count++;
            else count = 1;
            if(count>size/2) return a[i];
        }
        return -1;
       
    }
        
}
