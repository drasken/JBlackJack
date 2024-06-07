package model;

import java.util.LinkedList;

public class Deck {
    /**
     * The Class representing a Dek
     */
    public LinkedList <Card> cards = new LinkedList<Card>();

    public Deck() {
        for (Card.Segno segno : Card.Segno.values()) {
            for (Card.Valore valore : Card.Valore.values()) {
                if (valore != Card.Valore.JOLLY) {
                    cards.add(new Card(segno, valore));
                }
            }
        }
        cards.add(new Card(null, Card.Valore.JOLLY));
        cards.add(new Card(null, Card.Valore.JOLLY));


    }

    @Override
    public String toString() {
        return "Deck [cards= nel mazzo ci sono " + cards.size() + " carte]";
    }

    public void Discard(){
        /**
         * Method used to serv first card from the top of the Deck
         */
        cards.removeFirst();
    }

}


