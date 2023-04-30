package max2d;

import arrays.max2d.Max2D;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Max2dTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 5, 8}, Max2D.max2d(new int[][]{{0, 1, 2}, {4, 2, 5}, {8, 6, 3}}));
    }
}
