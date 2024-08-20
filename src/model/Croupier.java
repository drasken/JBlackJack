package model;


public class Croupier extends Gamer {

    static private Croupier instance;


    private Croupier(String name) {
        super(name);
        this.first_hand = new Deck(4); //hard coded but enough for this number of players
    }

    public static Croupier getInstance() {
        if (instance == null) {
            instance = new Croupier("Croupier");
        }
        return instance;
    }

    @Override
    public boolean callCard() {
        return false; //TODO implements
    }

    @Override
    public String toString() {
        return "Croupier{" +
                "name='" + name + '\'' +
                ", first_hand=" + first_hand +
                '}';
    }

    public Card serveCard(){
        return first_hand.Serve();
    }

    public int makeBet(){
        return 0;
    }
}
