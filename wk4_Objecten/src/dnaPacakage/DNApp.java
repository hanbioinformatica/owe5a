package dnaPacakage;

public class DNApp {

    public static void main(String[] args) {
        DNA d1 = new DNA();
        try {
            d1.setSeq("ATGGACCACA");
        } catch (WrongNT e) {
            System.out.println("Foute NT");
        }
        System.out.println(d1.getSeq());

    }
}
