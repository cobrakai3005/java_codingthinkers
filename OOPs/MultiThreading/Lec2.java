//ANother way to create Multiple Threading

class MyThread implements Runnable{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class Lec2 {
   public static void main(String[] args) {
    MyThread m1 = new MyThread();
    Thread t1 = new Thread(m1);
    t1.start();
    MyThread m2 = new MyThread();
    Thread t2 = new Thread(m2);
    t2.start();
   } 
}
