package Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Card.Card;
import Deck.Deck;

public class Player implements Iterable<Card> {
    private List<Card> cards;
    private boolean isHeader;

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    public boolean getHeader() {
        return this.isHeader;
    }

    public Player(Deck deck, boolean isHeader) {
        this.isHeader = isHeader;
        this.cards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cards.add(deck.draw());
        }
        if (this.isHeader) {
            cards.add(deck.draw());
        }
    }

    public void showCards() {
        for (Card i : this) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public Card playCards(int index) {
        Card card = new Card(cards.get(index).getColor(), cards.get(index).getValue());
        cards.remove(index);
        return card;
    }
}
