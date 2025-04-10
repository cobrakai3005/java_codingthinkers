import java.util.Scanner;

public class Lect1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");
        try {
            System.out.print("Enter a name;");
            String s = sc.next();
            System.out.println(s.charAt(5));
            System.out.println("Enter numbers for divion");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);

         System.out.println("Hello in try block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (StringIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        finally{
            System.out.println("Finaly block");
        }
        System.out.println("Hello 4");
        System.out.println("Hello 5");
        System.out.println("Hello 6");
    }
}