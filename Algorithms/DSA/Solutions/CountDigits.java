package Algorithms.DSA.Solutions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N : ");
        int N=sc.nextInt();
       int ans= Solution1.evenlyDivides(N);
       System.out.println(ans);

    }
}

class Solution{
    static int evenlyDivides(int N){
        // code here
        int og=Math.abs(N);
        int count=0;
        while(N>0){
            int digit=N%10;
            
            if(digit!=0 && og%digit==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }
}
