package com.praveen.shethe.exceptions;

/**
 * Created by Praveenkumar on 9/3/2020.
 */
public class ExampleExceptions {

    public static void main(String[] args) {

        String value = null;
        int a = 0 ;
        int b = 1 ;

        try{
//            a = a/b;
            System.out.println("Inside the try block 1");
        }
        catch (Exception e){
            System.out.println("Inside the catch block 1");
            e.printStackTrace();
        }
        finally {
            System.out.println("inside the finally block 1");
            try{
                System.out.println("Inside the try block 2");
                value.length();
            }catch (ArithmeticException e){
                System.out.println("Inside the catch block 2");
                a = a/b;
            }
            finally {
                System.out.println("Inside the finally block 2");

            }
        }
    }

}
