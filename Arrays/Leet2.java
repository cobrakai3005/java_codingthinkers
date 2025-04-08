package Arrays;

import java.util.Arrays;

public class Leet2{
    public static void main(String[] args) {

    plusOne();

    }

    static int profit(){
        int [] prices = {7,1,5,3,6,4};

        int minBuy = prices[0];
        int ans = 0;
        int prof = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minBuy < prices[i]){
                  ans =  prices[i] - minBuy;
                  if(ans > prof){
                    prof =  prices[i] - minBuy;
                  }
            
            }else{
                minBuy =prices[i];
            }
        }

        return prof;
  
    
    }

    static void secondLargestEl(){
        int[] nums= {-1, -2, -3};
        int[] arr = nums;
        int max = arr[0];
        int maxI = 0;
        //First Find the largest number
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
                maxI = i;
            }
        }
        //Make it 0
        arr[maxI] = Integer.MIN_VALUE;
        //Then Again start a loop to find 
        //the largest number;
        // System.out.println(arr[0]);
        int secondLargestEl=  Integer.MIN_VALUE;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]> secondLargestEl){
                secondLargestEl = arr[i];
            }
        }
        System.out.println(secondLargestEl);


    }

    static void goodpair(){
        int[] arr = {1,  1, 1,1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i < j){
                    count++;
                }
            }
        }


        System.out.println(count);
    }

    static boolean digitGame(){
        int[] nums = {1, 2, 3, 4, 10};
        
        int sumSingle = 0;
        int sumDouble = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = countDigit(nums[i]);
            if(digits ==2 ){
                sumDouble += nums[i];
            }else if( digits == 1){
                sumSingle += nums[i];
            }
        }

        if(sumSingle > sumDouble) {
            return true;
        }else if(sumDouble > sumSingle){
            return true;
        }else{
            return false;
        }

      
       
    }

    static int countDigit(int num){
        int count = 0;
        while (num> 0) {
            num = num/10;
            count++;
        }
        return count;
    }

    static int arraySum (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum+= arr[i] ; 
        }

        return sum;
    }
    
    static void missingNumber(){
        int[] nums = {3,0,1, 2, 4, 6};
        int max = nums.length;

        
        // System.out.println(max);
        int missingNumber = 0;
        for (int i = 0; i <=  max; i++) {
        int present =  search(nums, i);
         if(present == -1){
            missingNumber = i;
        }
        }
        // System.out.println(search(nums, 2));
        System.out.println(missingNumber);
        
    }

    static int search(int[] nums, int target){
        int ans = -1;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == target){
                return nums[j];
            }
          }
        
        return ans;
    }

    static int[] plusOne(){
        //66
        int[] nums = {9, 9, 9};
        int[] arr = nums;
            for (int i = arr.length-1; i >= 0; i--) {
               if(arr[i] < 9){
                arr[i] = arr[i] +1;
                return arr;
               } else{
                arr[i] = 0;
               }
            }
          int[] arr2 = new int[nums.length +1]; 

          arr2[0] = 1;
          System.out.println(Arrays.toString(arr2));
          return arr2;

    }

    static int reverseNumber(int num){
        int ans = 0;
        while (num > 0) {
            int rem = num %10;
            num = num/10;
            ans = 10*ans + rem;
         }

         return ans;
    }

    static void concatinationOfArray(){
    int[] nums = {1,2,1} ;

    
    int[] arr = new int[nums.length + nums.length]; 

    for (int i = 0; i < nums.length; i++) {
        arr[i] = nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
        arr[nums.length + i] = nums[i];
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ") ;
        
    }
    

   
    }

    static void MinimuimOperationDivBy3(){
        int[] arr = {1,2,3,4};
         int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int  operation = divBy3(arr[i]);
            
           if(operation != 0){
            count++;
           }

        }

        System.out.println(count);
    }

    static int divBy3(int num){

       return num %3;
       
         
    }
    
    static void runningSum(){
        int[] nums = {3,1,2,10,1}; 

        int[] newNums = new int[nums.length];

        newNums[0] = nums[0];
        int sum = nums[0];
        for (int i = 1; i < newNums.length; i++) {
           sum += nums[i];
           newNums[i] = sum;
        }

        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + ", ");
        }
    }

    static void sortColors(){
        //Q75
    int[] nums = {2,0,2,1,1,0};

    int twos = 0;
    int ones = 0;
    int zeros  = 0;

    for (int i = 0; i < nums.length; i++) {
        if(nums[i] ==2 ){
            twos++;
        }
        if(nums[i] ==1 ){
        ones++;
        }
        if(nums[i] == 0){
            zeros ++;

        }
    }
  

    for (int i = 0; i < zeros; i++) {
        nums[i] = 0;
    }
    for (int i = 0; i < ones; i++) {
        nums[i+ ones] = 1;
    }
    for (int i = 0; i < twos; i++) {
        nums[i+ ones+ twos] = 2;
    }

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);
    }

    }

    static int thirdMax(){ 
        int [] nums = {1,1,2};
  
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]> max) {
            max = nums[i];       
           } 
        }

        if(nums.length == 2){
            return max;
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max2 && nums[i] < max){
                max2 = nums[i];
            }
        }            
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }  
       
        return (max3);
         
    }


    static void bubbleSort(){
        int[] nums = {4, 3, 6, 7, 2};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[j]< nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] =temp;
                }
                
            }
        }


        System.out.println(Arrays.toString(nums));
    }

    static void longestPrefix(){
        String[] strs = {"flower","flow","flight"};
        String res = "";
        for(int i = 0; i < strs.length; i++){
          String str = strs[i];
          
          for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j) == str.charAt(i)){
                res += str.charAt(i);
            }
          }

          System.out.println(res);
           
           } 
    } 

    static String longestPr(String str){
        String s= str;
        String res = "";

        for (char i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            res+= s.charAt(i);
        }
        return res;

    }
    

    //by Making an extra arra
    static void arrayRotaion1(){
       int[] arr= {1, 2, 3 , 4, 5};
       int n = arr.length;
       int k = 1;
       k = k%n;
       int[] nums = new int[n];
       int j = 0;

       for (int i = n-k; i < n; i++) {
        nums[j++] = arr[i];
       }
       for (int i = 0; i < n - k; i++) {
        nums[j++] = arr[i];
       }
    }




 }

