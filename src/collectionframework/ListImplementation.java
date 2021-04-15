package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * Created by Praveenkumar on 4/14/2021.
 */
public class ListImplementation {

    public void arrayListimpl(){

        List list = new ArrayList();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(13);
        list.add(12);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        list.add(18);
//        list.add(19);
//        list.add(20);
//        list.add(19);
        System.out.println(list.size());
        System.out.println("=============================================");
        list.forEach(o -> {
            System.out.println(o);
        });
        System.out.println("=============================================");
        Set uniqueInt = new HashSet();
        list.forEach(o -> {
            uniqueInt.add(o);
        });
        System.out.println("=============================================");

        uniqueInt.forEach(o -> {
            System.out.println(o);
        });
        System.out.println("=============================================");

    }

    public void vectorimpl(){
        List list = new Vector();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(13);
        list.add(12);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        list.add(18);
//        list.add(19);
//        list.add(20);
//        list.add(19);
        System.out.println(list.size());

        System.out.println("=============================================");
        list.forEach(o -> {
            System.out.println(o);
        });
        System.out.println("=============================================");
        Set uniqueInt = new HashSet();
        list.forEach(o -> {
            uniqueInt.add(o);
        });
        System.out.println("=============================================");

        uniqueInt.forEach(o -> {
            System.out.println(o);
        });
        System.out.println("=============================================");



    }

    public void linkedListImpl(){

        List list = new LinkedList();
        

    }

    public static void main(String[] args) {
        ListImplementation listImplementation = new ListImplementation();
        listImplementation.vectorimpl();
        listImplementation.arrayListimpl();
    }
}
