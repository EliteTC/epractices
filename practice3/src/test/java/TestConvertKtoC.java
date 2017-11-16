import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestConvertKtoC {

    @Parameterized.Parameter
    public double expected;
    @Parameterized.Parameter(1)
    public double value;

    TemperatureConverter tc;

    @Parameterized.Parameters(name="{index}: expected result {0} value {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {100,373.2},
                {92,365.2},
                {85,358.2}
        });
    }

    @Before
    public void initialize(){
        tc = new TemperatureConverter();
    }

    @Test
    public void testConvertKtoC(){
        assertEquals(expected,tc.convertKtoC(value),0);
    }
}
