package DNA;

public class DNA {

    private String sequentie;

    public String getSequentie() {
        return sequentie;
    }

    public void setSequentie(String sequentie) {
        if (sequentie.matches("^[ATGC]*$")) {
            this.sequentie = sequentie;
        } else {
            System.out.println("Error");
        }
    }

}
