package model;

public class Card {

    boolean visible;

    /**
     * Enum used to represent a Card's sign
     */
    public enum Segno {CUORI,QUADRI,FIORI,PICCHE}

    /**
     * Enum used to represent a Card's value
     */
    public enum Valore{ASSO,DUE,TRE,QUATTRO,CINQUE,SEI,SETTE,OTTO,NOVE,DIECI,FANTE,DONNA,RE}

    private Segno segno;
    private Valore valore;

    /**
     * Costruttore per la classe Card, necessita i seguenti parametri
     * @param segno
     * @param valore
     */
    public Card(Segno segno, Valore valore) {
        this.segno = segno;
        this.valore = valore;
    }

    public Segno getSegno() {
        return segno;
    }

    public Valore getValore() {
        return valore;
    }

    public void revealCard() {
        if (this.visible==false) this.visible = true;
    }

    // TODO: Override toString() method to print card details
    @Override
    public String toString() {
//        if (valore == Valore.JOLLY) {
//            return "Jolly";
//        } else {
//            return valore + " di " + segno;
//        }
        return valore + " di " + segno;
    }

}
