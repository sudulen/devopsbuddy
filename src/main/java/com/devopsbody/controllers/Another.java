package com.devopsbody.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Another {

    @RequestMapping("/1")
    public String sayHello() {
        return "another";
    }
}
