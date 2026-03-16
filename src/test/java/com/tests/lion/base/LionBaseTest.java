package com.tests.lion.base;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class LionBaseTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
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
