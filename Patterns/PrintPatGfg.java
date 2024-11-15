import java.util.Scanner;

public class PrintPatGfg {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ; ");
        int n=scanner.nextInt();
        for (int i = n; i >0; i--) {
            System.out.print(i+" "+i);
            

            
        }
        System.out.println();
        
       
    }

    public static void printpat(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i+" "+i);
            System.out.println();

            
        }
    
    }
}
