public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int ft = 0, st = 1;
        System.out.print(ft + ", " + st); // Print the first two terms

        for (int i = 3; i <= n; i++) {
            int nt = ft + st;
            System.out.print(", " + nt);
            ft = st;
            st = nt;
        }
    }
}
