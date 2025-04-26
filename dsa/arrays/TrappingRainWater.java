import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {

        //Brute Force Approach
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int water = 0;
    

        for (int i = 0; i < arr.length; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            for (int j = 0; j < i; j++) {
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            water += Math.min(leftMax, rightMax) - arr[i];

        }
       //System.out.println(water);
       trappedWater();
    }


    static void trappedWater(){
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

            //More  Efficient Way
            //calculate left max boundary
            int[] leftMax = new int[arr.length];
            leftMax[0] = arr[0];
    
            for (int i = 1; i < leftMax.length; i++) {
                leftMax[i] = Math.max(arr[i], leftMax[i-1]);
            }
            System.out.println(Arrays.toString(leftMax));
            //calculate right max boundary
    
            int [] rightMax = new int[arr.length];
            rightMax[arr.length-1] = arr[arr.length-1];
    
            for (int i = arr.length-2; i >= 0; i--) {
                rightMax[i] = Math.max(arr[i], rightMax[i+ 1]);         
            }
            System.out.println(Arrays.toString(rightMax));
            //loop 
            int tarppedWater = 0;
            for (int i = 0; i < arr.length; i++) {
            // calculate water level = min(left max boundary , rght max boundary)
            // Trapped water =  minOfLeftMaxAndRightMax = height
              int  minOfLeftMaxAndRightMax= Math.min(leftMax[i], rightMax[i]);
              tarppedWater += minOfLeftMaxAndRightMax - arr[i];
            }
    
            System.out.println(tarppedWater);
          
      
    }
}
