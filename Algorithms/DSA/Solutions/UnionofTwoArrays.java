package Algorithms.DSA.Solutions;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionofTwoArrays {
    public static void main(String[] args) {
        int arr1[]={2, 2, 3, 4, 5};
        int arr2[]={1, 1, 2, 3, 4};
        int n=arr1.length;
        int m=arr2.length;
       //System.out.println(findUnion(arr1, arr2, n, m)); 
      System.out.println(unionoftwoArrays(arr1,arr2,n,m)); 
        
        
    }
    private static ArrayList<Integer> unionoftwoArrays(int[] arr1, int[] arr2, int n, int m) {

        Set<Integer> union=new TreeSet<>();
        for(int x:arr1){
            union.add(x);
        }
        for(int x:arr2){
            union.add(x);
        }
      return new ArrayList<>(union);
       
    }
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Add all elements from arr1 to result
        for (int i = 0; i < n; i++) {
            if (!result.contains(arr1[i])) {
                result.add(arr1[i]);
            }
        }
    
        // Add all elements from arr2 to result if they are not already present
        for (int j = 0; j < m; j++) {
            if (!result.contains(arr2[j])) {
                result.add(arr2[j]);
            }
        }
    
        return result;
    }
}

    

