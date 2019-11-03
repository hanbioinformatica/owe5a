public class DNAException {
    public static final String VALIDNT = "CATG";
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
//        try {
            System.out.print(teller++);
            System.out.print("..");
            nucleotide(getal);
//        } catch (Exception e) {
//            System.out.println("Onbekende fout");
//        } finally {
//            System.out.println("Finally");
//        }
    }
    public static void main(String args[]) {
        probeer("5");
        probeer("P");
        probeer("0");
        probeer("2");
        probeer("1");
    }
}