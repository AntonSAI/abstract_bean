package by.java.main.myabstr;

import by.java.main.myabstr.model.BaseballCoach;
import by.java.main.myabstr.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacerDemoRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("by/resources/replacer.xml");

        Coach coach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(((BaseballCoach) coach).checkEquipment());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
