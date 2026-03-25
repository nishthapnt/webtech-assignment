package beans;

import java.io.Serializable;

public class Person implements Serializable {

    // Private properties
    private String name;
    private int age;

    // Default constructor
    public Person() {
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}