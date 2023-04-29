package fib;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0}, Fib.fib(1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0}, Fib.fib(1));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, Fib.fib(5));
    }
}
