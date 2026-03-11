package com.tests.lion.alex;

import com.example.Feline;
import com.example.IPredator;
import com.example.LionAlex;
import org.mockito.Mockito;

public class LionAlexBaseTest {

        IPredator feline = new Feline();
        LionAlex lionAlex;

    {
        try {
            lionAlex = new LionAlex(feline, "Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    LionAlex lionAlexSpy = Mockito.spy(lionAlex);

}
