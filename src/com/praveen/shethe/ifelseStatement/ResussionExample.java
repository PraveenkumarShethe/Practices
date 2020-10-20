package com.praveen.shethe.ifelseStatement;

/**
 * Created by Praveenkumar on 10/20/2020.
 */
public class ResussionExample {

    static void method(){
        System.out.println("Repeat method() ");
        method();
    }

    public static void main(String[] args) {
        method();
    }

}
