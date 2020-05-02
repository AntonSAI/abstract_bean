package by.java.main.myabstr;

import by.java.main.myabstr.model.Coach;
import by.java.main.myabstr.model.TennisCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleDemoRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("by/resources/lifecycle.xml");
        Coach coach = context.getBean("myCoach", TennisCoach.class);

        coach.getDailyWorkout();
        coach.getDailyFortune();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
