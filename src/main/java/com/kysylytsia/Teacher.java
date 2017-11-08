package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Teacher extends Staff {

    public Teacher(String name) {
        this.name = name;
    }

    static final String TYPE_PERSON = "Teacher";

    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    public void salary() {
        System.out.println("Salary: " + 3000 + "$");
    }
}
