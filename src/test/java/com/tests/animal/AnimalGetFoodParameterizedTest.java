package com.tests.animal;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodParameterizedTest {

    String animalGetFoodType;
    List<String> animalGetFoodExpected;

    public AnimalGetFoodParameterizedTest(String animalGetFoodType, List<String> animalGetFoodExpected){
        this.animalGetFoodType = animalGetFoodType;
        this.animalGetFoodExpected = animalGetFoodExpected;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] animalGetFoodTestParameters(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    Animal animal = new Animal();

    @Test
    public void animalGetFoodTest() throws Exception{

        List<String> animalGetFoodActual = animal.getFood(animalGetFoodType);

        Assert.assertEquals(animalGetFoodExpected, animalGetFoodActual);

        System.out.println(animalGetFoodExpected);
        System.out.println(animalGetFoodActual);
    }

}
