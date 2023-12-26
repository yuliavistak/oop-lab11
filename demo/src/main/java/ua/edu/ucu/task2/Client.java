package ua.edu.ucu.task2;

import lombok.Getter;

enum Gender {
    MALE, FEMALE
}


public class Client {
    private static int clientCounter;
    private int id;

    @Getter
    private String name;
    private int age;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        id = clientCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}