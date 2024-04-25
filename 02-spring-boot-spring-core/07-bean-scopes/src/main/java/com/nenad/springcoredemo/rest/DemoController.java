package com.nenad.springcoredemo.rest;

import com.nenad.springcoredemo.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach,
                          @Qualifier("tennisCoach") Coach anotherCoach) {
        System.out.println(getClass().getSimpleName() + " constructor called");
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String  checkBeanScope(){
        return "Comparing beans: coach == anotherCoach -> " + (coach == anotherCoach);
    }
}
