package model;

import java.util.LinkedList;
import java.util.Observable;

public class GameManager extends Observable {

    private static GameManager instance;
    private Croupier croupier = Croupier.getInstance();
    private HumanGamer human;
    private LinkedList <NpcGamer> npcGamers;
    private boolean gameRunning = false;


    private GameManager(int npcs, String humanName) {
        this.npcGamers = new LinkedList<NpcGamer>();
        createNpcGamers(npcs);
        this.human = HumanGamer.getInstance(humanName);
        this.gameRunning = true;

    }

    public static GameManager getInstance(int npcs, String humanName) {
        if (instance == null) {
            instance = new GameManager(npcs, humanName);
        }
        return instance;
    }

    private void createNpcGamers (int numNpcs){
        for (int i = 1; i <= numNpcs; i++) {
            npcGamers.add(new NpcGamer("Player " + i));
        }
    }

    //TODO: Implement startGame() and startRound()
    public void startGame(){
        while (gameRunning) {
            startRound();
        }
    }

    private void startRound(){

    }


    @Override
    public String toString() {
        return "GameManager{" +
                "croupier=" + croupier + "\n" +
                ", human=" + human + "\n" +
                ", npcGamers=" + npcGamers + "\n" +
                '}';
    }

    public static void main (String[] args) {
        GameManager testGame = GameManager.getInstance(3, "Rudy");

        System.out.println(testGame);

    }
}
