package threading.deadlock;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        final String res = "Resource 1";
        final String res1 = "Resource 2";


        Thread thread = new Thread(){
          public void run(){
              synchronized (res){
                  System.out.println("Thread res : Locked by res");
                  try {Thread.sleep(100);}catch (Exception e){e.printStackTrace();}
              }
          }
        };

        Thread thread1 = new Thread(){
            public void run(){
                synchronized (res1){
                    System.out.println("Thread res : Locked by res1");
                    try {Thread.sleep(100);}catch (Exception e){e.printStackTrace();}
                }
            }
        };
        thread.start();
        thread1.start();

    }

}
