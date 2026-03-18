package com.tests.common;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class CommonGetKittensTest{

    int getKittensCountExpected = 2;

    //Тест получения котят для класса Feline
    Feline feline = new Feline();

    @Test
    public void testFelineGetKittens(){

        int getKittensCountActual;

        getKittensCountActual = feline.getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);

    }


    //Тест получения котят для класса Lion
    @Mock
    IPredator felineMock = new Feline();
    Lion lion;
    {
        try {
            lion = new Lion(felineMock, "Самка");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testLionGetKittens(){

        int getKittensCountActual;

        getKittensCountActual = lion.getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);
    }


    //Тест получения котят для класса LionAlex
    LionAlex lionAlex;
    {
        try {
            lionAlex = new LionAlex(felineMock, "Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testLionAlexGetKittens(){

        int getAlexKittensCountExpected = 0;
        int getKittensReturnActual = lionAlex.getKittens();

        System.out.println(getKittensReturnActual);
        Assert.assertEquals(getAlexKittensCountExpected, getKittensReturnActual);
    }
}
