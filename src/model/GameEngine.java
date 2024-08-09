package model;

import java.util.LinkedList;
import java.util.Observable;

/**
 * This class will expose the API of the underlying game logic.
 */

public class GameEngine extends Observable {

    private static GameEngine instance;
    private LinkedList <NpcGamer> gamers;
    private HumanGamer humanPlayer;
    private Croupier croupier;


    private GameEngine() {
        // TODO: WRITE THE CONSTRUCTOR
    }
    public static GameEngine getInstance() {
        if (instance == null){
            return new GameEngine();
        }
        return instance;
    }

    /*
    TODO: Here a random list of methods to implement
    - Add players: need to add players to the game. One is always a human player
    - Need to represent the Coupier player, here or as a subclass of NPC Player
    - Play with each player when is its turn. At the end play with Croupier as last player.
    - At the end confront each player's points with the croupiers and pay/take money to players
    - Start another turn with only the player that still have money

     */

    /**
     * This method is the public method used to initialize a game
     * @param npcNum
     */
    public void initGame(int npcNum){
        for (int i = 0; i < npcNum; i++) {
            NpcGamer aiGamer = new NpcGamer("Player " + i);
            gamers.add(aiGamer);
        }
        this.humanPlayer = HumanGamer.getInstance();
        this.croupier = Croupier.getInstance();

    }

    public static void main (String [] args){
        GameEngine gameEngine = new GameEngine();
        gameEngine.initGame(2);
        for(NpcGamer gam:instance.gamers){
            System.out.println(gam);
        }
        System.out.println(gameEngine.humanPlayer);
        System.out.println(gameEngine.croupier);
    }

}
