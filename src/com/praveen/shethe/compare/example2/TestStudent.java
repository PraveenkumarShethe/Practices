package com.praveen.shethe.compare.example2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Praveenkumar on 10/22/2020.
 */
public class TestStudent {

    public static void main(String args[]){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("Apple", 1, 1);
        Student student2 = new Student("Ball", 2, 4);
        Student student3 = new Student("Cat", 4, 3);
        Student student4 = new Student("Dog", 3, 2);
        Student student5 = new Student("Elephant", 5, 5);
        studentArrayList.add(student1);
        studentArrayList.add( student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        System.out.println("=====================================================================================");
        for (Student student : studentArrayList){
            System.out.println(student.getName() + " ========== " +student.getAge()+" ============ "+student.getRollNo());
        }
        Collections.sort(studentArrayList);
        System.out.println("=====================================================================================");
        for (Student student : studentArrayList){
            System.out.println(student.getName() + " ========== " +student.getAge()+" ============ "+student.getRollNo());
        }
        System.out.println("=====================================================================================");
    }
}
