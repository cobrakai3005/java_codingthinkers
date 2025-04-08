package Basics;
import java.util.Scanner;

public class Opertors {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int num = sc.nextInt();
       int a = num;
       while (num > 0) {
         a = a %10;
        num= num / 10;
       }
       System.out.println(a);



       
       System.out.println(num%10);
       int aa = num/10;
       System.out.println(a%10);
       int b = a/10;
    //    System.out.println(b);
       System.out.println(b%10);
       System.out.println(b/10);
       System.out.println(num%10);
    }
}
