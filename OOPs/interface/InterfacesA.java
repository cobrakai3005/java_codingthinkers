interface A {
    int a  = 8; //static and final , you cannot change this static 
    void m1(); //public and default
    void m2();
}

 class B implements A {
    public void m1(){
        System.out.println("m1;");
    }
    public void m2(){
        System.out.println("m2;");
    }

    
}

public class InterfacesA {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
        b1.m2();
        System.out.println(b1.a);
    }
}
