package com.nenad.springboot.demo.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getWorkoutMessage(){
        return "Run!";
    }

    @GetMapping("/fortune")
    public String getLucky(){
        return "You re lucky!";
    }

}
