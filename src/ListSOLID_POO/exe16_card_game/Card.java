package ListSOLID_POO.exe16_card_game;

public class Card {
    private String color;
    private int value;

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card [" + "color ='" + color + '\'' + ", value =" + value + ']';
    }
}
