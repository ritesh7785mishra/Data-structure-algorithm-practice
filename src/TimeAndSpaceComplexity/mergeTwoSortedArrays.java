package TimeAndSpaceComplexity;
import java.util.*;

public class mergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here
        int i=0;
        int j=0;
        int k=0;

        int[] c = new int[a.length + b.length];

        while(i<a.length && j< b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                k++;
                i++;
            }else if(b[j]<a[i]){
                c[k]=b[j];
                k++;
                j++;
            }

        }

        while(i<a.length){
            c[k] = a[i];
            k++;
            i++;
        }

        while(j<b.length){
            c[k] = b[j];
            k++;
            j++;
        }


        return c;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }
}
