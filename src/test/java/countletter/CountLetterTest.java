package countletter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLetterTest {
    @Test
    public void test1(){
        assertEquals(0, CountLetter.countLetter("", 'A'));
    }

    @Test
    public void test2(){
        assertEquals(1, CountLetter.countLetter("AB", 'A'));
    }

    @Test
    public void test3(){
        assertEquals(3, CountLetter.countLetter("ABAA", 'A'));
    }
}
