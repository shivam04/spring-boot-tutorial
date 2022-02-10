package com.example.springbootwebsocketbatch;

/**
 * Created by shivam.si on 10/02/22 8:49 am
 */

public class HelloMessage {
    private String name;

    public HelloMessage() {
    }

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
