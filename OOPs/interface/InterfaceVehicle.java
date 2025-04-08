interface Vehicle{
    void start();
    void stop();

}

class Car implements Vehicle{
    int speed; // instance Variable whose initial value is  already zero
    Car(){
        speed = 0;
    }
    public void start(){
        System.out.println("Car-start");
    }
    public void stop(){
        System.out.println("Car-stop");
    }

    void accelerate(int a){
        speed += a;
    }

    void break1(int a){
        speed -= a;
    }

}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Car-start");
    }
    public void stop(){
        System.out.println("Car-stop");
    }
}

interface ElectricVehicle extends Vehicle{
    void charging();
}
interface MusicSystem{
    void music();
}

class Flyiing{
    void fly(){
        System.out.println("Flying Car");
    }
}

class ElectricCar extends Flyiing implements ElectricVehicle, MusicSystem{
    public void music(){
        System.out.println("Music Plying");
    }
    public void charging(){
        System.out.println("Charging");
    }
    public void start(){
        System.out.println("Car-start");
    }
    public void stop(){
        System.out.println("Car-stop");
    }
}
public class InterfaceVehicle {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.accelerate(123);
        c1.break1(0);
        Bike b1 = new Bike();
        b1.start();
        b1.stop();

        ElectricCar c2 = new ElectricCar();
        c2.start();
        c2.charging();
        c2.music();
        c2.stop();
        c2.fly();
    }
}
