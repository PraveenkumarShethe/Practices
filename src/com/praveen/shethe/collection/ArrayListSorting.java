package com.praveen.shethe.collection;

import com.praveen.shethe.collection.sortingexample.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Praveenkumar on 7/15/2020.
 */
public class ArrayListSorting {

    public static void main(String[] args) {
        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Moses",2, 23));
        studentArrayList.add(new Student("Amit",1, 20));
        studentArrayList.add(new Student("Kashi",3, 19));
        studentArrayList.add(new Student("Vinodh",5, 29));
        studentArrayList.add(new Student("Sanjay",4, 28));
        studentArrayList.add(new Student("Iqbal",7, 23));
        studentArrayList.add(new Student("Karna",6, 17));
        studentArrayList.add(new Student("Jaga",9, 16));
        studentArrayList.add(new Student("Minty",8, 15));
        studentArrayList.add(new Student("Jolly",10, 14));
        studentArrayList.add(new Student("Rasana",11, 13));
        studentArrayList.add(new Student("Bhsha",12, 17));
        studentArrayList.add(new Student("Jasmin",13, 18));
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
    }
}
