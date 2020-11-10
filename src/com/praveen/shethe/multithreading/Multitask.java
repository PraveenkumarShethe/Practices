package com.praveen.shethe.multithreading;

/**
 * Created by Praveenkumar on 11/10/2020.
 */
public class Multitask implements Runnable {

    @Override
    public void run() {
        System.out.println(" **** multi tasks ****");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Multitask());
        Thread thread1 = new Thread(new Multitask());
        thread.start();
        thread1.start();
    }
}
