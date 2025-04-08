import java.util.Scanner;

public class GeeksPattern {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   //  System.out.println(n);

   //1.Hollow square
  /*  for (int i = 1; i <=n; i++) {
      for (int j = 1; j <= n; j++) {
         if( i == 1 || j ==1 || i ==n || j ==n){
            System.out.print("*");
         }else{
            System.out.print(" ");
         }
      }
      System.out.println();

   }
      */


      // 2. Number Triangle
/* 
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <=n -i; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <=i; j++) {
         System.out.print(i+ " ");
         }
         System.out.println();
      }

      */


      //3.) Number increasing Pyramid

      // for (int i = 1; i <=6; i++) {
      //    for (int j = 1; j <=i; j++) {
      //       System.out.print(j + " ");
      //    }
      //    System.out.println();
      // }


      // 4.) Number increasing reverse pyramid

      // for (int i = 1; i <=n; i++) {
      // for (int j = 1 ; j <= n - i +1 ;j++) {
      //    System.out.print(j + " ");
      // }
      // System.out.println();
      // }



      // 5.)Number Changing Pyramid Pattern

      // int m = 1;
      // for (int k = 1; k <= n; k++) {
      //    for (int i = 1; i <=k; i++) {
      //       System.out.print(m + " ");
      //       m++;
      //       // System.out.print(i);
      //    }
      //    System.out.println();
      // }



      //6.) Zero-One Triangle

      // for (int i = 1; i <=n; i++) {
      //    for (int j = 1; j <=i; j++) {
      //       if((i+ j) % 2 == 0){
      //          System.out.print("1 ");
      //       }else{
      //          System.out.print("0 ");
      //       }
      //    }
      //    System.out.println();
      // }


      // 7.) palindrome Trainle

      // for (int i = 1; i <=n; i++) {
      //       for (int j = 1; j <= n -i; j++) {
      //          System.out.print(" ");       
      //       }
      //       for (int j = i; j > 0; j--) {
      //          System.out.print(j);
      //       }
      //       for (int j = 1; j <=i; j++) {
      //          if(j != 1){

      //             System.out.print(j );
      //          }
      //       }
      //       System.out.println();
      // }


      // 8.) Rhombus pattern

      // for (int i = 1; i <= n; i++) {
      //    for (int j = 1; j <= n-i; j++) {
      //       System.out.print(" ");
      //    }

      //    for (int j = 1; j <= n; j++) {
      //    System.out.print("*");
      //    }

      //    System.out.println(); 
      // }



      //9>) Diamond star

      // for (int i = 1; i <=n; i++) {
      //    for (int j = 1; j <=n- i; j++) {
      //       System.out.print(" ");
      //    }

      //    for (int j = 1; j <=2*i -1; j++) {
      //       System.out.print("*");
      //    }

      //    System.out.println();
         
      // }
      // for (int i = n; i >=1; i--) {
      //    if(i != n){

      //       for (int j = 1; j <=n- i; j++) {
      //          System.out.print(" ");
      //       }   
      //       for (int j = 1; j <=2*i -1; j++) {
      //          System.out.print("*");
      //       }
   
      //       System.out.println();
      //    }
         
      // }



      //10.)BbutterFlie

     for (int i = 1; i <=n; i++) {
      for (int j = 1; j <=i; j++) {
         System.out.print("*");
      }

      for (int j = n-1;j>=2*n -i; j--) {
         System.out.print(" ");
      }
      for (int j = n- i; j >= 2*i -1; j--) {
         System.out.print("*");
      }


      System.out.println();

      
     } 
     
   } 
}
