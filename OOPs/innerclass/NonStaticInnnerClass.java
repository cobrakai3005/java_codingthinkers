package innerclass;

class Outer{
    class Inner{
        void m1(){
            System.out.println("m1");
        }
    }
}
public class NonStaticInnnerClass {
    public static void main(String[] args) {
        Outer a = new Outer();
        Outer.Inner i= a.new Inner(); 
        i.m1();

    }
}
