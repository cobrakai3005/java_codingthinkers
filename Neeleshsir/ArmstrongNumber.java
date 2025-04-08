public class ArmstrongNumber {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 1000; i++) {
            if(isArmstrongNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }

     static boolean isArmstrongNumber(int num){
      
      int n1 = num;
      int digitCount = countDigit(num);

      int sum = 0;
      while (num> 0) {
        int rem = num%10;
        sum += Math.pow(rem, digitCount);
        num = num/10;
      }
      
      return  sum == n1;
    }
  
    static int countDigit(int n){
      
        int count = 0;

        while (n> 0) {
            count++;
            int rem = n %10;
     
            n /= 10;
        }   
        return count; 
    }
}
