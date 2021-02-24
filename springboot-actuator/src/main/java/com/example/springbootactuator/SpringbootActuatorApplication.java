package com.example.springbootactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActuatorApplication.class, args);
    }

    @RequestMapping(value ="/")
    public String index() {
        return "Hello World";
    }

}
