package model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class representing a Dek. Classic 52 cards deck.
 */
public class Deck {

    public LinkedList <Card> cards = new LinkedList<Card>();

    public Deck() {
        for (Card.Segno segno : Card.Segno.values()) {
            for (Card.Valore valore : Card.Valore.values()) {
                    cards.add(new Card(segno, valore));
                }
            }
        this.shuffleCards();
    }

    /**
     * Overloaded constructor to build a deck repeated a number num of times.
     *
     * @param num:  number of standard 54 cards decks we want to build into our main Deck
     */
    public Deck (int num){

        for (int i = 0; i < num; i++) {
            for (Card.Segno segno : Card.Segno.values()) {
                for (Card.Valore valore : Card.Valore.values()) {
                    cards.add(new Card(segno, valore));
                    }
                }
            }
        this.shuffleCards();
    }


    @Override
    public String toString() {
        return "Deck [cards= nel mazzo ci sono " + cards.size() + " carte]";
    }

    /**
     * Serves first card from the top of the Deck. Return the Card served and remove it from the Deck.
     */
    public Card Serve(){

        return cards.removeFirst();
    }

    /**
     * Shuffle the Deck to put the Card in a random position.
     */
    public void shuffleCards(){

        //TODO: IMPLEMENTT IT
        Collections.shuffle(cards);
    }

    public static void main (String[] args){

        Deck deck = new Deck(3);
        System.out.println(deck.toString()); //OK

//        for (Card car: deck.cards){
//            System.out.println(car.toString());
//        }

        Card test = deck.Serve();
        System.out.println("Prova di metodo: " + test.toString()); // OK
        System.out.println(deck.toString()); //OK

    }

}


