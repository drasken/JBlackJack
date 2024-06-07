package model;

public abstract class Player {

    public String name;
    public Deck first_hand;
    public Deck second_hand;

    public Player(String name){

        this.name = name;
    }

    @Override
    public String toString(){
        return "The name is : " + this.name;
    }

}

