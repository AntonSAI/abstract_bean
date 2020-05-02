package by.java.main.myabstr.model;

public interface Coach {
    String getDailyWorkout();

    String getDailyFortune();

    TrainingPlan createTrainingPlan();

    String printTrainingPlan(String plan);
}
