package IfElse;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter you current salary;");
        int salary = sc.nextInt();
        System.out.println("Enter you experience in yeares");
        int experience = sc.nextInt();

        
        char gender = sc.next().charAt(0);
        System.out.println("Enter your gender");


        if(experience <= 2 && experience >=1 ){
            if(gender == 'm'){
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *1/10));
            }else{
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *12/10));
            }
        
        }
        else if(experience >= 5 && experience >=3 ){
            if(gender == 'm'){
                System.out.print("Your Salary and bonus are");
                System.out.println("gender m");
                System.out.print(salary + (salary *2/10));
            }else{
                System.out.print("Your Salary and bonus are");
                System.out.println("gender f");
                System.out.print(salary + (salary *22/10));
            }
           
        }
        else if(experience <= 10 && experience >=6 ){
            if(gender == 'm'){
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *3/10));
            }else{
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *32/100));
            }
          
        }
        else if(experience > 10 ){
            if(gender == 'm'){
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *4/10));
            }else{
                System.out.print("Your Salary and bonus are");
                System.out.print(salary + (salary *42/100));
            }
           
        }
    }
}
