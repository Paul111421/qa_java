package com.example;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion{

    private List<String> listOfAlexFriends;
    private String placeOfLiving;

    private boolean hasMane = true;

    public LionAlex(IPredator predator) {
        super(predator);
    }

    public int getKittens(){return 0;}

    public List<String> getFriends(){
        return listOfAlexFriends = Arrays.asList("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLiving(){
        return placeOfLiving = "Нью-Йоркский зоопарк";
    }

    @Override
    public boolean doesHaveMane() {
        return hasMane;
    }
}
