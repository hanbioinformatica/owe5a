/** Martijn van der Bruggen/Hogeschool van Arnhem en Nijmegen
 * d.d. december 2019 Alle code is compileerbaar en uitvoerbaar */

public class DNAapp {

    public static void main(String[] args) {
        DNA dna1 = new DNA();
        DNA dna2 = new DNA("GGCC");
        DNA dna3 = new DNA("AATT");
        DNA dna4 = new DNA("GGCC");
        String dna5 = new String("AATT");

        System.out.print("1.");
        System.out.println(DNA.getAantal());
        System.out.print("2.");
        System.out.println(dna1);
        System.out.print("3.");
        System.out.println(dna4.toString());
        System.out.print("4.");
        System.out.println(dna2.getLength() == dna5.length());  //primitives dan mag == wel
        System.out.print("5.");
        System.out.println(dna2.getSequentie() == dna5);  // objecten (strings) == mag niet
        System.out.print("6.");
        System.out.println(dna3.getSequentie().equals(dna3.sequentie));
        dna1.setSequentie(dna2.sequentie.toLowerCase());
        System.out.print("7.");
        System.out.println(dna1.equals(dna2));
        System.out.print("8.");
        dna1 = new DNA(dna5);
        System.out.println(dna1.getSequentie());
        System.out.print("9.");
        dna1.setSequentie("ATG");
        System.out.println(dna1.getSequentie());
        System.out.print("10.");
        System.out.println(dna2.sequentie.replace('G', 'x'));
        System.out.print("11.");
        int t = 0;
        System.out.println(t++);
        System.out.print("12.");
        System.out.println((1==1)||(2==1));
        System.out.print("13.");
        int a = 1, b = 2, c = 3;
        if (++a == b++ && ++b == c++) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        System.out.print("14.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                new DNA();
            }
        }
        System.out.println(dna1.getAantal());

        System.out.print("15.");
        int teller = 10;
        do {
            teller++;
        } while (teller < 0);
        System.out.println(teller);
    }
}

class DNA extends Object {

    private static int aantal=0;
    public String sequentie;

    public DNA() {
        aantal++;
    }

    public DNA (String seq) {
        sequentie = seq;
        aantal++;
    }
    public static int getAantal() {
        return aantal;
    }

    public String getSequentie() {
        return sequentie;
    }

    public void setSequentie(String sequentie) {
        this.sequentie = sequentie;
    }

    public int getLength(){
        return sequentie.length();
    }
    @Override
    public String toString (){
        return "DNA: "+sequentie;
    }
}
