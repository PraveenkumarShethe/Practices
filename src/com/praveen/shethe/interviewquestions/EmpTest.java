package com.praveen.shethe.interviewquestions;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 11/6/2020.
 */
public class EmpTest {

    public static void main(String[] args) {

    }
}


class SortByEmpId implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        if (e1.getAge() < e2.getAge() && (e1.getName().compareTo(e2.getName()) == 1)){
            return 1;
        }else
            return 0;
    }
}