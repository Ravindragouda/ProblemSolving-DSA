package Patterns;

public class SquarePattern {
    public static void main(String[] args) {
        int rows=5;
        int col=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________________________________________");
        hallowsquare(rows,col);
    }

    private static void hallowsquare(int rows, int col) {
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
               if(i>=2 && j>=2 &&i<=rows-1 &&j<=rows-1 && j!=rows-i+1 && i!=j){
                System.out.print("  ");
               }
               
               else{
                System.out.print("*"+" ");
               }
            }
            System.out.println();
        }
    }
}
