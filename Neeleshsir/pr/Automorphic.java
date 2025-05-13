public class Automorphic {
   public static void main(String[] args) {
    System.out.println(automorphic(76));
   } 

   static boolean automorphic(int num){
    int n = num;
    int sq = n * n;

    int digits = countDigits(num);
    
    int auto = sq % (int) Math.pow(sq, digits);
    if(n == num){
        return true;
    }

    return false;
   }

   static int countDigits(int num){
    int count = 0;
    while (num > 0) {
        count++;
        num /= 10;
    }

    return count;
   }
}
