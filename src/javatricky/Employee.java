package javatricky;

/**
 * Created by Praveenkumar on 4/26/2021.
 */
public class Employee {

    private String name, lastName;

    Employee(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
