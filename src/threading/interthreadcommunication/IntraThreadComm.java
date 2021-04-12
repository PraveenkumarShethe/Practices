package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class IntraThreadComm {

    public static void main(String[] args) {

        Comm comm = new Comm();
        new Producer(comm);
        new Consumer(comm);

    }
}
