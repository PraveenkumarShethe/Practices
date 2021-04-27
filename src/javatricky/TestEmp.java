package javatricky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Praveenkumar on 4/26/2021.
 */
public class TestEmp {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Employee("Abc","Bcn"));
        list.add(new Employee("Alkn","Bcn"));
        list.add(new Employee("Aadcsd","Bcn"));
        list.add(new Employee("Aadfv","Bcn"));
        list.add(new Employee("Aadvv","Bcn"));
        list.add(new Employee("balks","Bcn"));
        list.add(new Employee("claks","Bcn"));
        list.add(new Employee("Oaklal","Bcn"));
        list.add(new Employee("Zlamckla","Bcn"));
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName);

        Iterator employeeIterable = list.iterator();
        while (employeeIterable.hasNext()){
            System.out.println(employeeIterable.next().getClass().getName());
        }
    }

}
