package evennumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenNumberTest {
    @Test
    public void test1() {
        assertEquals("even number", EvenNumber.evenNumber(2));
    }

    @Test
    public void test2() {
        assertEquals("not even number", EvenNumber.evenNumber(3));
    }

    @Test
    public void test3() {
        assertEquals("not even number", EvenNumber.evenNumber(-3));
    }
    @Test
    public void test4() {
        assertEquals("even number", EvenNumber.evenNumber(0));
    }
}
