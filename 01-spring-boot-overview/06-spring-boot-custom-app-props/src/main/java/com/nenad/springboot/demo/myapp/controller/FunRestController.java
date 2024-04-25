package com.nenad.springboot.demo.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

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

    @GetMapping("/football")
    public String football(){
        return "You are playing against " + teamName + " with coach " + coachName;
    }

}
