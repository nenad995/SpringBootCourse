package com.nenad.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 minutes!";
    }
}
