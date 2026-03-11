package com.tests.lion.alex;

import org.junit.Assert;
import org.junit.Test;

public class LionAlexGetPlaceOfLivingTest extends LionAlexBaseTest{

    String placeOfLivingExpected = "Нью-Йоркский зоопарк";

    @Test
    public void lionAlexGetPlaceOfLivingTest(){
        String placeOfLivingActual = lionAlex.getPlaceOfLiving();

        System.out.println(placeOfLivingExpected);
        System.out.println(placeOfLivingActual);

        Assert.assertEquals(placeOfLivingExpected, placeOfLivingActual);
    }
}
