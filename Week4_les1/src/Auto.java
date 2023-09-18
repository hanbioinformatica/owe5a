public class Auto {
    String kleur;
     String eigenaar;
    private int snelheid;

    void setSnelheid(int i){
        if (i>130){
            System.out.println("Dat mag niet, limiet op 130");
            snelheid = 130;
        } else {
        snelheid = i;
        }
    }

    int getSnelheid() {
        return snelheid;
    }

    void printAuto(){
        System.out.println(" Auto van "+eigenaar+" kleur "+kleur + " met een snelheid "+snelheid);
    }

}
