package Pattern_Practice;

import java.util.Scanner;

/*
1.) Print the Pattern ;
          * * * * *
          * * * *
          * * *
          * *
          *

/*
    2. Print the Pattern 
        *
       **
      ***
     ****
     

     3.) Print the Pattern

     *****
      ****
       ***
        **
         *
    

    4.) Print the Pattern
       *   
      ***  
     *****   

    5.) Print the Pattern

         1 1
       1221
      123321
     12344321
 */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        //1.)   Print the Pattern

        // for (int i = 0; i <= n; i++) {
        //     for (int j = 1; j < n-i; j++) {
        //        System.out.print("*"); 
        //     }
        //     System.out.println();
            
        // }


        //2.) Print the Pattern

        // for (int i = 0; i < n; i++) {
            
        //     for (int j = 1; j < n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //3.) Print the Pattern

        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


         //4.) Print the Pattern

        //  for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < 2*i-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

         //5.) Print the Pattern

        //  for (int i = 0; i < n; i++) {

        //     for (int j = 1; j <= n-i; j++) {
        //     System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //      System.out.print(j);   
        //     }
        //     for (int j = i- 1; j >0; j--) {
        //      System.out.print(j);   
        //     }
        //     System.out.println();
            
        //  }

   //Not Correct

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n- i -1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i);
        //     }

        //     for (int j = 1; j <= 2*n - 3; j++) {
        //        System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i);
        //     }

        //     System.out.println();
        // }
    }
}
