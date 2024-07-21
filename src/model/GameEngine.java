package model;

import java.util.Observable;

public class GameEngine extends Observable {
    /**
     * This class will expose the API to the underlying game logic.
     */

    private static GameEngine instance;


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

}
