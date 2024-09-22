package ListSOLID_POO.exe16_card_game;

import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index);
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Player [name='" + name + "', hand=" + hand + ']';
    }

}
