package model;

/**
 * Class that represents the human player of each game.
 * Implemented with Singleton Pattern because the game is a solitaire
 */
public class HumanPlayer  extends Player {
    // TODO Setter for importing avatar,money and old scores if existing gamer
    // Use Singleton pattern. One player at a time
    static private HumanPlayer instance;
    private int money;
    private String avatar;
    private int games;
    private int losses;
    private String name;

    private HumanPlayer (String name){
        super(name);
    }
    public static HumanPlayer getInstance(){
        if(instance == null){
            instance = new HumanPlayer("Human");
        }
        return instance;
    }


}
