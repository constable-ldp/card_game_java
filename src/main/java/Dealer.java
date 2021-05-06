import java.util.ArrayList;

public class Dealer {

    private ArrayList<Player> players;
    private Player winner;

    public Dealer() {
        this.players = new ArrayList<>();
        this.winner = new Player(null);
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealCards(Deck deck) {
        for (Player player : this.players) {
            PlayingCard card = deck.dealCard();
            player.addCard(card);
        }
    }

    public Player findWinner() {
        for (Player player : this.players) {
            if (player == this.players.get(0)) {
                this.winner = player;
            } else {
                if (player.showCard().getRankValue() > this.winner.showCard().getRankValue()) {
                    this.winner = player;
                }
            }
        }
        return this.winner;
    }
}

// Rank.GetValues().Cast<int>().Max();
