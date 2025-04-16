class Counter{
    private int count ;
    Counter(){
        count = 0;
    }
    synchronized void increment(){
        count += 1;
    }
    int getCount(){
        return count;
    }
}
class MyThread extends Thread{
    Counter c;
    MyThread(Counter c){
        this.c = c;
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            c.increment();
        }
    }
}

public class Lec3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        MyThread t1 = new MyThread(c1);
        t1.start();
        MyThread t2 = new MyThread(c1);
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println(c1.getCount());
    }
}
