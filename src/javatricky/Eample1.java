package javatricky;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class Eample1 {

    public static void main(String[] args) {
        String s = "abcde";
        String temp = "";
        for (int i = s.length()-1 ; i >=0 ; i--){
            temp = s.charAt(i) + temp;
        }
        System.out.println(temp);

    }

}
