package com.praveen.shethe.staticJava8.emp;

/**
 * Created by Praveenkumar on 12/10/2020.
 */
public class Employee {

    private String name;

    private int salary;

    private String dep;

    Employee(String name, int salary, String dep ){
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
