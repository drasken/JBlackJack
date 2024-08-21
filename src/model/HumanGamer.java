package model;

/**
 * Class that represents the human player of each game.
 * Implemented with Singleton Pattern because the game is a solitaire
 */
public class HumanGamer  extends Gamer implements MakeBet{
    // TODO Setter for importing avatar,money and old scores if existing gamer
    // Use Singleton pattern. One player at a time
    static private HumanGamer instance;
    private int money = 1000;
    private int moneyToBet;
    private String avatar;
    private int games;
    private int losses;


    private HumanGamer (String name){
        super(name);
        this.first_hand = new Deck();

    }
    public static HumanGamer getInstance(String humanName){
        if(instance == null){
            instance = new HumanGamer(humanName);
        }
        return instance;
    }
    //TODO implement call method
    @Override
    public boolean callCard() {
        return false;
    }

    @Override
    public String toString() {
        return "HumanGamer{" +
                "name='" + name + '\'' +
                ", Cards " + first_hand +
                ", money=" + money +
                '}';
    }

    public void setMoneyToBet(int moneyToBet) {
        this.moneyToBet = moneyToBet;
    }

    @Override
    public int makeBet(){
        this.money -= moneyToBet;
        return moneyToBet;
    }
}
