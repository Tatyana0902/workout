package brackets;

public class Brackets {

    public static void main(String[] args) {
        String s = "(()())";

        int c = 0;
        int d = 0;

        for(int i = 0; i< s.length();i++){
            if (s.charAt(i) == '('){
                c++;
            } else if (s.charAt(i) == ')'){
                d++;
            }
            if (d <= c){
                if  (i == s.length() - 1){
                    if (c == d){
                        System.out.println("верно");
                        return;
                    }else{
                        System.out.println("неверно");
                        return;
                    }
                }
            }else{
                System.out.println("неверно");
                return;
            }

        }
        //
    }
}
