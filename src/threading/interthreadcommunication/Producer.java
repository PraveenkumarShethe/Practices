package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class Producer implements Runnable{

    Comm comm;

    public Producer(Comm comm){
        System.out.println("Producer constr ");
        this.comm = comm;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Producer : Inside run ");
        int count = 0 ;
        while (true){
            comm.setNum(count++);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
