package primenumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    @Test
    public void test1() {
        assertTrue(PrimeNumber.primeNumber(3));
    }

    @Test
    public void test2() {
        assertFalse(PrimeNumber.primeNumber(4));
    }
}
