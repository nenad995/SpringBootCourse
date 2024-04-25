package com.nenad.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @PostConstruct
    public void doStartUpStuff(){
        System.out.println("Doing init method in: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanUpStuff(){
        System.out.println("Doing destroy method in: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 20 minutes!";
    }

}
