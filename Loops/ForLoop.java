package Loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /*
         Print
         1 2  3 4 5
         1 2  3 4 5
         1 2  3 4 5
         */
        for (int i =1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
       /*
         11   12   13
         21   22   23
         31   32   33
         */
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i+ "" +j+ " ");      
            }
            System.out.println();
         }
    }
    
}
