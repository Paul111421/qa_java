package com.example;

import java.util.List;

public class Cat {

    IPredator predator;

    public Cat(IPredator predator) {
        this.predator = predator;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
