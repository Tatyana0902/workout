package prefix;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrefixTest {
    @Test
    public void test1() {
        assertEquals("ab", Prefix.longestCommonPrefix(new String[]{"abcd", "abfg","abc"}));
    }

    @Test
    public void test2() {
        assertEquals("", Prefix.longestCommonPrefix(new String[]{"abcd", "vbfg", ""}));
    }

    @Test
    public void test3() {
        assertEquals("abcde", Prefix.longestCommonPrefix(new String[]{"abcdefghijkl", "abcdeghjfkjvhkjhv"}));
    }

    @Test
    public void test4() {
        assertEquals("", Prefix.longestCommonPrefix(new String[]{"", "abcfg"}));
    }

    @Test
    public void test5() {
        assertEquals("abcd", Prefix.longestCommonPrefix(new String[]{"abcd", "abcd"}));
    }
    @Test
    public void test6() {
        assertEquals("", Prefix.longestCommonPrefix(new String[]{"", "", "",""}));
    }
    @Test
    public void test7() {
        assertEquals("ab", Prefix.longestCommonPrefix(new String[]{"ab"}));
    }
}
