package model;

public class Croupier extends Gamer {
    static private Croupier instance;

    private Croupier(String name) {
        super(name);
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
                '}';
    }
}
