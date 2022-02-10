package com.example.springbootwebsockettest;

/**
 * Created by shivam.si on 10/02/22 7:30 am
 */

public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
