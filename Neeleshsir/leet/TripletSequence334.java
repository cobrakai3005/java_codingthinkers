public class TripletSequence334 {

    public static void main(String[] args) {
       
       System.out.println(increasingTriplet());

    }


   static boolean increasingTriplet(){
        int nums[] = {1,2,3,4,5};
        int i = Integer.MIN_VALUE;
        int j = Integer.MIN_VALUE;
        int k = Integer.MIN_VALUE;
        for (int in = 0; in < nums.length; in++) {
            if(i >= nums[in]){
                i = nums[in];
            }else if(j >= nums[in]){
                j = nums[in];
            }else{
                return true;
            }
        }
        

        return false;
    }

}