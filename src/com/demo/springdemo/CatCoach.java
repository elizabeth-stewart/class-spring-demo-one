package com.demo.springdemo;

public class CatCoach implements Coach {
    private FortuneService fortuneService;

    public CatCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Sit on the couch for at least 8 hours.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    // custom init method
    public void doMyStartupStuff() {
        System.out.println("CatCoach: in doMyStartupStuff method");
    }

    // custom destroy method
    public void doMyShutdownStuffYoYo() {
        System.out.println("CatCoach: in doMyShutdownStuffYoYo method");
    }
}
