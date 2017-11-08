package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Cleaner extends Staff {

    public Cleaner(String name) {
        this.name = name;
    }

    static final String TYPE_PERSON = "Cleaner";

    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    public void salary() {
        System.out.println("Salary: " + 1000 + "$");
    }
}
