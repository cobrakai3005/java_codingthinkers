package inheitence_;

abstract class Employee{
    String name;
    int employeId;
    int salary;

    Employee(String name, int employeId){
        this.name =name;
        this.employeId = employeId;
    }
    abstract void calculateSalary();

    void showDetails(){
        System.out.println("Details Of Employe " );
        System.out.println("Employee: "+ name );
        System.out.println("ID: "+ employeId );
        System.out.println("Salary: "+ salary );
    }
}

class FullTimeEmployee extends Employee{

    void calculateSalary(){
        this.salary = 200000;
    } 
    FullTimeEmployee(String name, int employedId){
        super(name, employedId);
    }
}

class PartTimeEmployee extends Employee{
    int hours;
    void calculateSalary(){
        this.salary = hours * 5000;
    
    }  
    PartTimeEmployee(String name, int employedId, int hours){
        super(name, employedId);
        this.hours = hours;

    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        PartTimeEmployee part = new PartTimeEmployee("Himanshu", 35467,  20);
        part.calculateSalary();
        part.showDetails();
    }
}
