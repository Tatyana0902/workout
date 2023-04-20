package factorial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testNegative() {
        try {
            //noinspection ResultOfMethodCallIgnored
            Factorial.factorial(-1);
            Assert.fail("Exception expected");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void test1() {
        assertEquals(1, Factorial.factorial(0));
    }


    @Test
    public void test2() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void test3(){
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    public void test4(){
        assertEquals(3628800, Factorial.factorial(10));
    }
}

