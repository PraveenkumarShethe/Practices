package threading.threadpool;

/**
 * Created by Praveenkumar on 4/22/2021.
 */
public class WorkerThread implements Runnable{

    private String message;

    public WorkerThread(String msg){

        this.message = msg;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
