package aprilexamples.sorting;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 4/10/2021.
 */
public class CompareName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student = (Student) o1;
        Student student1 = (Student) o2;
        return  student.getName().compareTo(student1.getName());
    }
}
