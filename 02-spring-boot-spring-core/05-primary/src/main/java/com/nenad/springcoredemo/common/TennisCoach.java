package com.nenad.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 20 minutes!";
    }

}
