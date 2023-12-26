package ua.edu.ucu.task1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                        .name("Yulia")
                        .age(18)
                        .gender(Gender.FEMALE)
                        .mark(61)
                        .mark(100)
                        .grades(Arrays.asList(60, 85, 90))
                        .build();
                        //.grades(Arrays.asList(61, 100, 62))


        System.out.println(user);
    }
}
