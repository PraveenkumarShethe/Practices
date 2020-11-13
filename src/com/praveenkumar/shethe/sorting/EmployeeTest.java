package com.praveenkumar.shethe.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Praveenkumar on 11/10/2020.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Zaka", 30, 21, 20000));
        employeeArrayList.add(new Employee("faka", 23, 27, 30000));
        employeeArrayList.add(new Employee("Gadaka", 21, 25, 210000));
        employeeArrayList.add(new Employee("Jaaka", 19, 22, 10000));
        employeeArrayList.add(new Employee("aksaka", 25, 24, 5000));
        System.out.println("-----------------------------------UnSorted-------------------------------");
        employeeArrayList.forEach(employee -> {
            System.out.println(employee.getName());
        });
        Collections.sort(employeeArrayList, new SortByName());
        System.out.println("-----------------------------------Sorted-------------------------------");
        employeeArrayList.forEach(employee -> {
            System.out.println(employee.getName());
        });

    }
}

