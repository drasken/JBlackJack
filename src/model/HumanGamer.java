package model;

/**
 * Class that represents the human player of each game.
 * Implemented with Singleton Pattern because the game is a solitaire
 */
public class HumanGamer  extends Gamer {
    // TODO Setter for importing avatar,money and old scores if existing gamer
    // Use Singleton pattern. One player at a time
    static private HumanGamer instance;
    private int money = 1000;
    private String avatar;
    private int games;
    private int losses;

    private HumanGamer (String name){
        super(name);
    }
    public static HumanGamer getInstance(){
        if(instance == null){
            instance = new HumanGamer("Human");
        }
        return instance;
    }
    //TODO implement call method
    @Override
    public boolean callCard() {
        return false;
    }
}
