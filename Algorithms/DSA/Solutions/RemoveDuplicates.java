package Algorithms.DSA.Solutions;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
    }
    static int remove_duplicate(List<Integer> arr) {
        // Code Here
        if(arr==null || arr.size() == 0) return 0;
        
        int i =0;
        
        for(int j = 1; j < arr.size();j++){
             if(!arr.get(i).equals(arr.get(j))){
                i++;
                arr.set(i, arr.get(j));
            }
        }
      
        
        return i+1;

    }
    }


