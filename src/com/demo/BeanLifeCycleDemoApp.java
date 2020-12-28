package com.demo;

import com.demo.springdemo.CatCoach;
import com.demo.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // get the catCoach bean
        Coach myCoach = context.getBean("myCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
