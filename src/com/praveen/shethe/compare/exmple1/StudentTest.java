package com.praveen.shethe.compare.exmple1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Praveenkumar on 11/3/2020.
 */
public class StudentTest {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kali","K R Mark",12));
        studentList.add(new Student("oppo","Mala",4));
        studentList.add(new Student("Jazz","Kala",7));
        studentList.add(new Student("Bass","Zaaa",8));
        studentList.add(new Student("Hinna","AAA",9));
        studentList.add(new Student("Gigga","Illo",10));
        studentList.add(new Student("Fanna","JPO",11));
        studentList.add(new Student("Don","YAMA",14));
        studentList.add(new Student("Sam","Narka",13));
        studentList.add(new Student("Uppla","Jaoool",12));
        studentList.add(new Student("Munna","Banara",15));
        studentList.add(new Student("Nunna","Muskan",16));
        studentList.add(new Student("Koppa","Goooga",11));
        studentList.add(new Student("Aask","Zakir",1));
        Collections.sort(studentList, new SortByAddress());
        System.out.println("=======================================Address=============================================");
        studentList.forEach(student -> {
            System.out.println(student.getName() + ", " + student.getAddress() + ", " +student.getRollNo());
        });
        Collections.sort(studentList, new SortByName());
        System.out.println("=======================================Name=============================================");
        studentList.forEach(student -> {
            System.out.println(student.getName() + ", " + student.getAddress() + ", " +student.getRollNo());
        });
        Collections.sort(studentList, new SortByRollNo());
        System.out.println("=======================================Roll No=============================================");
        studentList.forEach(student -> {
            System.out.println(student.getName() + ", " + student.getAddress() + ", " +student.getRollNo());
        });
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student student, Student student1) {
        return student.getName().compareTo(student1.getName());
    }
}

class SortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo()-o2.getRollNo();
    }
}

class SortByAddress implements Comparator<Student>{

    @Override
    public int compare(Student student, Student student1) {
        return student.getAddress().compareTo(student1.getAddress());
    }
}