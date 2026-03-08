package lionTests;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class LionGetFoodTest extends LionBaseTest{

    List<String> listOfMeatForLionExpected = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void testLionGetFood() throws Exception {

        List<String> listOfMeatForLionActual = lionSpy.getFood();

        System.out.printf(listOfMeatForLionActual.toString());
        System.out.printf(listOfMeatForLionExpected.toString());

        Assert.assertEquals(listOfMeatForLionExpected, listOfMeatForLionActual);

    }
}
