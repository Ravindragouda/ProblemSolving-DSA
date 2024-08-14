package Algorithms.DSA.Solutions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        System.out.println(arrayLeader(arr));
    }

    private static ArrayList<Integer> arrayLeader(int[] arr) {
        ArrayList<Integer> al=new ArrayList<>();
        int max=arr[arr.length-1];
        al.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                al.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(al);
        return al;
        
       
    }
}
