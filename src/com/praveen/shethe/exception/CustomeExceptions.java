package com.praveen.shethe.exception;

/**
 * Created by Praveenkumar on 10/20/2020.
 */
public class CustomeExceptions extends Exception {

    CustomeExceptions(String name){
        super(name);
        System.out.println("Name : " + name);
    }
}
