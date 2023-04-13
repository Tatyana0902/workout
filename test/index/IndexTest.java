package index;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IndexTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 3}, Index.index("ABCAB", 'A'));
    }
}
