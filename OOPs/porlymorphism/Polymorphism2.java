package porlymorphism;
//Method Override
class A {
    int a;
    A(int a){
        this.a = a;
    }
    void m1(){
        System.out.println("Parent "+ a);

    }

    
}

 class B extends A {
    int b ;
    B(int a, int b){
        super(a);
        this.b = b;
    }

    public void m1(){
        System.out.println("Child " + b);
    }

    public String toString(){
        return "helo";
    }

    
}
public class Polymorphism2 {
    public static void main(String[] args) {
        B b1 = new B(3, 4);
         b1.toString();
    }
}
