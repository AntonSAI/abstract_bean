package by.java.main.myabstr.model;

import by.java.main.myabstr.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("Inside non-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public TrainingPlan createTrainingPlan() {
        return null;
    }

    @Override
    public String printTrainingPlan(String plan) {
        return null;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}
