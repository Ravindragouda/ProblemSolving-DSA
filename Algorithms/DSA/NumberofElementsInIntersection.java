package Algorithms.DSA;

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
       int sol= Solution.isPerfectNumber(10);
       System.out.println(sol);

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
class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N>0){
        int sum=0;
        for(int i=1;i<N;i++){
            if(N%i==0){
                sum+=i;
            }
        }
        if(sum==N){
            return 1;
        }
        else{
            return 0;
        }
        }
        else{
            return 0;
        }
    }
};
