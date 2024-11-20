package count;

public class Count {
    public static int countLetter (String s){
        if (s.length() == 0){
            return 0;
        }
        int c = 0;
        for(int i =0; i < s.length(); i++){
            if (s.charAt(i) == 'a'){
                c++;
            }
        }
        return c;
    }
}
