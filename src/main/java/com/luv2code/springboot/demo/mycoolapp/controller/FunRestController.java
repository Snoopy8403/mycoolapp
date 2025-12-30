package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hellobello";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Go RUN!";
    }

    @GetMapping("/getCoach")
    public String getCoach(){
        return "Coach: " + this.coachName + " Team: " + this.teamName;
    }
}
