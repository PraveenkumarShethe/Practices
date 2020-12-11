package com.praveen.shethe.staticJava8.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Praveenkumar on 12/10/2020.
 */
public class EmployeeStreamApi {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harsha", 230000, "software"));
        employeeList.add(new Employee("Naveen", 240000, "Software"));
        employeeList.add(new Employee("Puneeth", 872000, "Design"));
        employeeList.add(new Employee("Vinodh V", 2000, "Scrap"));
        employeeList.add(new Employee("Sanjay", 982, "Cleaning"));
        employeeList.add(new Employee("",23432, "Sub-assissnation"));
        employeeList.add(new Employee("Darshan", 8728, "Keymaker"));
        List<Employee> empCopy = new ArrayList<>(employeeList);
        empCopy.sort((o1, o2) -> o2.getSalary()-o1.getSalary());
        for (int i = 0 ; i < 3 ; i++){
            Employee employee = empCopy.get(i);
            System.out.println(employee.getName());
        }

        employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .forEach(System.out::println);

        employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .filter(employee -> employee.getName()
                .startsWith("S"))
                .limit(3)
                .collect(Collectors.toList());

        employeeList.stream().collect(Collectors.toSet()).forEach(System.out::println);

    }
}
