import java.util.Scanner;

class MyException extends Exception{
    MyException(){
        System.out.println("MyException instance created");
    }

    public String toString(){
        return "MyException ToString";
    }
}
public class CustomExceptions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            if (n < 100) {
                System.out.println("less then 100;");
                
            }else{
                throw new MyException();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}