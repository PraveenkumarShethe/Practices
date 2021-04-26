package javatricky;

/**
 * Created by Praveenkumar on 4/26/2021.
 */
public class Mobile {

    private static int i1;
    static int i = 20;

    static {
        System.out.println("inside the static block");
        i = 10;


    }

    public static void main(String[] args) {
        System.out.println("inside the main method");
        i1 = 30;
    }

}
