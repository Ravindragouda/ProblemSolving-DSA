public class SumofDigits {
    public static void main(String[] args) {
        // int n=222;
        // int sum=0;
        // while(n>0){
        //     int rem=n%10;
        //     sum=sum+rem;
        //     n=n/10;
        // }
        // System.out.println(sum);
       int res= sum(134);
       System.out.println(res);
    }

    private static int sum(int n) {
        if(n==0){
            return 0;
        }
        

        return sum(n/10)+n%10;
        
        
    }
}
