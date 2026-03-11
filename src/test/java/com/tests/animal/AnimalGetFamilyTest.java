package com.tests.animal;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalGetFamilyTest {

    Animal animal = new Animal();

    String animalGetFamilyReturnExpected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void animalGetFamilyTest(){
        String animalGetFamilyReturnActual = animal.getFamily();

        Assert.assertEquals(animalGetFamilyReturnExpected, animalGetFamilyReturnActual);
        System.out.println(animalGetFamilyReturnActual);
    }

}
