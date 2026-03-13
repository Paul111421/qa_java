package com.tests.lion.base;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.mockito.Mockito;

public class LionBaseTest {
    IPredator feline = new Feline();
    Lion lion;

    {
        try {
            lion = new Lion(feline, "Самка");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Lion lionSpy = Mockito.spy(lion);
}
