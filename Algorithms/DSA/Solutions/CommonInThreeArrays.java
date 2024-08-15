package Algorithms.DSA.Solutions;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;

public class CommonInThreeArrays {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50,80};
        int arr2[]={50,80,90,70,75};
        int arr3[]={50,80,85,65,25};
       System.out.println(commonElements( arr1, arr2, arr3)); 
        
    }
   static List<Integer> commonElements(int arr1[], int arr2[],int arr3[])
    {
            TreeSet<Integer> h1=new TreeSet<>();
            TreeSet<Integer> h2=new TreeSet<>();
            TreeSet<Integer> h3=new TreeSet<>();
            for(int x: arr1){
                h1.add(x);
            }
            for(int x: arr2){
                if(h1.contains(x)){
                    h2.add(x);
                }
            }
            for(int x:arr3){
                if(h2.contains(x)){
                    h3.add(x);
                }
            }
            
            return new ArrayList<>(h3);
    }
}
