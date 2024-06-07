package model;

public abstract class Player {
    /**
     * Player is the abstract class representing each possible paleyer in a game.
     *
     * @param: name. The name that identify the player
     * @param: money. The money that the player has at the moment
     */

    public String name;
    public int money;
    public Deck first_hand;
    public Deck second_hand; //Hand used when splitting the game

    public Player(String name, int money){

        this.money = money;
        this.name = name;
    }

    @Override
    public String toString(){
        return "The name is : " + this.name;
    }

}

