package porlymorphism;

class Sum{
    int add(int a , int b){
        return a+ b;
    }
    int add(int a, int b , int c){
        return a + b + c;
    }
    float add(float a, float b ){
        return a + b;
    }
}

class Box{
    private int length ;
    private int breadth ;
    private int height ;
   
    Box(){
        length = 0;
        breadth = 0;
        height = 0;
    }
    Box(int length , int breadth , int height){
        this.length =length;
        this.breadth = breadth;
        this.height = height;
    }

    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    int getHeight(){
        return height;
    }
    int calculateVolume(){
        return length* breadth* height;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // Sum s = new Sum();
        // System.out.println(s.add(10, 23));
        // System.out.println(s.add(56, 23, 77));
        // System.out.println(s.add(5.6f,  8.6f));



        Box box = new Box(23, 33, 55);

        System.out.println(box.getLength());
        System.out.println(box.getBreadth());
        System.out.println(box.getHeight());
        System.out.println(box.calculateVolume());
    }

}
