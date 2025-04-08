package IfElse;
import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks to get Grade: ");
        int marks = sc.nextInt();
        if(marks  > 90){
            System.out.println("Garde A");
        }
        else if(marks  > 80){
            System.out.println("Garde B");
        }
        else if(marks  > 70){
            System.out.println("Garde C");
        }
        else if(marks  > 60){
            System.out.println("Garde D");
        }
        else if(marks <= 60){
            System.out.println("Fail");
        }
    }
}
