import java.util.Arrays;

public class LastIndex {
    public static void main(String[] args) {
       int[] arr = {1, 2, 12, 2, 1,2 } ;
       int target = 12;
       int num = 0;
       int idx = -1;

       for (int i = 0; i < arr.length; i++) {
        if(arr[i] == target){
            num= num *10 + i;
            idx = i;
        }
       }

       System.out.println(num);
       System.out.println(idx);
    }
}
