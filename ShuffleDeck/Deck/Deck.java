package Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Card.Card;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        String[] color = new String[] { "♥", "♠", "♣", "♦" };
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 11; j++) {
                deck.add(new Card(color[i], "" + j));
            }
            deck.add(new Card(color[i], "A"));
            deck.add(new Card(color[i], "J"));
            deck.add(new Card(color[i], "Q"));
            deck.add(new Card(color[i], "K"));
        }
        deck.add(new Card("Red", "Big Joker"));
        deck.add(new Card("Black", "Small Joker"));
        Collections.shuffle(deck);
    }

    public Deck shuffleDeck(Deck deck) {
        Collections.shuffle((List<?>) deck);
    }
}
