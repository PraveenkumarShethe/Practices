package javatricky;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class Eample1 {

    public static void main(String[] args) {
//        reverseString();
        spaceStringRemove("Abc Bcd Efg Kalam");

    }

    private static void reverseString() {
        String s = "abcde";
        String temp = "";
        for (int i = s.length()-1 ; i >=0 ; i--){
            temp = s.charAt(i) + temp;
        }
        System.out.println(temp);
    }

    private static void spaceStringRemove(String value){
        System.out.println(value.replaceAll("\\s", ""));
        String temp = "";
        for (int i = 0 ; i <= value.length()-1 ; i++){
            if (value.charAt(i) == '0'){
                temp = temp + "";
            }else {
                temp = temp + value.charAt(i);
            }
        }
        System.out.println(temp);

    }

}
