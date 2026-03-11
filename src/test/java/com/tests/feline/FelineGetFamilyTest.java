package com.tests.feline;


import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetFamilyTest {

    String felineGetFamilyReturnActual;
    @Spy
    Feline feline;

    @Test
    public void testFelineGetFamily(){

        felineGetFamilyReturnActual = feline.getFamily();

        String felineGetFamilyReturnExpected = "Кошачьи";
        Assert.assertEquals(felineGetFamilyReturnExpected, felineGetFamilyReturnActual);
    }
}
