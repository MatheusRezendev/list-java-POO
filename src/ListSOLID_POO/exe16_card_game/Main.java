package ListSOLID_POO.exe16_card_game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardGame game = new CardGame();

        System.out.print("Enter the name of the first player: ");
        String player1 = scanner.nextLine();
        game.addPlayer(player1);

        System.out.print("Enter the name of the second player: ");
        String player2 = scanner.nextLine();
        game.addPlayer(player2);

        game.startGame();

        boolean playing = true;
        while (playing) {
            System.out.print("Enter the name of the player who will make a move (or 'exit' to quit): ");
            String playerName = scanner.nextLine();
            if (playerName.equalsIgnoreCase("exit")) {
                playing = false;
            } else {
                game.showPlayerCards(playerName);
                System.out.print("Choose the index of the card to play: ");
                int cardIndex = scanner.nextInt();
                scanner.nextLine();
                game.makeMove(playerName, cardIndex);
            }
        }

        scanner.close();
        System.out.println("Game over!");
    }
}