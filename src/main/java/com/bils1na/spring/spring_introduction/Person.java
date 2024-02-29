package com.bils1na.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created!");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created!");
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

    // pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Surname set");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Age set");
        this.age = age;
    }
}
