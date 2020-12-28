package com.demo.springdemo;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes = new String[] {"You will have a good day",
                                                "You will have an OK day",
                                                "Don't bother getting out of bed"};

    @Override
    public String getFortune() {
        int fortuneIndex = (int) (Math.random() * 3);
        return fortunes[fortuneIndex];
    }
}
