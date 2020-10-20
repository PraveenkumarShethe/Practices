package com.praveen.shethe.exception;

/**
 * Created by Praveenkumar on 10/20/2020.
 */
public class CustomeExceptionTest {

    public static void main(String[] args) throws Exception {
        int age = 10;
        String name = "Sagar";
        if (age < 18) {
            throw new CustomeExceptions(name);
        } else {
            System.out.println("Valid age");
        }
    }
}