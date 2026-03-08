package catTests;

import com.example.Cat;
import com.example.Feline;
import com.example.IPredator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodCheck {

    IPredator feline = new Feline();
    Cat cat = new Cat(feline);
    Cat catSpy = Mockito.spy(cat);
    List<String> listOfMeatForCatExpected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void testCatGetFood() throws Exception {

        List<String> listOfMeatForCatActual = catSpy.getFood();

        System.out.printf(listOfMeatForCatActual.toString());
        System.out.printf(listOfMeatForCatExpected.toString());

        Assert.assertEquals(listOfMeatForCatExpected, listOfMeatForCatActual);

    }
}
