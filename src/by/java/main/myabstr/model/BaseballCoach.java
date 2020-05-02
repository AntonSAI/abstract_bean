package by.java.main.myabstr.model;

import by.java.main.myabstr.service.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach() {
    }

    public String checkEquipment() {
        return "Check old sports equipment.";
    }


    @Override
    public TrainingPlan createTrainingPlan() {
        TrainingPlan trainingPlan = new TrainingPlan();
        return trainingPlan;
    }

    public String printTrainingPlan(String plan) {
        TrainingPlan trainingPlan = createTrainingPlan();
        trainingPlan.setPlanContext(plan);
        return "U must do the following exercises: " + trainingPlan.getPlanContext();
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
