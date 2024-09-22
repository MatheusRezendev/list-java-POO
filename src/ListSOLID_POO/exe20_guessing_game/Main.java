package ListSOLID_POO.exe20_guessing_game;

public class Main {
    public static void main(String[] args) {

        GuessingGame game = new GuessingGame();
        GameInput input = new GameInput();

        boolean guessedCorrectly = false;

        System.out.println("Start the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!guessedCorrectly) {
            int userGuess = input.getUserGuess();
            String result = game.makeGuess(userGuess);
            System.out.println(result);
            guessedCorrectly = userGuess == game.getSecretNumber();
        }

        input.close();

    }
}