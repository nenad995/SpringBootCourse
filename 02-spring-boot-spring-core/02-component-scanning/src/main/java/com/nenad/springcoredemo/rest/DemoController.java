package com.nenad.springcoredemo.rest;

import com.nenad.springcoredemo.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private CricketCoach cricketCoach;

    @Autowired
    public DemoController(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return cricketCoach.getDailyWorkout();
    }
}
