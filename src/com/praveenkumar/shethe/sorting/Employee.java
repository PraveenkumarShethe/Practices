package com.praveenkumar.shethe.sorting;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 11/10/2020.
 */
public class Employee {

    Employee(String name, int empNo, int age, int salary){
        this.name = name;
        this.empNo = empNo;
        this.age = age;
        this.salary = salary;
    }

    String name;

    int empNo;

    int age;

    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class SortByName implements Comparator<Employee> {

    public int compare(Employee employee1, Employee employee2) {
        return employee1.name.compareTo(employee2.name);
    }
}