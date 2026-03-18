package com.tests.lion.base;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    private final String getLionManeCheckSexString;
    private final boolean getLionManeCheckBooleanExpected;

    public LionHasManeTest(String getLionManeCheckSexString, boolean getLionManeCheckBooleanExpected){
        this.getLionManeCheckSexString = getLionManeCheckSexString;
        this.getLionManeCheckBooleanExpected = getLionManeCheckBooleanExpected;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] getLionManeCheckParameters(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionHasMane() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(feline, getLionManeCheckSexString);
        Lion lionSpy = Mockito.spy(lion);

        boolean getLionManeCheckBooleanActual = lionSpy.doesHaveMane();

        Assert.assertEquals(getLionManeCheckBooleanExpected, getLionManeCheckBooleanActual);
    }
}
