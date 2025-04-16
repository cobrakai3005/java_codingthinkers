

public class AddOnePerDigits {
    public static void main(String[] args) {
       
     int n = 999;
     int plusOne = 0;
     int inc = 1;
     boolean carry = false;
     while (n > 0) {
        int rem = n % 10; 
        n /= 10;
        rem = (rem + 1 + (carry? 1: 0));
       if(rem > 9){
        carry = true;
       }else{
        carry = false;
       }
        plusOne = rem *inc + plusOne;
        inc *= 10;
        
     }
     System.out.println(plusOne);

    }
}
