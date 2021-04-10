package aprilexamples.sorting;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 4/10/2021.
 */
public class CompareAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student = (Student) o1;
        Student student1 = (Student) o2;
        if(student.getAge()==student1.getAge())
            return 0;
        else if(student.getAge()>student1.getAge())
            return 1;
        else
            return -1;
    }
}
