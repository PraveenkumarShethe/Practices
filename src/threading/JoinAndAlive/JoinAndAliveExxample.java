package threading.JoinAndAlive;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
public class JoinAndAliveExxample {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello, Devil");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi, Devil");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        System.out.println("1. Thread 1 " + t1.isAlive());
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("2. Thread 2 " + t2.isAlive());

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3. Thread 1 " + t1.isAlive());
        System.out.println("4. Thread 2 " + t2.isAlive());

        System.out.println("BYE!!!");
    }

}
