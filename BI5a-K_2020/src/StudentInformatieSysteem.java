public class StudentInformatieSysteem {

    public static void main(String[] args) {
        String voornaam = "hj"; // vul hier je eigen naam in
        int leeftijd = 17;      // vul hier je eigen leeftijd in
        int studnr = 6234;        // vul hier je studentnummer in
        Student s1 = new Student(voornaam, leeftijd, studnr);
        Docent d1 = new Docent("Martijn", 27, "Informatica");
        Docent d2 = new Docent("Martijn", 42, "BioInformatica");
        System.out.print(" 1.");
        System.out.println(s1.getVoornaam());
        System.out.print(" 2.");
        System.out.println(Student.getAantal());
        System.out.print(" 3.");
        System.out.println(d1);
        System.out.print(" 4.");
        System.out.println(s1.getLeeftijd() == leeftijd);
        System.out.print(" 5.");
        System.out.println(d1 == d2);
        System.out.print(" 6.");
        System.out.println(d1.getVoornaam() == d2.getVoornaam());
        System.out.print(" 7.");
        System.out.println(d1.getLeeftijd() == d2.getLeeftijd());
        System.out.print(" 8.");
        System.out.println(s1.getCharFromName(2));
        System.out.print(" 9.");
        System.out.println(s1.getCharFromName(8));
        System.out.print("10.");
        System.out.println(s1.getStrFromStudentNr(5));
        System.out.print("11.");
        System.out.println(s1.getStrFromStudentNr(12));
        System.out.print("12.");
        System.out.println(s1.getNumFromStudNr(4));
        System.out.print("13.");
        Docent d3 = new Docent("Methusalem", 782, "Geschiedenis");
        System.out.println(d3.getLeeftijd());
        System.out.print("14.");
        Docent d4 = new Docent("Kirk", -700, "Astronomy");
        System.out.println(d4.getLeeftijd());
        System.out.print("15.");
        System.out.println(d3.getVakgebied());
        System.out.print("16.");
        Persoon p1 = s1;
        System.out.println(p1.getVoornaam());
        System.out.print("17.");
        for (int i = 0; i < voornaam.length(); i++) {
            new Student("Freek", 38, 238734);
        }
        System.out.println(Persoon.getAantal());
        System.out.print("18.");
        String tStr = "";
        for (int i = 0; i < voornaam.length(); i++) {
            tStr += s1.getCharFromName(2);
        }
        System.out.println(tStr);
        System.out.print("19.");
        s1.setLeeftijd(s1.getNumFromStudNr(2)+s1.getNumFromStudNr(3));
        System.out.println(s1.getLeeftijd());
        System.out.print("20.");
        System.out.println(d1.getVoornaam().equals(s1.getVoornaam())?"eind":"stop");
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