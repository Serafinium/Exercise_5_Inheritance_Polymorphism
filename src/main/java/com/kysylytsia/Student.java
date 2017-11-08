package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Student extends Person {

    public Student(String name) {
        this.name = name;
    }

    static final String TYPE_PERSON = "Student";
    
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
