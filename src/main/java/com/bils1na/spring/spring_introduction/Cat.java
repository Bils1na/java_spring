package com.bils1na.spring.spring_introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
