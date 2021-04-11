package threading.sync;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
class Counter {

    int count;

    public synchronized void increment(){
        count = count+1;
    }

}
