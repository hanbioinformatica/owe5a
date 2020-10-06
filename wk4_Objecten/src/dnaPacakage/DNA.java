package dnaPacakage;

public class DNA {
    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        if (seq.matches("^[ATGC]*$")) {
            this.seq = seq;
        } else {
            System.out.println("Geen goede sequentie");
        }
    }

    //constructor
    public DNA(String seq) {
        setSeq(seq);
    }

    private String seq;
}
