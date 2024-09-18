package model;

import java.util.LinkedList;

public class ModelManager {

    private static ModelManager instance;
    private HumanGamer humanGamer;
    private Croupier croupier;
    private LinkedList <NpcGamer> npcGamers;

    private ModelManager() {
    //TODO initialize all classes needed for the mage
        //
    }

    public static ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }
        return instance;
    }


}
