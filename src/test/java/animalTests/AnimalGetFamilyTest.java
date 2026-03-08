package animalTests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFamilyTest {

    @Spy
    Animal animalSpy;

    String animalGetFamilyReturnExpected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Test
    public void animalGetFamilyTest(){
        String animalGetFamilyReturnActual = animalSpy.getFamily();
        Mockito.verify(animalSpy).getFamily();

        Assert.assertEquals(animalGetFamilyReturnExpected, animalGetFamilyReturnActual);
        System.out.println(animalGetFamilyReturnActual);
    }

}
