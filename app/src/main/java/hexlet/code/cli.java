package hexlet.code;

import java.util.Scanner;

public class cli {
    public static void nameUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        scanner.close();

    }
}
