package com.example.springbootwebsocketbatch;

/**
 * Created by shivam.si on 10/02/22 8:55 am
 */

public class User {
    private String lastName;
    private String firstName;

    public User() {
    }

    public User(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
