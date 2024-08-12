public class Palindrome {
    public static void main(String[] args) {
        int n=2332;
        int on=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==on){
            System.out.println(on+" is a palindrome");
        }
        else{
            System.out.println(on+" is not a palindrome");
        }
        //we can make any number into palindrome by just adding original and 
        //rev of a number in string format
        System.out.println(on+""+rev);
        


    }
}
