class Prime
{
    public static void main(String[] args){
        int n=3;
        primecheck(n);
    }

    private static void primecheck(int n) {
        int count=0;
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                count=1;
                break;

            }
        }
        if(count==0 && n%2==0){
            System.out.println("is even prime");
        }
        else if(count==0&& n%2!=0){
            System.out.println("is odd prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }

}