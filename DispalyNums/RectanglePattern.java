public class RectanglePattern {
    public static void main(String[] args) {
        //rectanglepattern();
        //System.out.println(" __________________________next pattern  ___________________________");
        //rightangletriangle();
        numberpattern();
    }


    private static void numberpattern() {
        // TODO Auto-generated method stub
        int a=1;
		for(int i=1;i<=5;i++) 
		{
			
			for(int j=1;j<=5;j++)
				
			{
				if(a<=9) 
					
				System.out.print("0"+a+"\t");
				else {
					System.out.print(a+"\t");
				}
			a++;
			
			}
			System.out.println();
		}

        
    }


    private static void rightangletriangle() {
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("*  ");
            }
            System.out.println();
            System.out.println();
        }    
    }

    private static void rectanglepattern() {
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }   
    }


}
