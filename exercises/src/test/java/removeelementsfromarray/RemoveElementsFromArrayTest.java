package removeelementsfromarray;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementsFromArrayTest {
    @Test
    public void test1() {
        assertArrayEquals(new Object[]{}, RemoveElementsFromArray.removeElementsFromArray(new Object[]{}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new Object[]{"test"}, RemoveElementsFromArray.removeElementsFromArray(new Object[]{"test"}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new Object[]{1, 3, 5}, RemoveElementsFromArray.removeElementsFromArray(new Object[]{1, 2, 3, 4, 5, 6}));
    }
}
