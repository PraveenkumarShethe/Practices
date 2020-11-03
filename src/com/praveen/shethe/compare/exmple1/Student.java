package com.praveen.shethe.compare.exmple1;

/**
 * Created by Praveenkumar on 11/3/2020.
 */
public class Student {

    private String name, address;

    private int rollNo;

    Student(String name, String address, int rollNo){
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
