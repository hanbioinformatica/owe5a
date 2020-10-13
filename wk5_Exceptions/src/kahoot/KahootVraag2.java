package kahoot;



public class KahootVraag2 {

    public static final String VALIDAA = "ARNDCQEGHILKMFPSTWYV";

    public static void checkAminozuur(char aa) throws NoValidAA {
        if (!VALIDAA.contains(Character.toString(aa))) {
            throw new NoValidAA(aa);
        }
    }

    public static void peptideChecker(String aaSequence) {
        try {
            for (int i = 0; i < aaSequence.length(); i++) {
                checkAminozuur(aaSequence.charAt(i));
            }
        } catch (NoValidAA ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        //peptideChecker("GTA5");
//        peptideChecker("GTAV");
//        peptideChecker("GTAZ");
//        peptideChecker("GTAZY5");
        peptideChecker(null);




    }
}

class NoValidAA extends Exception {

    char wrongAA;

    NoValidAA() {
        super();
    }

    NoValidAA(char c) {
        super();
        wrongAA = c;
    }

    @Override
    public String getMessage() {
        return "Niet een juist aminozuur: "+wrongAA;
    }


}

