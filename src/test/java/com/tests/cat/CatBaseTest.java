package com.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CatBaseTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;
    Cat cat = new Cat(feline);
}
