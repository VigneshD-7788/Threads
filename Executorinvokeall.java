package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorinvokeall {

    public static void main(String args[]) {
       ExecutorService call = Executors.newCachedThreadPool();// It is managed by JDK.
        try{
            //below thread will return the string and store in future obj.
            List<Executorcall1> obj = new ArrayList<Executorcall1>();
            obj.add(new Executorcall1("Hello"));
            obj.add(new Executorcall1("Hi"));
            obj.add(new Executorcall1("how are you"));
            obj.add(new Executorcall1());
            obj.add(new Executorcall1("Hi vignesh"));

            call.invokeAll(obj);//all the thread in the list will get executed.


        }catch(Exception e){
            e.printStackTrace();
        }
        call.shutdown();//ony then program will exit for executor service.
    }
}
