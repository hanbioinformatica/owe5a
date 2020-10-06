package objectvoorbeeld;

public class Student {

    private String naam;  //instance var
    private int leeftijd; //instance var
    static int minLeeftijd = 18; //class var - om bier te mogen drinken

    //Constructor
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
        if (lt<45) {
            leeftijd=lt;
        } else {
            System.out.println("Leeftijd past niet bij een student");
        }
    }

    public boolean magBierDrinken(){
        return leeftijd>=minLeeftijd;
    }

    public String toString(){
        return "Naam "+naam+" is "+leeftijd+" mag bier drinken "+magBierDrinken();
    }

}
