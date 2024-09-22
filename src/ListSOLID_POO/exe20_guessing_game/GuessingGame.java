package ListSOLID_POO.exe20_guessing_game;

import java.util.Random;

public class GuessingGame {
    private int secretNumber;
    private int attempts;

    public GuessingGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        attempts = 0;
    }

    public String makeGuess(int guess) {
        attempts++;
        if (guess == secretNumber) {
            return "Congratulations, you guessed the number in " + attempts + " attempts";
        } else if (guess < secretNumber) {
            return "The number is high than " + guess + " try again.";
        } else {
            return "The number is low than " + guess + " try again.";
        }
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
