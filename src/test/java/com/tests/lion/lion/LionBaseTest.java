package com.tests.lion.lion;

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

    Lion lionSpy = Mockito.spy(lion);
}
