package constructors;

class  Sum{
    int a, b;
    Sum(){
        System.out.println("Default ");
    }
    Sum(int x, int y){
        a =x;
        b = y;
        System.out.println("Parameterized ");
    }
    Sum(int x){
        a =x;
       
        System.out.println("Single Parameter ");
    }
    int add(){
        return a+ b;
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Sum s1= new Sum();
        
        Sum s2 = new Sum(5, 7);
        System.out.print(s2.add());


        Sum s3 = new Sum(5);
        System.out.print(s3.add());
    }
}
