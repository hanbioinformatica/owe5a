package logischeOperatoren;

public class Logicals {

    public static void main(String[] args) {
        int i = 7;
        int j = 5;
        if (i > 3 | j++ < 7) {
            System.out.println("Hello");
        } else {
            System.out.println("World");
        }
        System.out.println(j);

    }
}
