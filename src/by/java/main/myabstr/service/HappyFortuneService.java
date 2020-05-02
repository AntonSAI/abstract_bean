package by.java.main.myabstr.service;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is ur lucky day!";
    }
}
