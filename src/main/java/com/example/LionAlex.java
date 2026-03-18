package com.example;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion{

    public LionAlex(IPredator predator, String sex) throws Exception {
        super(predator, sex = "Самец");
    }

    public int getKittens(){return 0;}

    public List<String> getFriends(){
        List<String> listOfAlexFriends;
        return listOfAlexFriends = Arrays.asList("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLiving(){
        String placeOfLiving;
        return placeOfLiving = "Нью-Йоркский зоопарк";
    }

}
