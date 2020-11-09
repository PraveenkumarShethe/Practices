package com.praveen.shethe.multithreading;

/**
 * Created by Praveenkumar on 11/9/2020.
 */
public class TestMultitasking extends Thread{

    int i = 0;

    @Override
    public void run() {
        System.out.println(" Thread one " + i++);
    }

    public static void main(String[] args) {
        TestMultitasking testMultitasking = new TestMultitasking();
        TestMultitasking testMultitasking1 = new TestMultitasking();
        TestMultitasking testMultitasking2 = new TestMultitasking();
        testMultitasking.start();
        testMultitasking1.start();
        testMultitasking2.start();
    }
}
