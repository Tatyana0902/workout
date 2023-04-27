package minmax;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MinMaxTest {

    @Test
    public void test1(){
        assertArrayEquals(new int[][]{{0,2},{2,5},{3,8}},MinMax.minMax(new int[][]{{0,1,2},{4,2,5},{8,6,3}}));
    }
}


