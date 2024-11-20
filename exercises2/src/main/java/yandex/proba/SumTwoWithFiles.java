package yandex.proba;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SumTwoWithFiles {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("input.txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        Files.writeString(Path.of("output.txt"), String.valueOf(a + b));
    }
}
