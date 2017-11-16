import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestConvertFtoK {
    @Parameterized.Parameter
    public double expected;
    @Parameterized.Parameter(1)
    public double value;

    TemperatureConverter tc;

    @Parameterized.Parameters(name="{index}: expected result {0} value {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {373.2,212},
                {365.2,197.6},
                {358.2,185}
        });
    }

    @Before
    public void initialize(){
        tc = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(expected,tc.convertFtoK(value),0.5);
    }
}
