package Patterns;
import java.util.Scanner;

public class Trianglepatwith0or1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       // trianglepatwithzeroOrOne(n);
        zeroOronepat(n);
        
    }

    private static void zeroOronepat(int n) {
        int key=1;
       for(int i=0;i<=n+1;i++){
        for(int j=1;j<i;j++){
            System.out.print(key+" ");
            key=1-key;
        }
        System.out.println();
       }
    }

    private static void trianglepatwithzeroOrOne(int n) {

        int key=15;
       for(int i=n;i>=0;i--){
        for(int j=i;j<n;j++){
            System.out.print(key+" ");
        }
        System.out.println();
       }
    }
}
