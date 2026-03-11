package com.tests.lion.alex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexHasManeTest extends LionAlexBaseTest{

    boolean lionAlexHasManeReturnExpected = true;

    @Test
    public void lionAlexHasManeTest(){
        boolean lionAlexHasManeReturnActual = lionAlex.doesHaveMane();

        Assert.assertEquals(lionAlexHasManeReturnExpected, lionAlexHasManeReturnActual);
    }
}
