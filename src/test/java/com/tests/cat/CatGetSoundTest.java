package com.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;


public class CatGetSoundTest{

    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void testCatGetSound(){

        String catGetSoundReturnActual = cat.getSound();

        System.out.printf(catGetSoundReturnActual);
        String catGetSoundReturnExpected = "Мяу";

        Assert.assertEquals(catGetSoundReturnExpected, catGetSoundReturnActual);
    }
}
