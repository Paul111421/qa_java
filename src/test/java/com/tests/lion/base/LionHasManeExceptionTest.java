package com.tests.lion.base;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionHasManeExceptionTest {
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
