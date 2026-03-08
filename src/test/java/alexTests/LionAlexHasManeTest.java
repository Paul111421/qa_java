package alexTests;

import com.example.Feline;
import com.example.IPredator;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexHasManeTest {

    IPredator feline = new Feline();
    LionAlex alex = new LionAlex(feline);
    LionAlex alexSpy = Mockito.spy(alex);

    boolean alexHasManeReturnExpected = true;

    @Test
    public void alexHasManeTest(){
        boolean alexHasManeReturnActual = alexSpy.doesHaveMane();
        Mockito.verify(alexSpy).doesHaveMane();

        Assert.assertEquals(alexHasManeReturnExpected, alexHasManeReturnActual);
    }
}
