package threading.MultiThreadingusingLambdaExpression;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
public class LambdaExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hellowine");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };


        Runnable runnable1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello, Devil");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        try{
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        thread1.start();
    }
}
