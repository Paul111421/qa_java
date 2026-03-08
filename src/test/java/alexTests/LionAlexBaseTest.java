package alexTests;

import com.example.Feline;
import com.example.IPredator;
import com.example.LionAlex;
import org.mockito.Mockito;

public class LionAlexBaseTest {

        IPredator feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        LionAlex lionAlexSpy = Mockito.spy(lionAlex);

}
