package com.tests.lion.base;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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

    @Rule
    public ExpectedException lionHasManeException = ExpectedException.none();

    @Test
    public void testLionHasManeException() throws Exception {

        lionHasManeException.expect(Exception.class);
        lionHasManeException.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        IPredator feline = new Feline();
        new Lion(feline, "Серединный пол");

    }
}
