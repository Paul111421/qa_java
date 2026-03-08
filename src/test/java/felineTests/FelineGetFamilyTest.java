package felineTests;


import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetFamilyCheck {

    String felineGetFamilyReturnActual;
    @Spy
    Feline feline;
    private String felineGetFamilyReturnExpected = "Кошачьи";

    @Test
    public void testFelineGetFamily(){

        felineGetFamilyReturnActual = feline.getFamily();
        Mockito.verify(feline).getFamily();

        Assert.assertEquals(felineGetFamilyReturnExpected, felineGetFamilyReturnActual);
    }
}
