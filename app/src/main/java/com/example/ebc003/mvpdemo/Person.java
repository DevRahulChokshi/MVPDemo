package com.example.ebc003.mvpdemo;

/**
 * Created by EBC003 on 8/23/2017.
 */

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
}