package com.example.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam.si on 24/02/21 1:11 pm
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
