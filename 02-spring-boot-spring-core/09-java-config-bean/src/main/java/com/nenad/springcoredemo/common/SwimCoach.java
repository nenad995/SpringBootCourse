package com.nenad.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice dolphin style today!";
    }
}
