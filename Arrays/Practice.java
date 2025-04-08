import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3,4, 5}; 
       System.out.println(Arrays.toString(arr));
       int copy = arr[0];
       for (int i = 0; i <= arr.length; i++) {
        arr[i] = arr[i+1];
       }
       arr[arr.length-1] =copy;
       System.out.println(Arrays.toString(arr));
    }
}
