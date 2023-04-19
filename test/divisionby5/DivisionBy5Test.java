package divisionby5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DivisionBy5Test {
    @Test
    public void test1(){
        assertArrayEquals(new int[]{5,10,15},DivisionBy5.divisionBy5(new int[] {2,4,5,6,10,15,8}));
    }
}
