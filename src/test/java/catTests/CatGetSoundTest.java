package catTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundCheck {

    private Feline feline;

    Cat cat = new Cat(feline);
    Cat catSpy = Mockito.spy(cat);

    private String catGetSoundReturnExpected = "Мяу";

    @Test
    public void testCatGetSound(){

        String catGetSoundReturnActual = catSpy.getSound();
        Mockito.verify(catSpy).getSound();

        System.out.printf(catGetSoundReturnActual);
        Assert.assertEquals(catGetSoundReturnExpected, catGetSoundReturnActual);
    }
}
