package Basics;
import java.util.Scanner;

public class DatatypeHomeWork {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you name: ");
    String name = sc.next();

    System.out.println("Enter you age: ");
    int age = sc.nextInt();
    
    sc.nextLine();
    System.out.println("Enter you college: ");
    String college = sc.nextLine();
    System.out.println(name);
    System.out.println(age);
    System.out.println(college);

 }   
}
