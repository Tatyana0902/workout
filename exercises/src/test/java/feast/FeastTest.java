package feast;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FeastTest {
    @Test
    public void test1() {
        assertTrue(Feast.feast("great blue heron", "garlic nann"));
    }

    @Test
    public void test2() {
        assertFalse(Feast.feast("great blue hero", "garlic nann"));
    }

}
