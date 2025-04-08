package abstraction;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
    void music(){
        System.out.println("music");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("bike -start"); 
    }
    void stop(){
        System.out.println("bike -stop");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        
    }
}
