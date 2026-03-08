package com.example;

import java.util.List;

public interface IPredator {

    int getKittens(int kittensCount);
    List<String> eatMeat() throws Exception;

}
