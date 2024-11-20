package tinkoff.task3;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    /*
    Input:
    abacaba
    abc
    3

    Result: cab
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Set<Character> pwd = toCharSet(scan.next());
        int l = scan.nextInt();
        int c = 0;

        for1:
        for (int i = s.length() - 1; i >= 0; i--) {
            char x = s.charAt(i);
            if (pwd.contains(x)) {
                c++;
                if (c == l) {
                    String sub = s.substring(i, i + l);
                    Set<Character> subSymbols = toCharSet(sub);
                    for (Character p : pwd) {
                        if (!subSymbols.contains(p)) {
                            c--;
                            continue for1;
                        }
                    }
                    System.out.println(sub);
                    return;
                }
            } else {
                c = 0;
            }
        }
        System.out.println("-1");
    }

    private static Set<Character> toCharSet(String pwd) {
        return pwd.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toSet());
    }
}
