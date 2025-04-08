package IfElse;
import java.util.Scanner;

public class IfElseHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();
    
        // int min = num ;
        // if(num2 < min){
        //     min = num2;
        // }
        // if(num3< min){
        //     min = num3;
        // }
        // System.out.print("Mininuim number is");
        // System.out.println(min);



        //For 2 digits 
        // if(num < num2){
        //     System.out.println("num is Mininuim");
        // }else{
        //     System.out.println("num2 is Mininuim");
        // }




        if(num < num2){
            if(num< num3){
                System.out.println(num);
            }else{
                System.out.println(num3);
            }
        }else{
            if(num2< num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }
    }
}
