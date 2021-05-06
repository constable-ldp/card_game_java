import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {

    private Deck deck;
    private Dealer dealer;
    private Player player01;
    private Player player02;
    private Player player03;
    private Player player04;

    @Before
    public void setUp(){
        deck = new Deck();
        dealer = new Dealer();
        player01 = new Player("Luke");
        player02 = new Player("Piotr");
        player03 = new Player("John");
        player04 = new Player("James");
        deck.createDeck();
        deck.shuffleDeck();
//        dealer.addPlayer(player01);
//        dealer.addPlayer(player02);
//        dealer.addPlayer(player03);
//        dealer.addPlayer(player04);
//        dealer.dealCards(deck);
    }

    @Test
    public void playerHasCard(){
        assertEquals(1, player01.getHoldingCards());
        assertEquals(1, player02.getHoldingCards());
        assertEquals(1, player03.getHoldingCards());
        assertEquals(1, player04.getHoldingCards());
    }

    @Test
    public void canShowPlayerCard() {
        PlayingCard card01 = new PlayingCard(Suit.HEARTS, Rank.ACE);
        Player player05 = new Player("Test");
        player05.addCard(card01);
        assertEquals(card01, player05.showCard());
    }

    @Test
    public void canFindWinner() {
        PlayingCard card01 = new PlayingCard(Suit.HEARTS, Rank.ACE);
        PlayingCard card02 = new PlayingCard(Suit.DIAMONDS, Rank.TWO);
        player01.addCard(card01);
        player02.addCard(card02);
        dealer.addPlayer(player01);
        dealer.addPlayer(player02);
        assertEquals(player02.getName(), dealer.findWinner().getName());
    }
}
