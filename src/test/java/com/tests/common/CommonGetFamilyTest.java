package com.tests.common;

import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CommonGetFamilyTest {

    //Тест семьи для класса Animal
    Animal animal = new Animal();

    String animalGetFamilyReturnExpected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void animalGetFamilyTest(){
        String animalGetFamilyReturnActual = animal.getFamily();

        Assert.assertEquals(animalGetFamilyReturnExpected, animalGetFamilyReturnActual);
        System.out.println(animalGetFamilyReturnActual);
    }


    //Тест семьи для класса Feline
    @Spy
    Feline feline;

    @Test
    public void testFelineGetFamily(){

        String felineGetFamilyReturnActual = feline.getFamily();
        System.out.println(felineGetFamilyReturnActual + "\n");

        String felineGetFamilyReturnExpected = "Кошачьи";
        Assert.assertEquals(felineGetFamilyReturnExpected, felineGetFamilyReturnActual);
    }

}
