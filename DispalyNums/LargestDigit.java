public class LargestDigit {
    public static void main(String[] args) {
        int n=953;
        int largest=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit>largest){
                largest=digit;
            }
            
        }
        System.out.println("largest digit is : "+largest);
    }
}
