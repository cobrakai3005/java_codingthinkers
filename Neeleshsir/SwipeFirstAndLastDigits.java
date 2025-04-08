public class SwipeFirstAndLastDigits {
    public static void main(String[] args) {
        swapFirstAndLastDigit();
    }
    static void swapFirstAndLastDigit(){
        int n = 46577;
        int num = n;
        int last = n %10; //7
        int count = 0;
    
        int first = 0;
        while (n > 0) {
            count++;
            first = n %10;
            n /= 10;   
        }
    
        int mid = num /10;  //4657
        int power = (int) Math.pow(10, count-2);
    
        mid = mid % power; // 657
        
        int ans = last * (int) Math.pow(10, digits(mid)) + mid;//7657
        ans = ans*10 + first; //76574
        System.out.println(ans);//Ans -->  76574
    
    
    
       }

       static int digits(int x){
        int count =0;
        while (x> 0) {
            count++;
            x /= 10;    
        }

        return count;
       }
}
