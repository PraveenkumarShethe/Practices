package threading.MultiThreadingusingLambdaExpression;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
public class OptimisedCodeThreadUsingLambda {

    public static void main(String[] args) {
        Thread t1 = new Thread( () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello, Devil");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread( () -> {
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
        try{Thread.sleep(10);}catch (Exception e){e.printStackTrace();}
        t2.start();
    }
}
