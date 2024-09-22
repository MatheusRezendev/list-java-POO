package ListSOLID_POO.exe16_card_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardPack {
    private List<Card> cards;

    public CardPack() {
        cards = new ArrayList<>();
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (String color : colors) {
            for (int value = 1; value <= 9; value++) {
                cards.add(new Card(color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("the cards were shuffled.");
    }

    public List<Card> dealCards(int qtd) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < qtd; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }

    public boolean haveCards() {
        return !cards.isEmpty();
    }
}
