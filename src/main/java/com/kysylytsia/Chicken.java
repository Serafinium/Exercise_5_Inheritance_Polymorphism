package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Chicken extends NonFlyingBird {

    public Chicken(boolean isFeathers, boolean isLayEggs) {
        this.feathers = isFeathers;
        this.layEggs = isLayEggs;
    }


    @Override
    public String toString() {
        return "Chicken";
    }
}
