package catTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest extends CatBaseTest{

    private String catGetSoundReturnExpected = "Мяу";

    @Test
    public void testCatGetSound(){

        String catGetSoundReturnActual = catSpy.getSound();
        Mockito.verify(catSpy).getSound();

        System.out.printf(catGetSoundReturnActual);
        Assert.assertEquals(catGetSoundReturnExpected, catGetSoundReturnActual);
    }
}
