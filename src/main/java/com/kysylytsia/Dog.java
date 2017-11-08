package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Dog implements IAnimal {
    public void voice() {
        System.out.print("Woof - Wooof  ");
    }

    public void feed() {
        System.out.print(this + " eats Pedigree  ");
    }

    @Override
    public String toString() {
        return "Dog: ";
    }
}
