package mirror;

import arrays.mirror.Mirror;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MirrorTest {
    @Test
    public void test1(){
        assertArrayEquals(new int[]{}, Mirror.mirror(new int[]{}));
    }
    @Test
    public void test2(){
        assertArrayEquals(new int[]{1}, Mirror.mirror(new int[]{1}));
    }
    @Test
    public void test3(){
        assertArrayEquals(new int[]{1,2}, Mirror.mirror(new int[]{2,1}));
    }
    @Test
    public void test4(){
        assertArrayEquals(new int[]{5,4,3,2,1}, Mirror.mirror(new int[]{1,2,3,4,5}));
    }
}

