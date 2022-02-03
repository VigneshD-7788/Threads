package Threads;

import java.util.concurrent.Callable;

    public class Executorcall2 implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(1500);
            System.out.println("this is from executor call2");
            return "return from thread callable";
        }
}
