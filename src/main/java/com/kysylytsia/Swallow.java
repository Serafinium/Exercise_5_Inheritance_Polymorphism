package com.kysylytsia;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class Swallow extends FlyingBird {

    public Swallow(boolean isFeathers, boolean isLayEggs) {
        this.feathers = isFeathers;
        this.layEggs = isLayEggs;
    }


    @Override
    public String toString() {
        return "Swallow";
    }
}
