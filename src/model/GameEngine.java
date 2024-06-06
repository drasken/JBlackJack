package model;

public class GameEngine {
    /**
     * This class following the exemple of the various chess engine this class will give the API to the underlying game logic.
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

}
