package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> ar= Arrays.asList(1,3,2,6,1,2);
        int n=ar.size();
                     int k=3;
        int         res=divisibleSumPairs(n,k,ar);
                   System.out.println(res);
    }

    private static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((ar.get(i)+ar.get(j))%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
