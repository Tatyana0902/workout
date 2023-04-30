package arrayindex;

import arrays.arrayindex.ArrayIndex;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayIndexTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 4, 6}, ArrayIndex.arrayIndex(new int[]{1, 2, 3, 6, 3, 7, 3}, 3));
    }
}
