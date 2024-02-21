package com.bils1na.spring.spring_introduction;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Whoa-whoa!");
    }
}
