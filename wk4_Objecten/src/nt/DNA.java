package nt;

public class DNA {

    private String seq;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        if (seq.matches("^[ATGC]*$")){
        this.seq = seq;}
        else {
            System.out.println("Fout!");
        }
    }

    public DNA(String seq) {
        this.setSeq(seq);
    }




}
