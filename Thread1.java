package Threads;

public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is under running.....");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i="+i);
            //thread to sleep
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String []args){
        Thread1 th=new Thread1();
        System.out.println("Thread about to start........");
        th.start();
        th.interrupt();//only sleeping thread can trigger or interrupt.

    }
}
