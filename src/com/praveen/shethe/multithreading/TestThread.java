package com.praveen.shethe.multithreading;

/**
 * Created by Praveenkumar on 8/29/2020.
 */
public class TestThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

//        RunnableDemo R2 = new RunnableDemo( "Thread-2");
//        R2.start();
    }

}
