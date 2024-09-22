package ListSOLID_POO.exe20_guessing_game;

import java.util.Scanner;

public class GameInput {

    private Scanner scanner;

    public GameInput() {
        scanner = new Scanner(System.in);
    }

    public int getUserGuess() {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
}
