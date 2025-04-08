public class Arrays {
   //Arrays Practice;
   public static void main(String[] args) {
      largestElInArray();
   } 

   static void largestElInArray(){
      /*
       arr = [1, 8, 7, 56, 90]
       output: 90
       */
       int[] arr = {1, 8, 7, 90};
       int max = Integer.MIN_VALUE;

       for (int i = 0; i < arr.length; i++) {
         if(arr[i] > max){
            max = arr[i];
         }
       }

       System.out.println(max);

   }


}
