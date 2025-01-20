package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculate
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String userKeyboard = scanner.nextLine();
        choice(userKeyboard);
    }

    public static void choice(String userKeyboard) {
        switch (userKeyboard) {
            case "1":
                System.out.println("Your choice: 1");
                Cli.greetings();
                break;
            case "2":
                System.out.println("Your choice: 2");
                Even.runGameEven();
                break;
            case "3":
                System.out.println("Your choice: 3");
                Calc.run();
                break;
            case "4":
                System.out.println("Your choice: 4");
                GCD.runGCD();
                break;
            case "5":
                System.out.println("Your choice: 5");
                Progression.startGame();
                break;
            case "6":
                System.out.println("Your choice: 6");
                Prime.run();
                break;
            case "0":
                System.out.println("Exit was chosen");
                break;
            default:
                System.out.println("invalid command");
                break;
        }
    }
}
