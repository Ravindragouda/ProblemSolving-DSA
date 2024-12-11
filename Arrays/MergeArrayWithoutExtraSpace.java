package Arrays;

import java.util.Arrays;

public class MergeArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int a[]={1,2,10,6};
        int b[]={5,3};
        mergeArrays(a,b);
        System.out.println("Array after merging: "+Arrays.toString(a)+" "+Arrays.toString(b));

            }
        
            private static void mergeArrays(int[] a, int[] b) {
              int n=a.length;
              int m=b.length;
              for(int i=n-1,j=0;i>0&&j<m;i--,j++){
                if(a[i]>b[j]){
                  int temp=a[i];
                  a[i]=b[j];
                  b[j]=temp;
                }
              }
              Arrays.sort(a);
              Arrays.sort(b);
              
            }
}
