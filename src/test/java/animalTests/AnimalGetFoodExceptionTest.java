package animalTests;

import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class AnimalGetFoodExceptionTest {

    @Rule
    public ExpectedException animalGetFoodException = ExpectedException.none();

    @Test
    public void testLionHasMane() throws Exception {

        animalGetFoodException.expect(Exception.class);
        animalGetFoodException.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Animal animal = new Animal();
        List<String> animalExceptionList = animal.getFood("Всеядный");

    }

}
