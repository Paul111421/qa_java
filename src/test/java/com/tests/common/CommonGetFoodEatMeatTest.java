package com.tests.common;

import com.example.Cat;
import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CommonGetFoodEatMeatTest {

    //Тест еды для класса Cat
    IPredator feline = new Feline();
    Cat cat = new Cat(feline);
    Cat catSpy = Mockito.spy(cat);

    List<String> listOfMeatForCatExpected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void testCatGetFood() throws Exception {

        List<String> listOfMeatForCatActual = catSpy.getFood();

        System.out.println(listOfMeatForCatActual);
        System.out.println(listOfMeatForCatExpected + "\n");

        Assert.assertEquals(listOfMeatForCatExpected, listOfMeatForCatActual);

    }


    //Тест еды для класса Feline
    @Spy
    Feline felineSpy;
    List<String> listOfMeatForFelineExpected = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void testFelineEatMeat() throws Exception {

        List<String> listOfMeatForFelineActual = felineSpy.eatMeat();
        System.out.println(listOfMeatForFelineActual + "\n");

        Assert.assertEquals(listOfMeatForFelineExpected, listOfMeatForFelineActual);

    }


    //Тест еды для класса Lion
    Lion lion;
    {
        try {
            lion = new Lion(feline, "Самка");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    Lion lionSpy = Mockito.spy(lion);

    List<String> listOfMeatForLionExpected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void testLionGetFood() throws Exception {

        List<String> listOfMeatForLionActual = lionSpy.getFood();

        System.out.printf(listOfMeatForLionActual.toString());
        System.out.printf(listOfMeatForLionExpected.toString() + "\n");

        Assert.assertEquals(listOfMeatForLionExpected, listOfMeatForLionActual);

    }
}
