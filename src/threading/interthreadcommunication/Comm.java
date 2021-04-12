package threading.interthreadcommunication;

/**
 * Created by Praveenkumar on 4/12/2021.
 */
public class Comm {

    int num;
    boolean setValue = false;

    public synchronized void setNum(int num){

        while(setValue){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("setNum : " +  num);
        this.num=num;
        setValue = true;
        notify();
    }

    public synchronized void getNum(){
        while (!setValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("getNum : " +  num);
            setValue = false;
            notify();

    }

}
