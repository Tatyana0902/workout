package factorial2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void test1(){
        assertEquals(6,Factorial.fact(3));
    }
}
