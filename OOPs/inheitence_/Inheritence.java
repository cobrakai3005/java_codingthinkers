package inheitence_;

 class Parent  {
    int a;
    Parent(){
        System.out.println("Parent Constructor");
    }
    void m1(){
        System.out.println("m1");
    }
    
}

class Child extends Parent {
    int b ;
    Child(){
        System.out.println("Child constructor");
    }
    void m2(){
        System.out.println("m2");
    }

}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("GrandChild Constructor");
    }
    void m3(){
        System.out.println("m3");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        GrandChild g1 = new GrandChild();
        g1.m3();
        g1.m1();
    }
}
