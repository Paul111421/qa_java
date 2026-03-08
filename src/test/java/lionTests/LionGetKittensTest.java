package lionTests;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionGetKittensCheck {

    private final int getKittensCountExpected;

    public LionGetKittensCheck (int getKittensCountExpected){
        this.getKittensCountExpected = getKittensCountExpected;
    }

    @Parameterized.Parameters(name = "Количество: {0}")
    public static Object[][] getKittensCountExpected(){
        return new Object[][]{
                {1},
                {3}
        };
    }

    IPredator feline = new Feline();
    Lion lion = new Lion(feline);
    Lion lionSpy = Mockito.spy(lion);

    @Test
    public void testFelineGetKittensNoInt(){

        int getKittensCountActual;

        getKittensCountActual = lionSpy.getKittens(getKittensCountExpected);
        Mockito.verify(lionSpy).getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);
    }
}
