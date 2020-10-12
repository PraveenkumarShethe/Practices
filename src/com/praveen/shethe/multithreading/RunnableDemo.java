package com.praveen.shethe.multithreading;

/**
 * Created by Praveenkumar on 8/29/2020.
 */
public class RunnableDemo implements Runnable {

    private Thread thread;

    private String threadName;

    RunnableDemo(String threadName){
        this.threadName = threadName;
        System.out.println(" inside the constructor and thread name is :" + threadName );
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
