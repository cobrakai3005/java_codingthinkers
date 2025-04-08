package Pattern;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner( System.in);
      int num = sc.nextInt();
          /*
          Print the Pattern

    1. Print
          * * * * *
          * * * *
          * * *
          * *
          *
          */

    //   for (int i = num; i > 0 ; i--) {
    //     for (int j = i; j > 0; j--) {        
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
      
    /*
    2. Print the Pattern 
        *
       **
      ***
     ****
     */
    //  for (int i = 1; i <= num; i++) {
    //     for (int j = 1; j <= num -i ; j++) {
    //      System.out.print(" ");
    //     }
    //     for (int j = 1; j < i; j++) {
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //  }


   /*  2. Print the Pattern 
     *****
      ****
       ***
        **
         *
     */

    //  for (int i = 0; i < num; i++) {
    //   for (int j = 0; j < i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = num - i; j > 0; j--) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    //  }

 /*  3. Print the Pattern 
       *   
      ***  
     *****   
     */
     for (int i = 0; i < num; i++) {
      for (int j = 1 ; j < num-i; j++) {
        System.out.print (" ");
      }
      for (int j = 0; j < 2*i-1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
     }
    }


    


     
}
