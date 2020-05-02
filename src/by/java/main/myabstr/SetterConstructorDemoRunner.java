package by.java.main.myabstr;

import by.java.main.myabstr.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class SetterConstructorDemoRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("by/resources/spring.xml");
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
