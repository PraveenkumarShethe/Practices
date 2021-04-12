package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class Consumer implements Runnable{

    Comm comm;

    public Consumer(Comm comm) {
        System.out.println("Consumer constr ");
        this.comm = comm;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Consumer : Inside run ");
        while (true){
            comm.getNum();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
