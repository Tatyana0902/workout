package substring;

public class Substring {
    public static int substring(String s, String p) {
        if (s.isEmpty()) {
            return 0;
        }
        if (p.isEmpty()) {
            return 0;
        }
        int c = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p.charAt(j)) {
                j++;
                if (j == p.length()) {
                    c++;
                    j = 0;
                }
            } else {
                j = 0;
            }
        }
        return c;
    }
}
