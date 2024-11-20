package prefix;

public class Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        int i = 0;
        char[] array = new char[strs[0].length()];
        for_1:
        for (; i < strs[0].length(); i++) {
            for (int n = 1; n < strs.length; n++) {
                if (strs[0].charAt(i) != strs[n].charAt(i)) {
                    break for_1;
                } else {
                    array[i] = strs[0].charAt(i);
                }
            }
        }
        return new String(array).substring(0, i);
    }
}

