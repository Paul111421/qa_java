package com.example;

import java.util.List;

public class Feline extends Animal implements IPredator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
