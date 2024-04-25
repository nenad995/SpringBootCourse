package com.nenad.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 20 minutes!";
    }

}
