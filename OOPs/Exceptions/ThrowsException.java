public class ThrowsException {

    static void m2(){
        System.out.println("m2");
        System.out.println(5/0);
        System.out.println("m2");
    }
    static void m1() {
        System.out.println("m1");

        try {
           m2();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);

        }
      
        System.out.println("m1");

    }
    public static void main(String[] args) {
        m1();
    }
}
