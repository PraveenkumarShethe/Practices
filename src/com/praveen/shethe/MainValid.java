package com.praveen.shethe;

/**
 * Created by Praveenkumar on 10/16/2020.
 */
public class MainValid {

//    public static void main(String args[]){}
//    public static void main(String... args){}
//    static public void main(String[] args){}
//    public static final void main(String[] args){}
//    final public static void main(String[] args){ }
//    final strictfp public static void main(String[] args){
//        System.out.println("Hello");
//    }

    public static void main(String[] args) {
        Class aClass = MainValid.class;
        System.out.println(aClass.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }

}
