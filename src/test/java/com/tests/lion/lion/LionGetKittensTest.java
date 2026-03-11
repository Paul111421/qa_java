package com.tests.lion.lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionGetKittensTest extends LionBaseTest{

    private final int getKittensCountExpected;

    public LionGetKittensTest(int getKittensCountExpected){
        this.getKittensCountExpected = getKittensCountExpected;
    }

    @Parameterized.Parameters(name = "Количество: {0}")
    public static Object[][] getKittensCountExpected(){
        return new Object[][]{
                {1},
                {3}
        };
    }

    @Test
    public void testLionGetKittens(){

        int getKittensCountActual;

        getKittensCountActual = lionSpy.getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);
    }
}
