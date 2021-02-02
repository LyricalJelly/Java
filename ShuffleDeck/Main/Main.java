package ShuffleDeck.Main;

import ShuffleDeck.Deck.Deck;
import ShuffleDeck.Player.Player;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player = new Player(deck, false);
        Player autoPlayer = new Player(deck, true);
        player.showCards();
        autoPlayer.showCards();
    }
}
