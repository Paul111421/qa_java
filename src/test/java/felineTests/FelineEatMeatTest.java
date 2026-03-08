package felineTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatCheck {

    @Spy
    Feline feline;
    List<String> listOfMeatExpected = new ArrayList<>();

    @Test
    public void testFelineEatMeat() throws Exception {

        listOfMeatExpected.add("Животные");
        listOfMeatExpected.add("Птицы");
        listOfMeatExpected.add("Рыба");

        List<String> listOfMeatActual = feline.eatMeat();
        Mockito.verify(feline).eatMeat();

        Assert.assertEquals(listOfMeatExpected, listOfMeatActual);

    }
}
