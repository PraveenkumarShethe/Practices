package java8features.lambdaexpression;

/**
 * Created by Praveenkumar on 4/17/2021.
 */
public class Test {

    public static void main(String[] args) {
        int width =10;
        Drawable drawable = value -> {
            System.out.println("Inside the lambda expression!!!" + width);
        };

        drawable.show(width);
    }

}
