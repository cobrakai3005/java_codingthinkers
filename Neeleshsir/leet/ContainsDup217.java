public class ContainsDup217 {

    public static void main(String[] args) {
      int[] arr = {1,2,3,1};

      System.out.println(freq(arr));
    }


    static boolean freq(int[] arr){
        for (int i = 0; i < arr.length; i++) {
          int present = presentB(arr[i], arr);
          if(present >= 2){
           return true;
          }
          
        }
        return false;
    }
 
    static int presentB(int num, int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " " + num );
            if(num == nums[i]){
                count ++;
            }
        }

        return count > 0 ? count : -1;
    }


    //Another method
    
}