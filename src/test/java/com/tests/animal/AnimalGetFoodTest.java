package com.tests.animal;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    String animalGetFoodType;
    List<String> animalGetFoodExpected;

    public AnimalGetFoodTest(String animalGetFoodType, List<String> animalGetFoodExpected){
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
    Animal animalSpy = Mockito.spy(animal);

    @Test
    public void animalGetFoodTest() throws Exception{

        List<String> animalGetFoodActual = animalSpy.getFood(animalGetFoodType);

        Assert.assertEquals(animalGetFoodExpected, animalGetFoodActual);

        System.out.println(animalGetFoodExpected);
        System.out.println(animalGetFoodActual);
    }

    @Rule
    public ExpectedException animalGetFoodException = ExpectedException.none();

    @Test
    public void animalGetFoodExceptionTest() throws Exception {

        animalGetFoodException.expect(Exception.class);
        animalGetFoodException.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Animal animal = new Animal();
        animal.getFood("Всеядный");

    }

}
