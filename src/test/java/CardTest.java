import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    PlayingCard card;
    PlayingCard card2;

    @Before
    public void before() {
        card = new PlayingCard(Suit.HEARTS, Rank.ACE);
        card2 = new PlayingCard(Suit.DIAMONDS, Rank.SEVEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetCardRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void canGetTheValueOfARank() {
        assertEquals(1, card.getRankValue());
    }


}

