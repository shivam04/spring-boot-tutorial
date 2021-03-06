package com.example.springbootservletfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootServletFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletFilterApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

}
