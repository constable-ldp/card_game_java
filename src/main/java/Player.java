import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<PlayingCard> holdingCards;

    public Player (String name) {
        this.name = name;
        this.holdingCards = new ArrayList<>();
    }

    public void addCard(PlayingCard card) {
        this.holdingCards.add(card);
    }

    public int getHoldingCards() {
        return this.holdingCards.size();
    }

    public PlayingCard showCard() {
        return holdingCards.get(0);
    }

    public String getName() {
        return this.name;
    }
}
