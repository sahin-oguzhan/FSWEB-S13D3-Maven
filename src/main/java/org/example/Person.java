package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    String hairColor;
    String eyeColor;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height, String hairColor, String eyeColor) {
        this(firstName, lastName, age);
        this.height = height;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age <= 19 && age >= 13;
    }
}
