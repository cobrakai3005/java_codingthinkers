import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        
        int ar1[] = {1, 3, 5,7 };
        int ar2[] ={2, 4, 6, 8};
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        merge(ar1, ar2);
    }

    public static void merge(int[] ar1,int[] ar2 ){
        int[] ar = new int[ar1.length + ar2.length];
        int i = 0, j =0, k =0;
        while (i < ar1.length && j < ar2.length) {
            if(ar1[i] < ar2[j]){
                ar[k] =ar1[i];
                i++;
                k++;
            }else{
              ar[k] = ar2[j];
              j++;
              k++;  
            }
        }

        while (i < ar1.length) {
            ar[k] = ar[i];
            i++;
            k++;
        }
        while (j < ar2.length) {
            ar[k] = ar2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ar));
        int mid = ar.length/2;
        int median;
        if(ar.length %2 == 0) {

          median = (ar[mid] + ar[mid-1])/2;
          System.out.println(median);
          return;
        }
        median = mid;
    }

}
