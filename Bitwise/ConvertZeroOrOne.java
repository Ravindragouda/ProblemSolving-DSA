package Bitwise;

import java.util.Scanner;

public class ConvertZeroOrOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int x=sc.nextInt();
        convertXtoZeroOrOne(x);
    }

    private static void convertXtoZeroOrOne(int x) {
        x=x^1;
        System.out.println(x);
    }
}
