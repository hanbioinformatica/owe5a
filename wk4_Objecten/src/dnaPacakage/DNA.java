package dnaPacakage;

public class DNA {
    private String seq;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) throws WrongNT {
        if (seq.matches("^[ATGC]*$")) {
            this.seq = seq;
        } else {
            throw new WrongNT();
        }
    }



}

