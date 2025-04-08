public class CountDigits {
 public static void main(String[] args){

    //count digits and sum of all digits
    int n = 45678;
    int count = 0;
    int sum = 0;
    while (n> 0) {
        count++;
        int rem = n %10;
        sum += rem;
        n /= 10;
    }    
       
 }   
}
