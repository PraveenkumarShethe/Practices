package com.praveen.shethe.threading;

/**
 * Created by Praveenkumar on 8/26/2020.
 */
public class Test {

    public static void main(String[] args) {
        Car1 t1 = new Car1();
        Car2 t2 = new Car2();
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
    }

}
