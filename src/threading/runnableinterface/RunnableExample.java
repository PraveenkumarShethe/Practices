package threading.runnableinterface;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
public class RunnableExample {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        Thread t1 = new Thread(hi);

        Thread t2 = new Thread(hello);

        t1.start();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        t2.start();
    }

}

class Hi implements Runnable{

    @Override
    public void run() {
        for (int i=0; i <=5 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable{

    @Override
    public void run() {
        for (int i=0; i <=5 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }    }
}