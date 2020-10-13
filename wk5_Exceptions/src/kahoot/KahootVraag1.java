package kahoot;

public class KahootVraag1 {

    public static final String VALIDAA = "ARNDCQEGHILKMFPSTWYV";

    public static String aminozuur(String getal) throws NumberFormatException {
        String ret = "C";
        try {
            int i = Integer.parseInt(getal);
            char c = VALIDAA.charAt(i);
            int j = 1 / i;
        } catch (StringIndexOutOfBoundsException sioobe) {
            ret = "A";
        } catch (NumberFormatException nfe) {
            ret = "B";
        }
        return ret;
    }

    public static void probeer(String getal) {

        try {
            System.out.println(aminozuur(getal));
        } catch (Exception e) {
            System.out.println("D");
        }
    }

    public static void main(String args[]) {
//        probeer("5");
        probeer("N");
//        probeer("22");
//        probeer("0");
//        probeer("20");
    }

}

