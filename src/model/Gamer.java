package model;

/**
 * Player is the abstract class representing each possible paleyer in a game.
 *
 * @param: name. The name that identify the player
 * @param: money. The money that the player has at the moment
 */
public abstract class Gamer {


    public String name;
    public Deck first_hand;
    public Deck second_hand; //Hand used when splitting the game

    public Gamer(String name){

        this.name = name;
    }

    @Override
    public String toString(){
        return "The name is : " + this.name;
    }

    public Deck getFirst_hand() {
        return first_hand;
    }

    public Deck getSecond_hand() {
        return second_hand;
    }

    public String getName() {
        return name;
    }

    public abstract boolean callCard();

    public void addCardToFirstHand(Card card) {
        first_hand.addCardToDeck(card);
    }

    //public abstract int makeBet();
}

