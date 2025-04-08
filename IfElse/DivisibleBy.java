package IfElse;
import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 7 ==0){
            System.out.println("DivisibleBy  both");
        }else if(num % 5 == 0 && num % 7 !=0){
            System.out.println("DivisibleBy  5");
        }
        else if(num % 5 != 0 && num % 7 ==0){
            System.out.println("DivisibleBy  7");
        }else if(num % 5 != 0 && num % 7 !=0){
            System.out.println("not divisble");
        }
    }
}
