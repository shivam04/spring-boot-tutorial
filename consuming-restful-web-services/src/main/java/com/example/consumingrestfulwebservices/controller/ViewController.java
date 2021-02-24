package com.example.consumingrestfulwebservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shivam.si on 24/02/21 1:25 pm
 */
@Controller
public class ViewController {
    @RequestMapping("/view-products")
    public String viewProducts() {
        return "view-products";
    }
    @RequestMapping("/add-products")
    public String addProducts() {
        return "add-products";
    }
}
