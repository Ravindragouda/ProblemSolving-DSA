package Algorithms.DSA.Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>(List.of(1,2,3,4,5));
        int largest=secondLargest(al);
        System.out.println(largest);
        
    }

    private static int secondLargest(ArrayList<Integer> al) {
          // Code Here
          if (al == null || al.size() < 2) {
            return -1; // Return -1 if there is no second largest element
        }

        // Find the maximum element in the list
        int max = Collections.max(al);

        // Initialize the second largest to a minimum value
        int secondMax = Integer.MIN_VALUE;
        boolean found = false;

        // Traverse the list to find the second largest element
        for (int x : al) {
            if (x < max && x > secondMax) {
                secondMax = x;
                found = true;
            }
        }

        // If secondMax was updated, return it; otherwise return -1
        return found ? secondMax : -1;
    }
       
    }

