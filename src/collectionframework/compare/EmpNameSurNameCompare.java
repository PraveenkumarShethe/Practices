package collectionframework.compare;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 4/18/2021.
 */
public class EmpNameSurNameCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return (employee1.getName()+employee1.getSurName()).compareTo(employee2.getSurName()+employee2.getSurName());
    }
}
