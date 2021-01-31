package Main;

import Card.Card;
import Deck.Deck;
import Player.Player;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player = new Player(deck, false);
        Player autoPlayer = new Player(deck, true);
        gameStart(player, autoPlayer);
    }

    private static boolean gameStart(Player player1, Player player2) {
        Player header = null;
        Player person = null;
        if (player1.getHeader()) {
            header = player1;
            person = player2;
        } else {
            header = player2;
            person = player1;
        }
        while (true) {
            Card card = header.playCards();

        }
    }
}
