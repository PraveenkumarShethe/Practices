package threading.example;

/**
 * Created by Praveenkumar on 4/28/2021.
 */
public class SubStringExample extends Thread {

    @Override
    public void run() {
        System.out.println("Inside the run method");
    }

    public static void main(String[] args) {

        SubStringExample subStringExample = new SubStringExample();
        subStringExample.start();

    }

}
