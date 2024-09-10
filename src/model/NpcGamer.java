package model;

import java.util.LinkedList;

public class NpcGamer extends Gamer implements MakeBet{
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

    public int makeBet(){
        if (this.money >= 50){
            int toBet = this.money;
            this.money = 0;
            return toBet;
        }
        int toBet = (int) this.money / 5;
        this.money -= toBet;
        return toBet;
    }

}
