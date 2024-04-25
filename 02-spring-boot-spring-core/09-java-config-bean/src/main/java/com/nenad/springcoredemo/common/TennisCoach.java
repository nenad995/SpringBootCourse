package com.nenad.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 20 minutes!";
    }

}
