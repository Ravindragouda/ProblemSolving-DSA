package Arrays;


import java.util.ArrayList;
import java.util.Collections;

public class CommonElements {
    public static void main(String[] args) {
        int v1[]={3, 4, 2, 2, 4};
        int v2[]={3 ,2 ,2, 7};
        System.out.println(common_element(v1, v2));
        

    }
    
        public static ArrayList<Integer> common_element(int v1[], int v2[])
        {
            //Your code here
            ArrayList <Integer> al=new ArrayList<>();
            for(int x: v1){
                for(int y:v2){
                    if(x==y){
                        al.add(x);
                        break;
                    }
                }
            }
            Collections.sort(al);
            return al;
        
    }
}
