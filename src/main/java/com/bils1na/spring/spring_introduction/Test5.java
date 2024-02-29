package com.bils1na.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myPet = context.getBean("myPet", Dog.class);
        myPet.say();

        Dog yourPet = context.getBean("myPet", Dog.class);
        yourPet.say();

        context.close();
    }
}
