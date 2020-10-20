package com.praveen.shethe.classdefination;

/**
 * Created by Praveenkumar on 10/20/2020.
 */
public class OuterClass {

    class InnerClass{

        public void message(){
            System.out.println("Inner class message");
        }

    }

    public void message(){
        System.out.println("Outer class message");
    }

    public void messageInnerCall(){
        System.out.println("Mesasge innner call");
        InnerClass innerClass = new InnerClass();
        innerClass.message();
    }
}
