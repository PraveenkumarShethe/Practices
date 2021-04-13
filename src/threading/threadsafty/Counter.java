package threading.threadsafty;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Praveenkumar on 4/13/2021.
 */
public class Counter {

//    AtomicInteger count = new AtomicInteger() ;
    int count;

    public void increment(){
//        count.incrementAndGet();
        count++;
    }

}
