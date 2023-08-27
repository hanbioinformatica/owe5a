package alluris2;

public class Beoordeling {

    private int cijfer;

    public Score getSc() {
        return sc;
    }

    public void setSc(Score sc) {
        this.sc = sc;
    }

    private Score sc;





    public void setVak(String vak) {
        this.vak = vak;
    }

    private String vak;

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) throws GeenGoedCijfer {
        if (cijfer>10){
          throw new GeenGoedCijfer();
        }
        else {
        this.cijfer = cijfer;}
    }
}

class GeenGoedCijfer extends Exception{

    //Constructor
    GeenGoedCijfer(){
        super();
    }

    //Constructor overloaded
    GeenGoedCijfer(String message){
        super(message);
    }

}