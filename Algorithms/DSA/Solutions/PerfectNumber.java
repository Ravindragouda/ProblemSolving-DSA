package Algorithms.DSA.Solutions;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int sol= Solution.isPerfectNumber(10);
        System.out.println(sol);
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

class Solution2 {
    static int isPerfectNumber(long N) {
        // Edge case for non-positive numbers
        if (N <= 0) {
            return 0;
        }

        long sum = 1; // Start with 1 because 1 is a proper divisor of any number
        
        // Iterate from 2 to the square root of N
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }
        
        // Check if sum of divisors equals the number itself
        if (sum == N && N != 1) {
            return 1;
        } else {
            return 0;
        }
    }
};
