package aprilexamples.sort;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 4/30/2021.
 */
public class EmployeeCompareNames implements Comparator<Employee> {


    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}
