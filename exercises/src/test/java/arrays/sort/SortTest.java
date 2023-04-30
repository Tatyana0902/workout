package arrays.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void testSort() {
        int[] a = new int[]{1};
        Sort.sort(a);
        assertArrayEquals(new int[]{1}, a);
    }

    @Test
    public void testSort1() {
        int[] a = new int[]{1, 3, 2, 4};
        Sort.sort(a);
        assertArrayEquals(new int[]{1, 2, 3, 4}, a);
    }
}