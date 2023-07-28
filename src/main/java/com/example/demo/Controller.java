package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Controller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
