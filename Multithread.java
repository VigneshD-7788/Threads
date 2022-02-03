package Threads;

public class Multithread implements Runnable{
    //Declare a String variable to represent a task
    String task;

    Multithread(String task)
    {
        this.task = task;
    }
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(task+ " : " +i);
            try
            {
                Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } // end of for loop.
    } // end of run() method.
    public static void main(String[] args)
    {
// Create two objects to represent two tasks.
        Multithread th1 = new Multithread("Show your seat number"); // Passing task as an argument to its constructor.
        Multithread th2 = new Multithread("Cut the ticket");

// Create two objects of Thread class and pass two objects as parameter to constructor of Thread class.
        Thread t1 = new Thread(th1);
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            e.printStackTrace();

        }
        Thread t2 = new Thread(th2);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        System.out.println(t2.getPriority());

    }
}
