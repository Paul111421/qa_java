package lionTests;

import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionHasManeExceptionTest {

    @Rule
    public ExpectedException lionHasManeException = ExpectedException.none();

    @Test
    public void testLionHasMane() throws Exception {

        lionHasManeException.expect(Exception.class);
        lionHasManeException.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        new Lion("Серединный пол");

    }
}
