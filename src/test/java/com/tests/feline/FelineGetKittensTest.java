package com.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {

    private final int getKittensCountExpected;

    public FelineGetKittensTest(int getKittensCountExpected){
        this.getKittensCountExpected = getKittensCountExpected;
    }

    @Parameterized.Parameters(name = "Количество: {0}")
    public static Object[][] getKittensCountExpected(){
        return new Object[][]{
                {1},
                {3}
        };
    }

    Feline feline = new Feline();

    @Test
    public void testFelineGetKittens(){

        int getKittensCountActual;

        getKittensCountActual = feline.getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);

    }
}
