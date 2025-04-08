
import java.util.Scanner;

class Student{
    String name;
    int age;
    int rol;
    void studying(){
        System.out.print("Student Studing");
    }
}

class Car {
    String name;
    String color;
    String model;
    String wheels; 
    int price;
    int speed;

    void break_(){
        speed--;
        if(speed == 0){
            System.out.println("STop");
        }
    }
    void accelerate(){
        speed++;
       
    }
    void details(){
      System.out.println("Your Car name is "+  name+ " ");
      System.out.println("Your Car price is "+price+ " ");
      System.out.println("Your Car modle is "+model+ " ");
      System.out.println("Your Car speed is "+speed+ " ");
      System.out.println("Your Car coloe is "+color+ " ");
       
    }
    

     
    void driving(){
        System.out.println(name+ " is driving");
    }

}


class Employee{
    String name ;
    String Post ;
    String Experience;
    int Salary;
    void details(){
        System.out.println("Employee Name is " + name);
        System.out.println( "Employee Post is "+ Post);
        System.out.println("Employee Experience is "+ Experience);
        System.out.println("Employee Salary is "+ Salary);
    }

}

 
public class FirstClass {

    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Himanshu";
        // s1.age = 18;
        // s1.rol = 12;
        // s1.studying();
        // System.out.println(s1.name+ " " + s1.age+ " "+ s1.rol);


        Scanner sc =  new Scanner(System.in);
        // Car car1 = new Car();
        // System.out.println("Enter car Name");
        // car1.name =sc.nextLine();
        // System.out.println("Enter car Wheels");
        // car1.wheels = sc.nextLine();
        // System.out.println();
        // System.out.println("Enter car Color");
        // car1.color =sc.nextLine();
        // System.out.println();
        // System.out.println("Enter car Model");
        // car1.model = sc.nextLine();
        // System.out.println();
        // System.out.println("Enter car Price");
        // car1.price = sc.nextInt();
        // System.out.println();
        // System.out.println("Enter car speed");
        // car1.speed = sc.nextInt();
        // System.out.println();
        // car1.details();
        // System.out.println();

        Employee emp1 = new Employee();
        System.out.println("Enter name");
        emp1.name = sc.nextLine();

        System.out.println("Enter Post");
        emp1.Post = sc.nextLine();

        System.out.println("Enter Salary");
        emp1.Salary = sc.nextInt();


        System.out.println("Enter Experience");
        emp1.Experience = sc.nextLine();
        emp1.details();
   
    }
}
