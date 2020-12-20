package com.praveen.shethe.classdefination;

/**
 * Created by Praveenkumar on 12/17/2020.
 */
public class SingleTonClass {

    public static SingleTonClass getInstance;

    private SingleTonClass(){}

    public static SingleTonClass getInstance(){
        if (getInstance != null){
            getInstance = new SingleTonClass();
            System.out.println("Inside the single ton get");
        }
        return getInstance;
    }
}

