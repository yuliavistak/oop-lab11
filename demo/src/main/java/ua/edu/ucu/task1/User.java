package ua.edu.ucu.task1;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private Gender gender;

}
