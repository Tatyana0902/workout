package palindrom;

import org.junit.Test;
import polindrom.Palindrom;

import static org.junit.Assert.*;

public class PalindromTest {
    @Test
    public void test1() {
        assertFalse(Palindrom.isPalindrom(""));
    }
    @Test
    public void test2(){
        assertFalse(Palindrom.isPalindrom("abc"));
    }
    @Test
    public void test3(){
        assertTrue(Palindrom.isPalindrom("aabaa"));
    }
}

