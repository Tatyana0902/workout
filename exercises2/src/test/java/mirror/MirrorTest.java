package mirror;

import factorial2.Factorial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MirrorTest {
    @Test
    public void test1(){
        assertEquals("abc", MirrorString.mirror("cba"));
    }
}
