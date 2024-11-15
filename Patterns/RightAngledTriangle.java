

public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows=10;
        int col=10;
        // for(int i=0;i<=rows;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*"+"  ");
        //     }
        //     System.out.println();
        // }
        //hallowTriangle(rows,col);
        rhombus(rows);
    }

    private static void rhombus(int rows) {
      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <rows ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    private static void hallowTriangle(int rows, int col) {
      for(int i=1;i<=rows;i++){
        for(int j=1;j<i;j++){
            if(i==rows || j==1 || i==j){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("*"+" ");
            }
        }
        System.out.println();
      }
    }


}
