package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCallable {

    public static void main(String args[]) {
        ExecutorService iot = Executors.newSingleThreadExecutor();
        iot.execute(new intialRunnable());//only for runnables
        iot.submit(new intialCallable());//both runnable and callable
        iot.shutdown();//ony then program will exit for executor service.

    }


}

class intialRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Your thread started..");
    }
}


class intialCallable implements Callable<String> {

    @Override
    public String call()  {
        System.out.println("this is from callable complete process");
        return "Completed";
    }
}
