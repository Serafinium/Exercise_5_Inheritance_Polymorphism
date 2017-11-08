package com.kysylytsia;

import java.util.Random;
/**
 * Created by SERAFIM on 07.11.2017.
 */
public class App {

    public static void main(String[] args){
        IAnimal[] array = App.generator(5);

        for(IAnimal animal: array){
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }

    /**
     * this method generating random arrays
     * @param sizeArray
     * @return
     */
    public static IAnimal[] generator (int sizeArray){
        IAnimal[] array = new IAnimal[sizeArray];
        Random random = new Random();

        for (int i=0; i<sizeArray; i++){
            if(random.nextBoolean()){
                array[i] = new Cat();
            } else array [i] = new Dog();
        }
        return array;
    }
}