package com.praveen.shethe.compare.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Praveenkumar on 11/13/2020.
 */
public class WorkerTest {

    public static void main(String[] args) {

        ArrayList<Workers> workersArrayList = new ArrayList<>();
        workersArrayList.add(new Workers("Zakri", 44, 29200));
        workersArrayList.add(new Workers("yazaja", 21, 39200));
        workersArrayList.add(new Workers("Kana", 82, 19300));
        workersArrayList.add(new Workers("lanjs", 29, 12200));
        workersArrayList.add(new Workers("Ummers", 73, 219200));
        workersArrayList.add(new Workers("Tango", 49, 19300));
        workersArrayList.add(new Workers("Rodo", 35, 19200));
        workersArrayList.add(new Workers("Pali", 34, 19112));
        workersArrayList.add(new Workers("Banna", 38, 49200));
        workersArrayList.add(new Workers("Ajay", 28, 54200));
        System.out.println("============================= UnSorted =======================================");
        workersArrayList.forEach(workers -> {
            System.out.println(workers.getName() + "    ,    " + workers.getAge() + "    ,    " + workers.getSalary());
        });
        Collections.sort(workersArrayList, new WorkerSortOnAge());
        System.out.println("================================== Sorted by Age ==================================");
        workersArrayList.forEach(workers -> {
            System.out.println(workers.getName() + "    ,    " + workers.getAge() + "    ,    " + workers.getSalary());
        });
        System.out.println("============================ Sorted by salary ========================================");
        Collections.sort(workersArrayList, new WorkerSortBySalary());
        workersArrayList.forEach(workers -> {
            System.out.println(workers.getName() + "    ,    " + workers.getAge() + "    ,    " + workers.getSalary());
        });
        System.out.println("============================ Sorted by Name ========================================");
        Collections.sort(workersArrayList, new WorkerSortByName());
        workersArrayList.forEach(workers -> {
            System.out.println(workers.getName() + "    ,    " + workers.getAge() + "    ,    " + workers.getSalary());
        });
    }
}

class WorkerSortBySalary implements Comparator<Workers> {
    @Override
    public int compare(Workers workers1, Workers workers2) {
        return workers2.salary - workers1.salary;
    }
}

class WorkerSortOnAge implements Comparator<Workers> {
    @Override
    public int compare(Workers workers1, Workers workers2) {
        return workers1.age - workers2.age;
    }
}

class WorkerSortByName implements Comparator<Workers> {

    @Override
    public int compare(Workers workers1, Workers workers2) {
        return workers1.name.compareTo(workers2.name);
    }
}
