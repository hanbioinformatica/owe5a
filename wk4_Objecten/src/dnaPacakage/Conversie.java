package dnaPacakage;

public class Conversie {

    public static int zetOmNaarInt (String s) throws NumberFormatException {
        float fl = Float.parseFloat(s);
        int ret = (int)fl;  // casting naar een ander type
        return ret;
    }


    public static void main(String[] args) {
        int i=0;
        try {
            i = zetOmNaarInt("1");
        } catch (NumberFormatException nfe){
            System.out.println("Dit is geen getal");
        } catch (Exception e){

        } finally {
            System.out.println("Altijd");
        }
        System.out.println(i);
    }


}
