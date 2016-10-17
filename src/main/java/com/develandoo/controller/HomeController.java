package com.develandoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/")
    public String actionIndex() {
        return "HELLO WORLD!";
    }

    @RequestMapping("/landing")
    public String actionLanding() {
        return "index.html";
    }
}
