package by.java.main.myabstr.model;

public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public TrainingPlan createTrainingPlan() {
        return null;
    }

    @Override
    public String printTrainingPlan(String plan) {
        return null;
    }

    public void doMyStartupStuff() {
        System.out.println("TennisCoach: Inside method doMyStartupStuff");
    }

    public void doMyStartupStuffYoYo() {
        System.out.println("TennisCoach: Inside method doMyStartupStuffYoYo");
    }
}
