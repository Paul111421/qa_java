package com.tests.cat;

import org.junit.Assert;
import org.junit.Test;


public class CatGetSoundTest extends CatBaseTest{

    @Test
    public void testCatGetSound(){

        String catGetSoundReturnActual = cat.getSound();

        System.out.printf(catGetSoundReturnActual);
        String catGetSoundReturnExpected = "Мяу";

        Assert.assertEquals(catGetSoundReturnExpected, catGetSoundReturnActual);
    }
}
