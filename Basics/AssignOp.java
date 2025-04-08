package Basics;
public class AssignOp {
    public static void main(String[] args) {
        int a= 2, b  = 3, c= 4;
        int d = a = b = c;
        // Right to left
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
