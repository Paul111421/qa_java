package com.tests.lion.alex;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexGetFriendsTest extends LionAlexBaseTest{

    List<String> listOfAlexFriendsExpected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

    @Test
    public void lionAlexGetFriendsTest(){
        List<String> listOfAlexFriendsActual = lionAlex.getFriends();

        System.out.println(listOfAlexFriendsExpected);
        System.out.println(listOfAlexFriendsActual);

        Assert.assertEquals(listOfAlexFriendsExpected, listOfAlexFriendsActual);
    }
}
