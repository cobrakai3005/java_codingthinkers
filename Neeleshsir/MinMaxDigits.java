public class MinMaxDigits {
    public static void main(String[] args) {
   
        int num = 46567;
        int max = maxDigit(num);
        int min= minDigit(num);
        System.out.println(max + min);
    }

    static int maxDigit(int n){
    int max = Integer.MIN_VALUE;
    while (n> 0) {
    int rem = n %10;
    if(rem > max ){
      max = rem;
    }
        
        n /= 10;
          
    }
      System.out.println(max);
      return max;
     }


     static int minDigit(int n){
      
      int min = Integer.MAX_VALUE;
      while (n> 0){
          int rem = n %10;
          if(rem < min ){
              min = rem;
      }
          
       n /= 10;
          
      }
      System.out.println(min);
      return min;
     }
}
