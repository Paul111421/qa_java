package lionTests;

import com.example.Feline;
import com.example.IPredator;
import com.example.Lion;
import org.mockito.Mockito;

public class LionBaseTest {
    IPredator feline = new Feline();
    Lion lion = new Lion(feline);
    Lion lionSpy = Mockito.spy(lion);
}
