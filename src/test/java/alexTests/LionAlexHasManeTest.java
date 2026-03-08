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
public class LionAlexHasManeTest extends LionAlexBaseTest{

    boolean lionAlexHasManeReturnExpected = true;

    @Test
    public void lionAlexHasManeTest(){
        boolean lionAlexHasManeReturnActual = lionAlexSpy.doesHaveMane();
        Mockito.verify(lionAlexSpy).doesHaveMane();

        Assert.assertEquals(lionAlexHasManeReturnExpected, lionAlexHasManeReturnActual);
    }
}
