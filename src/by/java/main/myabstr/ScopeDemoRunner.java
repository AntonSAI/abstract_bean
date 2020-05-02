package by.java.main.myabstr;

import by.java.main.myabstr.model.BaseballCoach;
import by.java.main.myabstr.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("by/resources/scope.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.printTrainingPlan("run"));

        ((ClassPathXmlApplicationContext) context).close();
    }
}
