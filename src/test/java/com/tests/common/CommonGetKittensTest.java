package com.tests.common;

import com.example.Feline;
import com.example.LionAlex;
import com.tests.lion.base.LionBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CommonGetKittensTest extends LionBaseTest{

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
    @Test
    public void testLionGetKittens(){

        int getKittensCountActual;

        getKittensCountActual = lionSpy.getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);
    }


    //Тест получения котят для класса LionAlex
    LionAlex lionAlex;
    {
        try {
            lionAlex = new LionAlex(feline, "Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    LionAlex lionAlexSpy = Mockito.spy(lionAlex);
    @Test
    public void testLionAlexGetKittens(){

        int getKittensReturnActual = lionAlexSpy.getKittens();
        Mockito.verify(lionAlexSpy).getKittens();

        System.out.println(getKittensReturnActual);

    }
}
