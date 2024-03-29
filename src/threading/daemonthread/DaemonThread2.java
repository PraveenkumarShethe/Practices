package threading.daemonthread;

/**
 * Created by Praveenkumar on 4/21/2021.
 */
public class DaemonThread2 extends Thread{

    @Override
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
        DaemonThread2 t1=new DaemonThread2();
        DaemonThread2 t2=new DaemonThread2();
        t1.start();
        t1.setDaemon(true);//will throw exception here
        t2.start();
    }
}
