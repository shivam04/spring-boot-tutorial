package com.example.springbootwebsocket;

/**
 * Created by shivam.si on 24/02/21 5:29 pm
 */
public class HelloMessage {
    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
