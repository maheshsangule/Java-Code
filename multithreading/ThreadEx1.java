package multithreading;


class MyThread1 extends Thread
{
    @Override
    public void run() {
      while (true){
          System.out.println("My Thread is Running");
          System.out.println("I am Happy");
      }
    }
}




class MyThread2 extends Thread
{
    @Override
    public void run() {

        while (true){
            try {
                sleep(10L);
                System.out.println("Thread 2 is good");
                System.out.println("I am Sad");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}



public class ThreadEx1 {

    public static void main(String[] args) {

        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.start();
        mt2.start();


    }
}
