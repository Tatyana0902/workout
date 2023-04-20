package index;

import java.util.ArrayList;
import java.util.List;

public class Index {
    public static int[] index(String s, char a) {
        if (s.isEmpty()) {
            return new int[]{};
        }
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (a == s.charAt(i)) {
                indexes.add(i);
            }
        }
        return indexes.stream().mapToInt(i -> i).toArray();
    }
}
