package bubbleSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void test1(){
        assertArrayEquals(new int[]{1,2,3}, BubbleSort.bubbleSort(new int[]{3,2,1}));
    }
}
