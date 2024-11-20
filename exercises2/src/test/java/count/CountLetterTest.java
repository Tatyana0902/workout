package count;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class CountLetterTest {
    @Test
    public void test1(){
        assertEquals(0, Count.countLetter(""));
    }
    @Test
    public void test2(){
        assertEquals(1,Count.countLetter("abc"));
    }
   @Test
    public void test3(){
        assertEquals(3,Count.countLetter("abcaabbc"));
   }

}
