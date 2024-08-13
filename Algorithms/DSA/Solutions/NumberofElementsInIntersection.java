package Algorithms.DSA.Solutions;

import java.util.HashSet;
import java.util.Scanner;

public class NumberofElementsInIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the two array ");
        int a[]={10,20,30,40,50};
        int b[]={30,40,50,60,70};
        int n=a.length;
        int m=b.length;
       // int res= numberofElementsInIntersection(a, b, n, m);
       // System.out.println(res);

        //System.out.println(countofElementsInIntersection(a,b));
       

    }
    private static int countofElementsInIntersection(int[] a, int[] b) {
        HashSet<Integer> h1=new HashSet<>();
        for(int x:a){
            h1.add(x);
        }
        HashSet<Integer> h2=new HashSet<>();
        for(int x:b){
            if(h1.contains(x)){
                h2.add(x);
            }
        }
        return h2.size();
        
    }
    public static int numberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        return count;
    }


}

