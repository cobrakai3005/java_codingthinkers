package innerclass;

class Outer{
    static class Inner{
        void m1(){
            System.out.println("m1");
        }
    }
}
public class StaticInnerClass {


public static void main(String[] args) {
    Outer.Inner  i= new Outer.Inner();
    i.m1();

}
    
}