package com.tests.lion.alex;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class LionAlexBaseTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Mock
    Feline feline;
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
