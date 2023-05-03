package factorialrecursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialRecursionTest {
    @Test
    public void test1(){
        assertEquals(1,FactorialRecursion.fact(1));
    }

    @Test
    public void test2(){
        assertEquals(6,FactorialRecursion.fact(3));
    }
}
