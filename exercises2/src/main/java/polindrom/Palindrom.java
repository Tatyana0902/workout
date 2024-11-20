package polindrom;



public class Palindrom {
    public static boolean isPalindrom(String s){
        if (s.isEmpty()){
            return false;
        };
        if (s.length() == 1){
            return false;
        }
        String s1;
        String s2 ;
        int a = (s.length()/2) - 1;
        int b = (s.length()/2) + 1;
        int c = s.length()/2;
        s1 = s.substring(0,s.length()/2);
        if (s.length() % 2 == 0){
            s2 = s.substring (c, s.length());
        } else {
            s2 = s.substring (b, s.length());
        }
        for (int i = 0; i < s.length()/2; i++ ){
            if (s1.charAt(i) != s2.charAt(s2.length() -i - 1)) {
                return false;
            }
        }
        return true;
    }
}
