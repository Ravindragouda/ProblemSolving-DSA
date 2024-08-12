package Patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;
        // numberPyramid(n);
        // System.out.println("__________________________________________________");
        // System.out.println();
        // invertednumberPyramid(n);

        //continuenumberPyramid( n);

        continueZeroOrOnePyramid(n);
    }
    private static void numberPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
            System.out.println();
        }
    }
    

    private static void invertednumberPyramid(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
            System.out.println();
        }
    }
    private static void continuenumberPyramid(int n) {
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+"  ");
                num++;
            }
            System.out.println();
            System.out.println();
        }
    }
    private static void continueZeroOrOnePyramid(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
               
              
            }
            System.out.println();
            System.out.println();
        }
    }
}
