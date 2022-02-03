package Threads;

import java.util.concurrent.Callable;


    public class Executorcall1 implements Callable<String> {
        private String data;
        public Executorcall1(){

            this.data  = "Invalid Call";
        }
        public Executorcall1(String data){

            this.data = data;
        }
        @Override
        public String call() throws Exception {
            System.out.println(this.data);
            Thread.sleep(1000);
            return "return from "+this.data;
        }
}
