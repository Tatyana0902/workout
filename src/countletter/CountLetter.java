package countletter;

public class CountLetter {
    public static int countLetter(String s, char b) {
        if (s.isEmpty()) {
            return 0;
        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (b == s.charAt(i)) {
                c++;
            }

        }

        return c;
    }
}
