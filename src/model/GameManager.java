package model;

import java.util.LinkedList;
import java.util.Observable;

public class GameManager extends Observable {

    private static GameManager instance;
    private Croupier croupier = Croupier.getInstance();
    private HumanGamer human;
    private LinkedList <NpcGamer> npcGamers;


    private GameManager() {

    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void createNpcGamers (int numNpcs){
        for (int i = 1; i <= numNpcs; i++) {
            npcGamers.add(new NpcGamer("Player " + i));
        }
    }

}
