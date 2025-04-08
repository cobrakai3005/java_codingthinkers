package Pattern;

import java.util.Scanner;

/*
 *   *
   *
 *   *
 */
public class Pattern2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // for (int i = 1; i <=n; i++) {
            //     for (int j = 1; j <= n; j++) {
            //         if(i == j || i + j == n+1){
            //             System.out.print("*");
            //         }else{
            //             System.out.print(" ");

            //         }
            //     }
            //     System.out.println();
        //     // }
        //   for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if(i == 2 || j== 2){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }

        //     System.out.println();
            
        //   }

// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= n; j++) {
//         if(i == 1|| j== 1 || j == n || i == n){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
        
//     }
//     System.out.println();
    
// }

// for (int i = 1; i <= 2*n -1 ; i++) {
//     for (int j = 1; j <= n; j++) {
//         if((i +j)  <= 2*n -2 && (i -j)>=0){

//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
//    System.out.println();

// }


// for (int i = 1; i <=2*n - 1 ; i++) {
//     for (int j = 1; j <= n; j++) {
//         if((i + j)>= 4 && (i - j)<= 2){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
for (int i = 1; i <=n ; i++) {
    for (int j = 1; j <= n; j++) {
        if( (i>= j && (i =j)<= n-1) || (j>=i  &&(i+j)>=n-1)){
            System.out.print("*");
        }else{ 
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
}
