package threading.threadsafty;

/**
 * Created by Praveenkumar on 4/14/2021.
 */
public class TestCountUsingThread {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1 ; i <=1000; i++){
                    counter.increment();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1 ; i <=1000; i++){
                    counter.increment();
                }

            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.count);

    }

}
