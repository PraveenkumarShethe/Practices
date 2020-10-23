package com.praveen.shethe.compare;

/**
 * Created by Praveenkumar on 10/22/2020.
 */
public class Student implements Comparable<Student> {

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    private String name;

    private int age;

    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student student) {
        if (age == student.getAge())
            return 0;
        else if ( age > student.getAge())
            return 1;
        else
            return -1;
    }

/*    @Override
    public int compareTo(Student student) {
        if (age == student.getAge() && rollNo == student.getRollNo())
        return 0;
        else if ( age > student.getAge() && rollNo > student.getRollNo())
            return 1;
        else
            return -1;
    }*/
}
