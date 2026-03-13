package com.example;

import java.util.List;

public class Lion {

    private final IPredator predator;
    boolean hasMane;

    //По какой-то причине не подтянулось в гит. Надеюсь теперь загрузилось
    public Lion(IPredator predator, String sex) throws Exception {
        this.predator = predator;
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
