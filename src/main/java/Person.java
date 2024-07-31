import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
       if (name == null | name.isEmpty()) {
           throw new IllegalArgumentException("Name cannot be null or empty.");
       }
       if (name.length() > 40) {
           throw new IllegalArgumentException("Name cannot be longer than 40 characters.");
       }
       this.name = name;

       if (age < 0 || age > 120) {
           throw new IllegalArgumentException("Age must be between 0 and 120.");
       }
       this.age = age;
    }
}
