package com.example;

import java.util.List;

public class Lion {

    private IPredator predator;
    boolean hasMane;

    public Lion(IPredator predator){
        this.predator = predator;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    public int getKittens(int kittensCount) {
        return predator.getKittens(kittensCount);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
