import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] ar = {5, 4, 3, 2, 1};
        bubbleSort(ar);
    }

   static public void bubbleSort(int[] ar){

    System.out.println(Arrays.toString(ar));
        int n  = ar.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -1; j++) {
                if(ar[j+1] < ar[j]){
                    swap( ar, j+1, j);
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

   static public void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i] =ar[j];
        ar[j] = temp;
    }

}