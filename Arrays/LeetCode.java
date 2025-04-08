package Arrays;
import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        reverseArray();
    }

    static void numberWithEvenDigits(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if(even(nums[i])){
            count++;
           }
           
        }
    }


    static void minimuimDigitsSumInArray(){
       int[]  nums ={10,12,13,14};
       for (int i = 0; i < nums.length; i++) {
         nums[i] = digitsum(nums[i]);
        }
      int min = nums[0];
      for (int i = 1; i < nums.length; i++) {
         if(nums[i] < min){
          min = nums[i]; 
         }
      }
      System.out.println(min); 
    }

    static boolean even(int num){
        int digit = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num/10;
            digit++;
        }

        return digit % 2 == 0;
    }

    static int differenceOfSum(int[] arr){
        int sum = sumOfAnArray(arr);
        int sumD = 0;
        for (int i = 0; i < arr.length; i++) {
         int digits = digitsum(arr[i]);
         sumD += digits;
        }
     
        System.out.println(sum);
        System.out.println(sumD);
     
     //    Difference 
      return (sum - sumD);
    }

    static int sumOfAnArray(int[] arr){
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
        }
        return sum;

    }

    static int digitsum(int num){
        int digitsum = 0;
            while ( num > 0) {
                int rem = num%10;
                digitsum += rem;
                num = num /10;   
            }

    return digitsum;
}

    static void reverseArray(){

        int[] arr = {1, 2, 3,4 , 5};
        System.out.println(Arrays.toString(arr));
        int[] nums = new int[arr.length];
        int j = 0;

        for (int i = arr.length-1;  i >=0; i--) {
            nums[j++] = arr[i];

        }
        System.out.println(Arrays.toString(nums));

    }

    static void reverseArray2(){
    int[] arr = {1, 2, 3, 4, 5, 6};
    int start = 0;
    int end = arr.length-1;
        while (start < end) {
            swap(arr, arr[start], arr[end]);
            start++;
            end--;
        }
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    
}
