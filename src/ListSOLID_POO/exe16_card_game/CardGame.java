package ListSOLID_POO.exe16_card_game;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private CardPack deck;
    private List<Player> players;

    public CardGame() {
        this.deck = new CardPack();
        this.players = new ArrayList<>();
    }

    public void addPlayer(String name) {
        if (deck.haveCards()) {
            List<Card> hand = deck.dealCards(5);
            players.add(new Player(name, hand));
        } else {
            System.out.println("Not enough cards to add more players.");
        }
    }

    public void startGame() {
        deck.shuffle();
        System.out.println("The game has started!");
        for (Player player : players) {
            System.out.println(player.getName() + " received their cards: " + player.getHand());
        }
    }

    public void makeMove(String playerName, int cardIndex) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                Card playedCard = player.playCard(cardIndex);
                if (playedCard != null) {
                    System.out.println(playerName + " played " + playedCard);
                }
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void showPlayerCards(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                System.out.println(playerName + " has the cards: " + player.getHand());
                return;
            }
        }
        System.out.println("Player not found.");
    }
}
