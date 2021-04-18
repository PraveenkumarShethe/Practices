package collectionframework.compare;

/**
 * Created by Praveenkumar on 4/18/2021.
 */
public class Employee {

    private String name, surName;

    Employee(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
