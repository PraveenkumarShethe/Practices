package objectcreation;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Praveenkumar on 4/15/2021.
 */
public class Student implements Cloneable, Serializable {

    //creates and returns a copy of this object
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    private String name, address, surName;

    private int age;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, surName, age);
    }
}
