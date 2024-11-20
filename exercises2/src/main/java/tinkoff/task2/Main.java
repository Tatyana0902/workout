package tinkoff.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        StringBuilder sb = new StringBuilder();

        String[] split = s.split(",");
        for (String s1 : split) {
            String[] edges = s1.split("-");
            if (edges.length == 1) {
                sb.append(edges[0]);
            } else {
                int a = Integer.parseInt(edges[0]);
                int b = Integer.parseInt(edges[1]);
                for (int i = a; i <= b; i++) {
                    sb.append(i).append(" ");
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}


