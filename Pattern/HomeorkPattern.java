package Pattern;
import java.util.Scanner;

public class HomeorkPattern {
    public static void main(String[] args) {
        /*
        Print Patern
         1
       1221
      123321
     12344321

         */

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
         for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
             System.out.print(j);   
            }
          if(i > 1){
            for (int j = i; j >=1; j--) {
               System.out.print(j); 
            }
          }
            System.out.println();
            
         }


         
    }
}
