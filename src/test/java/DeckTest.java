import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;
    private PlayingCard card01;

    @Before
    public void setUp(){
        deck = new Deck();
        card01 = new PlayingCard(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canAddCard(){
        deck.addCard(card01);
        assertEquals(1, deck.getSize());
    }

    @Test
    public void canCreateDeck() {
        deck.createDeck();
        assertEquals(52, deck.getSize());
    }

    @Test
    public void canShuffleDeck() {
        Deck shuffledDeck = new Deck();
        deck.createDeck();
        shuffledDeck.createDeck();
        shuffledDeck.shuffleDeck();
        assertNotEquals(deck, shuffledDeck);
    }
}
