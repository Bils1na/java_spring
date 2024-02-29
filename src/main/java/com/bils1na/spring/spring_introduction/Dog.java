package com.bils1na.spring.spring_introduction;

public class Dog implements Pet{
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say() {
        System.out.println("Whoa-whoa!");
    }

    private void init() {
        System.out.println("Dog init");
    }

    protected void destroy() {
        System.out.println("Dog destroy");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
