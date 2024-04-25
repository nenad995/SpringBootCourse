package com.nenad.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5000 meters!";
    }

}
