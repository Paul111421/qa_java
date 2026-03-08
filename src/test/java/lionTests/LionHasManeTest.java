package lionTests;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionHasManeCheck {

    private String getLionManeCheckSexString;
    private boolean getLionManeCheckBooleanExpected;

    public LionHasManeCheck(String getLionManeCheckSexString, boolean getLionManeCheckBooleanExpected){
        this.getLionManeCheckSexString = getLionManeCheckSexString;
        this.getLionManeCheckBooleanExpected = getLionManeCheckBooleanExpected;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] getLionManeCheckParameters(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"самец", true},
                {"самка", false}
        };
    }

    @Test
    public void testLionHasMane() throws Exception {

        Lion lion = new Lion(getLionManeCheckSexString);
        Lion lionSpy = Mockito.spy(lion);

        boolean getLionManeCheckBooleanActual = lionSpy.doesHaveMane();

        Assert.assertEquals(getLionManeCheckBooleanExpected, getLionManeCheckBooleanActual);
    }
}
