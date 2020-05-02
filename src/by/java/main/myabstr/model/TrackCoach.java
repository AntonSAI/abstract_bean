package by.java.main.myabstr.model;

import by.java.main.myabstr.model.Coach;
import by.java.main.myabstr.service.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do It: " + fortuneService.getFortune();
    }

    @Override
    public TrainingPlan createTrainingPlan() {
        return null;
    }

    @Override
    public String printTrainingPlan(String plan) {
        return null;
    }
}
