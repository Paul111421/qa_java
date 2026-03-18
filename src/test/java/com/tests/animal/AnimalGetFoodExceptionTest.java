package com.tests.animal;

import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnimalGetFoodExceptionTest {

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
