import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<>();
    }

    public int getSize() {
        return this.deckOfCards.size();
    }

    public void addCard(PlayingCard card) {
        this.deckOfCards.add(card);
    }

    public void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank: Rank.values()) {
                PlayingCard newCard = new PlayingCard(suit, rank);
                addCard(newCard);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(this.deckOfCards);
    }

    public PlayingCard dealCard() {
        return this.deckOfCards.remove(0);
    }
}
