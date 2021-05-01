package aprilexamples.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Praveenkumar on 4/30/2021.
 */
public class EmployeeTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Employee("Zaplipo", "William", "Sebastian", 23, 8778986));
        list.add(new Employee("Noah", "Ava", "Jack", 43, 879956));
        list.add(new Employee("Oliver", "Elijah", "Alexander", 53, 87896));
        list.add(new Employee("William", "Sophia", "Ethan", 73, 87786));
        list.add(new Employee("Elijah", "Isabella", "Mason", 73, 86756));
        list.add(new Employee("James", "Charlotte", "Lucas", 83, 876756));
        list.add(new Employee("Benjamin", "Amelia", "Benjamin", 93, 87656));
        list.add(new Employee("Lucas", "Mia", "James", 43, 86656));
        list.add(new Employee("Mason", "Harper", "Matthew", 24, 85656));
        list.add(new Employee("Ethan", "Liam", "Samuel", 26, 84656));
        list.add(new Employee("Zaplipo", "Evelyn", "Joseph", 28, 82656));

        System.out.println("============================ Before sortinng ===================================");

        Iterator<Employee> employeeIterator = list.iterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

        Collections.sort(list, Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge).thenComparingInt(Employee::getSalary));
        System.out.println("============================ After sortinng ===================================");
        Iterator<Employee> employeeIterator1 = list.iterator();
        while (employeeIterator1.hasNext()){
            System.out.println(employeeIterator1.next());
        }
    }
}
