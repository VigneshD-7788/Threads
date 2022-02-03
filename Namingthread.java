package Threads;

public class Namingthread extends Thread {

    @Override
    public void run() {
        System.out.println("Running my thread......");
    }

    public static void main(String []args){
        Namingthread t1 = new Namingthread();
        Namingthread t2 = new Namingthread();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Vignesh Devan");
        System.out.println("After changing name of t1:"+t1.getName());
    }

}

