package com.tests.lion.alex;

import org.junit.Test;
import org.mockito.Mockito;

public class LionAlexGetKittensTest extends LionAlexBaseTest{

    @Test
    public void lionAlexGetKittensTest(){
        int getKittensReturnActual = lionAlexSpy.getKittens();
        Mockito.verify(lionAlexSpy).getKittens();

        System.out.println(getKittensReturnActual);

    }
}
