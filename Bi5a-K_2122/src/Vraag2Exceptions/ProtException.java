/**
 *
 * @author Martijn van der Bruggen (c) Hogeschool van Arnhem en Nijmegen
 *
 */
public class ProtException {

    public static int c;

    public static void probeer(int getal) {
        try{
            String tekst = "01A";
            char c = tekst.charAt(getal);
            int i = Integer.parseInt(Character.toString(c));
            System.out.println(2/i);
        }
        catch (NumberFormatException e){
            System.out.println("Fout getal");
        }
        catch (ArithmeticException e){  // bij deling door 0
            System.out.println("Deling door 0");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Lezen buiten bereik");
        }

    }

    public static void main(String[] args) {
        probeer(0);
//        probeer(1);
//        probeer(2);
//        probeer(3);
//        probeer(-1);

    }
}
