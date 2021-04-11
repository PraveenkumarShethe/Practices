package threading.simplethreading;

/**
 * Created by Praveenkumar on 4/11/2021.
 */
public class MultiThreadingMain {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hello.start();
    }
}


class Hi extends Thread{

    public void run(){
        for (int i = 0 ; i <= 5 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{

    public void run(){
        for (int i=0; i <=5 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}