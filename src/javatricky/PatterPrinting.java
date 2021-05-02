package javatricky;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class PatterPrinting {

    public static void main(String[] args) {
        int i, j, number, n = 10;

        for (i = 0; i < n; i++) {
            number = 1;
        //loop for columns
            for (j = 0; j <= i; j++) {
        //prints num
                System.out.print(number + " ");
        //incrementing the value of number
                number++;
            }
        //throws the cursor at the next line after printing each row
            System.out.println();
        }

    }
}
