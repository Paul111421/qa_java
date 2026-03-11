package com.tests.cat;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CatGetFoodTest extends CatBaseTest{

    List<String> listOfMeatForCatExpected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void testCatGetFood() throws Exception {

        List<String> listOfMeatForCatActual = catSpy.getFood();

        System.out.println(listOfMeatForCatActual);
        System.out.println(listOfMeatForCatExpected);

        Assert.assertEquals(listOfMeatForCatExpected, listOfMeatForCatActual);

    }
}
