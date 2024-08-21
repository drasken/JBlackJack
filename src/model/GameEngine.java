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


    private GameEngine(int npcNum, String humanName) {
        // TODO: WRITE THE CONSTRUCTOR
        this.gamers = new LinkedList<NpcGamer>();
        createNpc(npcNum);
        this.humanPlayer = HumanGamer.getInstance(humanName);
        this.croupier = Croupier.getInstance();

    }
    public static GameEngine getInstance(int npcNum, String humenName) {
        if (instance == null){
            return new GameEngine(npcNum, humenName);
        }
        return instance;
    }

    /*
    TODO: Here a random list of methods to implement
    - Add players: need to add players to the game. One is always a human player: DONE
    - Need to represent the Coupier player, here or as a subclass of NPC Player: DONE
    - Play with each player when is its turn. At the end play with Croupier as last player.
    - At the end confront each player's points with the croupiers and pay/take money to players
    - Start another turn with only the player that still have money

     */

    /**
     * This method is the public method used to initialize a game
     * @param npcNum
     */
    public void createNpc (int npcNum){
        for (int i = 1; i <= npcNum; i++) {
            NpcGamer aiGamer = new NpcGamer("Player " + i);
            gamers.add(aiGamer);
        }
    }

    /**
     * This method is used by a Gamer class to call for card when is its turn
     * @param gamerPlaying
     * @param croupier
     */
    public void playCall(Gamer gamerPlaying, Croupier croupier){
        gamerPlaying.addCardToFirstHand(croupier.serveCard());
    }

    public void playTurn(MakeBet gamerPlaying, Croupier croupier){
        //TODO implement method
        int betMoney = gamerPlaying.makeBet();
        //fa un ciclo per il turno
        boolean isInTurn = true;
        while (isInTurn){
            switch (gamerPlaying)
        }
    }


    //all these mothods are for thesting
    //TODO: Delete when games works
    public void printHuman(){
        System.out.println(humanPlayer);
    }

    public void printCroupier(){
        System.out.println(croupier);
    }

    public void printNpc(){
        for (NpcGamer aiGamer : gamers) {
            System.out.println(aiGamer);
        }
    }


    public static void main (String [] args){
        //GameEngine gameEngine = new GameEngine();
        GameEngine gameInstance = GameEngine.getInstance(2, "ProvaNome");
        gameInstance.printNpc();
        gameInstance.printCroupier();
        gameInstance.printHuman();
        
        //Prova se scambiano carte
        gameInstance.playCall(gameInstance.humanPlayer, gameInstance.croupier);
        gameInstance.playCall(gameInstance.gamers.get(1), gameInstance.croupier);
        gameInstance.printNpc();
        gameInstance.printHuman(); // OK, funziona

        //Prova scommessa
        int scommessa = gameInstance.gamers.getFirst().makeBet();
        System.out.println("Ha scommesso :" + scommessa);
        //TODO Old, to delete
        /*
        gameEngine.initGame(2);
        for(NpcGamer gam:instance.gamers){
            System.out.println(gam);
        }
        System.out.println(gameEngine.humanPlayer);
        System.out.println(gameEngine.croupier);
        */
    }

}
