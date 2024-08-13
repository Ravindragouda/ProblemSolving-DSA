import java.util.HashSet;
import java.util.Scanner;

public class CommonNumbersinArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Common numbers in array problem ");
        int arr[]={10,20,30,40,50};
        int brr[]={20,40,50,60,20};
        int res=commonelements(arr,brr);
    }

    private static int commonelements(int[] arr, int[] brr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();
        
        // Add elements of the first array to the set
        for (int i : arr) {
            set.add(i);
        }
        
        // Check elements of the second array against the set
        for (int j : brr) {
            if (set.contains(j)) {
                commonElements.add(j);
            }
        }
        
        // Return the number of common elements
        return commonElements.size();



      
    }
}
