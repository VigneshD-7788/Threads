package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Callablefuture {

    public static void main(String args[]) {
        ExecutorService call = Executors.newSingleThreadExecutor();
        try{
            //below thread will return the string and store in future obj.
            Future<String> exec = call.submit(new Executorcall2());//both runnable and callable
            System.out.println(exec.get(2000, TimeUnit.MILLISECONDS));//

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("this is last line");
        call.shutdown();//ony then program will exit for executor service.
    }
}
