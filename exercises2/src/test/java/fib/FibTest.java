package fib;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class FibTest {

    @Test
    public void test1(){
        assertArrayEquals(new int[]{1,1,2},Fib.fib(3));
    }
    @Test
    public void test2(){
        assertArrayEquals(new int[]{}, Fib.fib(0));
    }
    @Test
    public void test3(){
        assertArrayEquals(new int[]{1}, Fib.fib(1));
    }
}
