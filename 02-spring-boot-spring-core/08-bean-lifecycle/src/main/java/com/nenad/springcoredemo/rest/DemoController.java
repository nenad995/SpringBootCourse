package com.nenad.springcoredemo.rest;

import com.nenad.springcoredemo.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach) {
        System.out.println(getClass().getSimpleName() + " constructor called");
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

}
