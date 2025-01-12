package Arrays;

public class LastIndexOfOne {

    public static void main(String[] args) {
        String str = "0001";
        int index = lastIndexOfOne(str);
        System.out.println("Last Index of 1 found at "+index);
    }

    private static int lastIndexOfOne(String str) {
        for(int i=str.length()-1;i>=0;i--){
           if(str.charAt(i)=='1'){
            return i;
           }
        }
        return -1;

    }
}