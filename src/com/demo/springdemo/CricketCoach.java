package com.demo.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Inside CricketCoach no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Inside CricketCoach setter method for fortuneService");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside CricketCoach setter method for setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside CricketCoach setter method for setTeam");
        this.team = team;
    }
}
