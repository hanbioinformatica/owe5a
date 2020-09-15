package logischeOperatoren;

public class Increment {

    public static void main(String[] args) {
        int i = 7;
        System.out.println(++i); //prefix increment
        System.out.println(i++); //postfix increment
        System.out.println(i);
        System.out.println(--i); //prefix decrement
        System.out.println(i--); //postfix decrement
        System.out.println(i);
        System.out.println(i==i | ++i==++i);
        System.out.println(i);

    }
}
