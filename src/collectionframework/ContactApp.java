package collectionframework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Praveenkumar on 4/15/2021.
 */
public class ContactApp {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("9827235577", "Praveenkumar");
        phoneBook.put("8727819902", "Khan");
        phoneBook.put("8271612933", "Iqbal Kazi");
        phoneBook.put("9887687678", "Manu");
        phoneBook.put("0998288282", "Kofa");
        phoneBook.put("8372676328", "Jannu");
        System.out.println("==================================================");
        phoneBook.entrySet().forEach(phoneContact -> {
            System.out.println(phoneContact.getKey()+"    :    "+ phoneContact.getValue());
        });
        phoneBook.remove("9827235577");
        System.out.println("==================================================");
        phoneBook.entrySet().forEach(phoneContact -> {
            System.out.println(phoneContact.getKey()+"    :    "+ phoneContact.getValue());
        });
        System.out.println("==================================================");
    }
}
