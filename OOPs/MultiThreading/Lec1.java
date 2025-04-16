class MyThread extends Thread{

    MyThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 1; i < 100; i++) {
            // System.out.print(i);
            System.out.print(getName());//It has getName() method wihich gives the name of the thread 
            //You can Also change the name of thread by difining it in the constructor 

            //Thread.sleep() is a method to stop the this run function for the given time;
            //But it will throw a checked Exception 
            //So we have to handle it
            //Thread.currentThread().yield();
            try {

                
                ////Thread.sleep(2345);
                //sleep(35467); you can also do this
 
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println(e);
            }

           
        }
    }
}

public class Lec1{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("himanshu's thread ");
        String name =  t1.getName();
       //System.out.println(name);
        MyThread t2 = new MyThread("another thread ");
        t2.start();

        Thread.currentThread().setName("main Himanshu");
        for (int i = 1; i < 100; i++) {
          System.out.println(Thread.currentThread().getName()); 
         
          try {    
            Thread.sleep(2345);
            //sleep(35467); you can also do this

        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        }
    }
}