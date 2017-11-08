package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Cat implements IAnimal {
    public void voice() {
        System.out.print("Mew - Mew  ");
    }

    @Override
    public String toString() {
        return "Cat: ";
    }

    public void feed() {
        System.out.print(this + " eats Kitekat  ");
    }
}
