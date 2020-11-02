package com.praveen.shethe.compare.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Praveenkumar on 11/2/2020.
 */
class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(1, "Aadvik", "Barath"));
        ar.add(new Student(3, "Babu", "nyc"));
        ar.add(new Student(5, "Basa", "jaipur"));
        ar.add(new Student(7, "Baasan", "jaipur"));
        ar.add(new Student(8, "Kalu", "jaipur"));
        ar.add(new Student(9, "Mango", "jaipur"));
        ar.add(new Student(2, "Ityia", "jaipur"));
        ar.add(new Student(4, "Zakir", "jaipur"));
        ar.add(new Student(6, "Zamil", "jaipur"));
        ar.add(new Student(10, "MD Kamal", "jaipur"));
        ar.add(new Student(14, "Munna", "jaipur"));
        ar.add(new Student(13, "Raja", "jaipur"));
        ar.add(new Student(12, "Kaju", "jaipur"));
        ar.add(new Student(11, "Kismis", "jaipur"));
        ar.add(new Student(15, "Parel", "jaipur"));

        System.out.println("==============================Unsorted==============================");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\n==============================Sorted by rollno==============================");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\n==============================Sorted by name==============================");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
