package max;

import arrays.max.Max;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void test1() {
        assertEquals(7, Max.max(new int[]{1, 3, 2, 7, 5, 4}));
    }
}
