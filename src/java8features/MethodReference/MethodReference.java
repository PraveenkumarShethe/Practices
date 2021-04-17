package java8features.MethodReference;

/**
 * Created by Praveenkumar on 4/17/2021.
 */
public class MethodReference {

    public static void somesaySomething(){
        System.out.println("Saying something !!!");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::somesaySomething;
        sayable.say();
    }

}
