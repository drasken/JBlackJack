package model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

        this.shuffleCards();
    }

    public Deck (int num){

        /**
         * Overloaded constructor to build a deck repeated a number num of times.
         *
         * @param num:  number of standard 54 cards decks we want to build into our main Deck
         */
        for (int i = 0; i < num; i++) {
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
        this.shuffleCards();
    }

    @Override
    public String toString() {
        return "Deck [cards= nel mazzo ci sono " + cards.size() + " carte]";
    }

    public Card Serve(){
        /**
         * Method used to serv first card from the top of the Deck. Return the Card served and remove it from the Deck.
         */
        return cards.removeFirst();
    }

    public void shuffleCards(){
        /**
         * Shuffle the Deck to put the Card in a random position.
         */
        //TODO: IMPLEMENTT IT
        Collections.shuffle(cards);
    }

    public static void main (String[] args){

        Deck deck = new Deck(3);
        System.out.println(deck.toString()); //OK

        for (Card car: deck.cards){
            System.out.println(car.toString());
        }

        Card test = deck.Serve();
        System.out.println(test.toString()); // OK
    }

}


