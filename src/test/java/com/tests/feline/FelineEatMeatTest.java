package com.tests.feline;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {

    @Spy
    Feline feline;
    List<String> listOfMeatExpected = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void testFelineEatMeat() throws Exception {

        List<String> listOfMeatActual = feline.eatMeat();

        Assert.assertEquals(listOfMeatExpected, listOfMeatActual);

    }
}
