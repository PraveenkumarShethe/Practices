package com.praveen.shethe.multithreading;

/**
 * Created by Praveenkumar on 11/10/2020.
 */
public class Simple extends Thread {

    @Override
    public void run() {
        System.out.println("Simple one task");
    }
}

class Simple1 extends Thread{
    @Override
    public void run() {
        System.out.println("Simple two task");
    }
}

class Simple2 extends Thread{
    @Override
    public void run() {
        System.out.println("Simple third task");
    }
}

class Test {

    public static void main(String[] args) {
        Simple simple = new Simple();
        Simple1 simple1 = new Simple1();
        Simple2 simple2 = new Simple2();
        simple.start();
        simple1.start();
        simple2.start();
    }

}
