import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
      isStrongNumber(35456);

        for (int i = 100; i <= 200000; i++) {
          if(isStrongNumber(i)){
              System.out.print(i+ " ");
          }
      }
    }


    
  
    static boolean isStrongNumber(int num){
      // Scanner sc = new Scanner(System.in);
      //Strong Number;
      // Count digits
      // int num = sc.nextInt();

      int  h= num;
      int ans = 0;
      while (num > 0) {
        int fact = 1;
        int  rem = num % 10; 
          for (int i = 1; i <=rem; i++) {
            fact *= i;
          }
        num = num / 10;
        ans += fact;
      }  

      // if(ans == h){
      //   System.out.println("Strong number");
      // }else{
      //   System.out.println("Not STrong");
      // }

      return ans == h;
    }
}
