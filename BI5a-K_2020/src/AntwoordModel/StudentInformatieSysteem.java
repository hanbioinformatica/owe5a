package AntwoordModel;

public class StudentInformatieSysteem {

    public static String data = "";

    public static String prints(String v, int l, int s) {
        String voornaam = v; // vul hier je eigen naam in
        int leeftijd = l;      // vul hier je eigen leeftijd in
        int studnr = s;        // vul hier je studentnummer in
        Student s1 = new Student(voornaam, leeftijd, studnr);
        Docent d1 = new Docent("Martijn", 27, "Informatica");
        Docent d2 = new Docent("Martijn", 42, "BioInformatica");
        data += "\n"+(" 1.");
        data +=(s1.getVoornaam());
        data += "\n"+(" 2.");
        data +=(Student.getAantal());
        data += "\n"+(" 3.");
        data +=(d1);
        data += "\n"+(" 4.");
        data +=(s1.getLeeftijd() == leeftijd);
        data += "\n"+(" 5.");
        data +=(d1 == d2);
        data += "\n"+(" 6.");
        data +=(d1.getVoornaam() == d2.getVoornaam());
        data += "\n"+(" 7.");
        data +=(d1.getLeeftijd() == d2.getLeeftijd());
        data += "\n"+(" 8.");
        data +=(s1.getCharFromName(2));
        data += "\n"+(" 9.");
        data +=(s1.getCharFromName(8));
        data += "\n"+("10.");
        data +=(s1.getStrFromStudentNr(5));
        data += "\n"+("11.");
        data +=(s1.getStrFromStudentNr(12));
        data += "\n"+("12.");
        data +=(s1.getNumFromStudNr(4));
        data += "\n"+("13.");
        Docent d3 = new Docent("Methusalem", 782, "Geschiedenis");
        data +=(d3.getLeeftijd());
        data += "\n"+("14.");
        Docent d4 = new Docent("Kirk", -700, "Astronomy");
        data +=(d4.getLeeftijd());
        data += "\n"+("15.");
        data +=(d3.getVakgebied());
        data += "\n"+("16.");
        Persoon p1 = s1;
        data +=(p1.getVoornaam());
        data += "\n"+("17.");
        for (int i = 0; i < voornaam.length(); i++) {
            new Student("Freek", 38, 238734);
        }
        data +=(Persoon.getAantal());
        data += "\n"+("18.");
        String tStr = "";
        for (int i = 0; i < voornaam.length(); i++) {
            tStr += s1.getCharFromName(2);
        }
        data +=(tStr);
        data += "\n"+("19.");
        s1.setLeeftijd(s1.getNumFromStudNr(2)+s1.getNumFromStudNr(3));
        data +=(s1.getLeeftijd());
        data += "\n"+("20.");
        data +=(d1.getVoornaam().equals(s1.getVoornaam())?"eind":"stop");
        return data;
    }
}


class Persoon {

    private static int aantal = 0;
    protected String voornaam;
    protected int leeftijd = 0;

    public Persoon(String voornaam, int leeftijd) {
        this.voornaam = voornaam;
        setLeeftijd(leeftijd);
        aantal++;
    }

    public static int getAantal() {
        return aantal;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        if (leeftijd < 0) {
            this.leeftijd = 0;
        } else if (leeftijd > 120) {
        } else {
            this.leeftijd = leeftijd;
        }
    }

    @Override
    public String toString() {
        return "Persoon " + voornaam;
    }
}

class Student extends Persoon {
    private int studnr = 0;

    public Student(String voornaam, int leeftijd, int studnr) {
        super(voornaam, leeftijd);
        this.studnr = studnr;
    }

    @Override
    public String toString() {
        return "Student " + voornaam;
    }

    public char getCharFromName(int positie) {
        try {
            return voornaam.charAt(positie);
        } catch (StringIndexOutOfBoundsException e) {
            return 'x';
        }
    }

    public String getStrFromStudentNr(int positie) throws NumberFormatException {
        String numStr;
        try {
            numStr = Integer.toString(studnr).substring(positie, positie + 1);
            int num = 2 / Integer.parseInt(numStr);
        } catch (ArithmeticException a) {  // deling door nul
            return "Divide by zero";
        } catch (Exception g) {
            return "Unknown";
        }
        return numStr;
    }

    public int getNumFromStudNr(int positie) {
        String tempStr = getStrFromStudentNr(positie);
        int tempInt = 0;
        try {
            tempInt = Integer.parseInt(tempStr);
        } catch (NumberFormatException e) { // foutieve conversie
            return -1;
        }
        return tempInt;
    }
}

class Docent extends Persoon {

    private final String vakgebied;

    public Docent(String voornaam, int leeftijd, String vakgebied) {
        super(voornaam, leeftijd);
        this.vakgebied = vakgebied;
    }

    public void setLeeftijd(int leeftijd) {
        if (leeftijd < 20) {
            this.leeftijd = 20;
        } else {
            super.setLeeftijd(leeftijd);
        }
    }

    public String getVakgebied() {
        return vakgebied;
    }

}