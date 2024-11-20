package factorial;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void test1(){
        assertEquals(6,Factorial.fact(3));
    }
    @Test
        public void test2(){
        assertEquals(1,Factorial.fact(0));
    }
}
