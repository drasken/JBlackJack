package model;

import java.util.LinkedList;

public class NpcGamer extends Gamer {
    int money = 1000;

    public NpcGamer(String name) {
        super(name);
        this.first_hand = new Deck();
        //TODO implement
    }

    //TODO implement method
    @Override
    public boolean callCard() {
        return false;
    }

    @Override
    public String toString() {
        return "NpcGamer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", cards " + getFirst_hand() +
                '}';
    }
}
