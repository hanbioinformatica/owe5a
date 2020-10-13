/**
 * Martijn van der Bruggen/Hogeschool van Arnhem en Nijmegen
 * d.d. oktober 2019 Alle code is compileerbaar en uitvoerbaar
 */

public class DNAException {

    public static final String VALIDNT = "ATGC";
    static int teller = 1;

    public static void nucleotide(String getal) throws NumberFormatException {
        try {
            int i = Integer.parseInt(getal);
            char c = VALIDNT.charAt(i);
            int j = 1 / i;
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Index fout");
        } catch (NumberFormatException nfe) {
            System.out.println("Conversie fout");
        }
    }

    public static void probeer(String getal) {
        try {
            System.out.println(teller++);
            nucleotide(getal);
        } catch (Exception e) {
            System.out.println("Onbekende fout");
        }
    }

    public static void main(String args[]) {
        probeer("2");
        probeer("0");
        probeer("x");
        probeer("4");
        probeer("3");
    }

}
