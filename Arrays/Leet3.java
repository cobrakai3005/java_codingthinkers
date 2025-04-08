package Arrays;

import java.util.Arrays;

public class Leet3 {
    public static void main(String[] args) {
       
        smallerNumbersThanCurrent();

    }

    static int[] twoSum(int[] nums, int target) {

        for(int i =0; i< nums.length; i++){

            for(int j = i+ 1; j<nums.length; j++){
                if(nums[j] +  nums[i] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};

    }

    static int[] reverseAnArray(){
       int[] arr = {23, 53, 1, 324 , 345465, 657, 753, 23}; 
       int start = 0;
       int end = arr.length -1;
       System.out.println(Arrays.toString(arr));
       while (start < end) {
        int temp  = arr[start];
        arr[start]  = arr[end];
        arr[end] = temp;
        start++ ;
        end-- ;
       }

       return arr;
    }

  static  void smallerNumbersThanCurrent(){
    int [] nums= {8,1,2,2,3};
    int [] arr = nums;
   
    
    for(int i = 0 ; i< nums.length; i++){
        int num = nums[i];
        int nos = func1(nums, num);
        arr[i] = nos;
    }

    System.out.println(Arrays.toString(arr));
  }

 static int func1(int[] nums, int num){
    int count = 0;
    for(int i = 0 ; i< nums.length; i++ ){
        if(num > nums[i]){
            count++;
        }
    }
        System.out.println(count);
        return count;
}
}
