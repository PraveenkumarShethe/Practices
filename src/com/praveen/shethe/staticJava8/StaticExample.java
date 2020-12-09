package com.praveen.shethe.staticJava8;

/**
 * Created by Praveenkumar on 12/9/2020.
 */
interface Sayable{
    void say();
}

public class StaticExample{

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = StaticExample::saySomething;
        // Calling interface method
        sayable.say();
    }
}
