package alexTests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class LionAlexGetKittensTest extends LionAlexBaseTest{

    int getKittensReturnExpected = 0;

    @Test
    public void lionAlexGetKittensTest(){
        int getKittensReturnActual = lionAlexSpy.getKittens();
        Mockito.verify(lionAlexSpy).getKittens();

        System.out.println(getKittensReturnExpected);
        System.out.println(getKittensReturnActual);

        Assert.assertEquals(getKittensReturnExpected, getKittensReturnActual);
    }
}
