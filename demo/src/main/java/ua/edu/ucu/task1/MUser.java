package ua.edu.ucu.task1;

enum Gender {
    MALE, FEMALE
}

public class MUser {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    public MUser(String name, int age, Gender gender, double weight, double height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public MUser(String name, int age, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public MUser(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public MUser(String name) {
        this.name = name;
        this.gender = null;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
}