package HongerigeWolf;

public class ComputerMuis extends Product{

    private boolean draadloos;
    
    public boolean isDraadloos() {
        return draadloos;
    }

    public void setPrijs(double prijs) {
        if (prijs > 4) {
            this.prijs = prijs;
        } else {this.prijs = 4;}
    }


}
