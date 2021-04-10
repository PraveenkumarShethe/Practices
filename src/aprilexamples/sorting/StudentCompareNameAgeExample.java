package aprilexamples.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Praveenkumar on 4/2/2021.
 */
public class StudentCompareNameAgeExample {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Student("Iranna", 3, "Z Nagar"));
        list.add(new Student("Chandan", 13, "C Nagar"));
        list.add(new Student("Balu ", 12, "B Nagar"));
        list.add(new Student("Eerra", 6, "E Nagar"));
        list.add(new Student("Doodda", 5, "D Nagar"));
        list.add(new Student("Appu", 10, "A Nagar"));
        list.add(new Student("Gaaga", 8, "O Nagar"));
        list.add(new Student("Fanu", 7, "F Nagar"));
        list.add(new Student("Hari", 9, "X Nagar"));
        System.out.println("======================================================================");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println("Name : "+student.getName()+ " Age : " + student.getAge());
        }
        System.out.println("======================================================================");

        Collections.sort(list, new CompareAge());
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            Student student = (Student) iterator1.next();
            System.out.println("Name : "+student.getName()+ " Age : " + student.getAge());
        }
        System.out.println("======================================================================");

        Collections.sort(list, new CompareName());

        Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()){
            Student student = (Student) iterator3.next();
            System.out.println("Name : "+student.getName()+ " Age : " + student.getAge());
        }
        System.out.println("======================================================================");


    }
}
