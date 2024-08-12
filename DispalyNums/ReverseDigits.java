
public class ReverseDigits {
    public static void main(String[] args) {
        long n=200;
        System.out.println(reverse_digit(21));
    }
 

    public static long reverse_digit(long n)
    {
        // Code here
        long rev=0;
        while(n>0){
            long digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }

}
