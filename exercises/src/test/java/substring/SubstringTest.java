package substring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringTest {

    @Test
    public void test1() {
        assertEquals(0, Substring.substring("", "AB"));
    }

    @Test
    public void test2() {
        assertEquals(0, Substring.substring("ACABCD", ""));
    }

    @Test
    public void test3() {
        assertEquals(1, Substring.substring("AB", "AB"));
    }

    @Test
    public void test4() {
        assertEquals(2, Substring.substring("ACABCDAB", "AB"));
    }
}

