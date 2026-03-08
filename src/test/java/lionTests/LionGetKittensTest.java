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
public class LionGetKittensTest extends LionBaseTest{

    private final int getKittensCountExpected;

    public LionGetKittensTest(int getKittensCountExpected){
        this.getKittensCountExpected = getKittensCountExpected;
    }

    @Parameterized.Parameters(name = "Количество: {0}")
    public static Object[][] getKittensCountExpected(){
        return new Object[][]{
                {1},
                {3}
        };
    }

    @Test
    public void testFelineGetKittensNoInt(){

        int getKittensCountActual;

        getKittensCountActual = lionSpy.getKittens(getKittensCountExpected);
        Mockito.verify(lionSpy).getKittens(getKittensCountExpected);

        System.out.println(getKittensCountActual);
        Assert.assertEquals(getKittensCountExpected, getKittensCountActual);
    }
}
