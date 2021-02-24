package com.example.springbootinternationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam.si on 24/02/21 1:46 pm
 */
@Controller
public class ViewController {
    @RequestMapping("/locale")
    public String locale() {
        return "locale";
    }
}
