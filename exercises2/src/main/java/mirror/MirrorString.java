package mirror;

import java.util.Arrays;

public class MirrorString {
    public static String mirror(String s) {
//
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char c = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = c;
        }
        String s1 = new String(array);
        return s1;
    }
}
