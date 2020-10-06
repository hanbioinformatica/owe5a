public class StringDemo {

    public static void main(String[] args) {
        String s1 = new String("Hello");  // normale declaratie en initialisatie van een Object
        String s2 = "Hello";  // Verkorte schrijfwijze speciaal voor een String Object

        System.out.println("Een \" en \n een tab\ttab");
        try {
            System.out.println(s1.charAt(5));
        }
        catch (StringIndexOutOfBoundsException e) {
                System.out.println("Lezen buiten bereik van de String");
            }

    }
}
