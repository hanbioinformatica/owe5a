package dnaPacakage;

/**
 * Class om te werken met seqs
 */
public class
DNA {
    private String seq;

    public String getSeq() {
        return seq;
    }

    /**
     * Methode voor het initieel zetten van een sequentie
     * @param seq dit is een String die bestaat uit ATGC
     * @throws WrongNT een exception op het moment dat ...
     */
    public void setSeq(String seq) throws WrongNT {
        if (seq.matches("^[ATGC]*$")) {
            this.seq = seq;
        } else {
            throw new WrongNT();
        }
    }



}

