package Program;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random Number = new Random();
        int targetNumber = Number.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;

        System.out.println("Welcome the guessing game");

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = scanner.nextInt();
            guessCount++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess");
                continue;
            }

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses.");
                break;
            } else {
                switch (guessCount) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println((guess < targetNumber) ? "Too low. Try again." : "Too high. Try again.");
                        break;
                    default:
                        System.out.println("Getting closer! But still not there.");
                }
            }
        }

        scanner.close();
    }
}
