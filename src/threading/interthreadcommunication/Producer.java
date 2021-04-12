package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class Producer implements Runnable{

    Comm comm;

    Producer(Comm comm){
        this.comm = comm;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int count = 0 ;
        comm.setNum(count++);
        while (true){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
