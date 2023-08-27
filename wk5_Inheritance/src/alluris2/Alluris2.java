package alluris2;

public class Alluris2 {
    public static void main(String[] args) {
        Beoordeling b1 = new Beoordeling();
        b1.setVak("Informatica Bi5a");
        try {
            b1.setCijfer(7);
        } catch (GeenGoedCijfer e) {
            System.out.println("");
        }
        b1.setSc(Score.VOLDOENDE);



        Beoordeling b2 = new Beoordeling();
        b2.setVak("Biologie Bi5a");
        //b2.setCijfer(997);
        System.out.println(b2.getCijfer());

        

    }
}
