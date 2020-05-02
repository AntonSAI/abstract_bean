package by.java.main.myabstr.service;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "It was bad day...";
    }
}
