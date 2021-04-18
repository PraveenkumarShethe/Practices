package collectionframework.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Praveenkumar on 4/18/2021.
 */
public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        list.add(new Employee("Zahir", "Khan"));
        list.add(new Employee("Yasir", "Mani"));
        list.add(new Employee("Jalva", "Hanika"));
        list.add(new Employee("Nooria", "Monish"));
        list.add(new Employee("Prana", "Praja"));
        list.add(new Employee("Kareena", "Karbar"));
        list.add(new Employee("Geena", "Treeen"));
        list.add(new Employee("Ulasira", "Ulir"));
        list.add(new Employee("Tarzaan", "Amazon"));
        list.add(new Employee("Ajay", "Barthwaj"));
        list.add(new Employee("Balu", "Tina"));
        list.add(new Employee("Chandu", "Zakalal"));


        System.out.println(" ===================UnSorted========================");
        for (Employee employee : list){
            System.out.println(" Name : "+employee.getName() + " Surname :  " + employee.getSurName());
        }
        System.out.println(" ===================Sorted========================");
        Collections.sort(list, new EmpNameSurNameCompare());
        for (Employee employee : list){
            System.out.println(" Name : "+employee.getName() + " Surname :  " + employee.getSurName());
        }
        System.out.println("===================================================");


    }
}
