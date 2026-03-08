package felineTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class FelineGetKittensCheck {

    private final int getKittensCountExpected;

    public FelineGetKittensCheck (int getKittensCountExpected){
        this.getKittensCountExpected = getKittensCountExpected;
    }

    @Parameterized.Parameters(name = "Количество: {0}")
    public static Object[][] getKittensCountExpected(){
        return new Object[][]{
                {1},
                {3}
        };
    }

    Feline feline = new Feline();
    Feline felineSpy = Mockito.spy(feline);

    @Test
    public void testFelineGetKittensNoInt(){

        int getKittensCountActual;

        getKittensCountActual = felineSpy.getKittens(getKittensCountExpected);
        Mockito.verify(felineSpy).getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);

    }
}
