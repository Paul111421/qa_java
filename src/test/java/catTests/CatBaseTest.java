package catTests;

import com.example.Cat;
import com.example.Feline;
import com.example.IPredator;
import org.mockito.Mockito;

public class CatBaseTest {
    IPredator feline = new Feline();
    Cat cat = new Cat(feline);
    Cat catSpy = Mockito.spy(cat);
}
