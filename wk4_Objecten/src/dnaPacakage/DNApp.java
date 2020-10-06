package dnaPacakage;

public class DNApp {

    public static void main(String[] args) {
        DNA d1 = new DNA("ATUUGGA");
        System.out.println(d1.getSeq());
        d1.setSeq("UGCUUG");
    }
}
