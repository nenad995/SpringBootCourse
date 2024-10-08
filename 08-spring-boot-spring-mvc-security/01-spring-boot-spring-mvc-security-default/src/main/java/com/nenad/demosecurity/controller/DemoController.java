package com.nenad.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeadersPage() {
        return "leaders-page";
    }

    @GetMapping("/systems")
    public String showSystemsPage() {
        return "systems-page";
    }

}
