package com.praveen.shethe.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Praveenkumar on 11/6/2020.
 */
public class EmpTest {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Employee(3, "Zakri", 27));
        arrayList.add(new Employee(2, "Malla", 30));
        arrayList.add(new Employee(1, "Jagga", 24));
        arrayList.add(new Employee(9, "kumar", 55));
        arrayList.add(new Employee(6, "Aditha", 26));
        arrayList.add(new Employee(8, "Bablu", 29));
        arrayList.add(new Employee(18, "Umma", 29));
        Collections.sort(arrayList, new SortByEmpId());
        arrayList.forEach(System.out::println);

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