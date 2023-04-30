package averagevalue;

import arrays.averagevalue.AverageValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageValueTest {
    @Test
    public void test1() { assertEquals (1, AverageValue.averageValue(new double[]{0,1,2}),10e-5);}

    @Test
    public void test2() { assertEquals (1.5, AverageValue.averageValue(new double[]{1.5,1,2}),10e-5);}

    @Test
    public void test3() { assertEquals (0, AverageValue.averageValue(new double[]{0,0,0}),10e-5);}
}
