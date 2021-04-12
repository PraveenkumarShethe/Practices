package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class Consumer implements Runnable{

    Comm comm;

    Consumer(Comm comm) {
        this.comm = comm;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        comm.getNum();
        while (true){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
