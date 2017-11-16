import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestConvertFtoC {
    @Parameterized.Parameter
    public double expected;
    @Parameterized.Parameter(1)
    public double value;
    TemperatureConverter tc;

    @Parameterized.Parameters(name="{index}: expected result {0} value {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {100,212},
                {92,197.6},
                {85,185}
        });
    }

    @Before
    public void initialize(){
        tc = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC(){

        assertEquals(expected,tc.convertFtoC(value),0);
    }


}
