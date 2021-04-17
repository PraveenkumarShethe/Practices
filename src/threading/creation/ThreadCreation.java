package threading.creation;

/**
 * Created by Praveenkumar on 4/17/2021.
 */
public class ThreadCreation implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1. Main thread ");
        ThreadCreation threadCreation = new ThreadCreation();
        System.out.println("2. Main thread ");
        Thread thread = new Thread(threadCreation);
        thread.start();
        thread.join();
    }

    @Override
    public void run() {
        System.out.println("Thread created");
    }
}
