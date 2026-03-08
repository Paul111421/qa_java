package alexTests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class LionAlexGetPlaceOfLivingTest extends LionAlexBaseTest{

    String placeOfLivingExpected = "Нью-Йоркский зоопарк";

    @Test
    public void lionAlexGetPlaceOfLivingTest(){
        String placeOfLivingActual = lionAlexSpy.getPlaceOfLiving();
        Mockito.verify(lionAlexSpy).getPlaceOfLiving();

        System.out.println(placeOfLivingExpected);
        System.out.println(placeOfLivingActual);

        Assert.assertEquals(placeOfLivingExpected, placeOfLivingActual);
    }
}
