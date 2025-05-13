public class MaxSumInSubArray {
   public static void main(String[] args) {
    int [] arr = {2, 5, 1, 8,2, 9, 1};

    System.out.println(maxSum(arr, 3));
    
   } 
   //Sliding Window
   static int maxSum(int [] nums, int k){
    int max = 0;
    int  j = 0;

    while ( j < k) {
        max += nums[j];
        j++;
    }
    int sum = max;
    while (j < nums.length ) {
        sum = sum - nums[j - k] + nums[j];
        max = Math.max( max, sum);
        j++;
    }

    System.out.println(max + " "+ j);
    return max;
   }
}
