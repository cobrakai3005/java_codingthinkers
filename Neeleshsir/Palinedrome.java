public class Palinedrome {
    public static void main(String[] args) {
        
        int num = 1234;
        if(reverse(num) == num){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    static int reverse(int num){
            int rev = 0;
            while (num> 0) {
                int rem = num %10;
                rev = rev*10 + rem;
                num /=10;
                
            }
            return rev;
     }
    
}
