package objectvoorbeeld;

public class Student {

    private String naam;  //instance var
    private int leeftijd; //instance var
    static int minLeeftijd = 16; //class var

    public Student(String naam, int leeftijd) {  // constructor - initalisator van een object
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd (int lt){
        if (lt>minLeeftijd&&lt<45) {
            leeftijd=lt;
        } else {
            System.out.println("Leeftijd past niet bij een student");
        }
    }


}
