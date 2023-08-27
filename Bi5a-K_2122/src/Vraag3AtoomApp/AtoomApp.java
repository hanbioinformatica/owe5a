public class AtoomApp {

    public static void main(String[] args) {
        Atoom a1 = new Atoom("Waterstof", 1.0079);
        Atoom a2 = new Atoom("Helium", 4.0026);
        Atoom a3 = new Atoom("Koolstof", 12.0107);
        Atoom a4 = new Atoom("Zuurstof", 15.9994);
        Atoom a5 = new Atoom("Zuurstof");
        Atoom a6 = new Atoom(15.9994);

        System.out.print("1.");
        System.out.println(a1.count);

        System.out.print("2.");
        System.out.println(Atoom.count);

        System.out.print("3.");
        System.out.println(a5);

        System.out.print("4.");
        System.out.println(a1.getMassa() > a2.getMassa());

        System.out.print("5.");
        System.out.println(a1.getMassa() == a5.getMassa());

        System.out.print("6.");
        System.out.println(a1 == a5);

        a1 = a5;
        System.out.print("7.");
        System.out.println(a1 == a5);

        System.out.print("8.");
        System.out.println(a4.equals(a6));

        System.out.print("9.");
        a1=a2;
        System.out.println(a1);

        System.out.print("10.");
        for (int i=0;i<10;i++) {new Atoom("Stikstof");}
        System.out.println(Atoom.count);

        System.out.print("11.");
        int a = 1, b = 2, c = 3;
        if (++a == b++ && b == c) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        System.out.print("12.");
        int d = 1, e = 2, f = 3;
        if (++d == ++e && e++ == f++) {
            System.out.println(e);
        } else {
            System.out.println(f);
        }
    }
}

class Atoom {

    public String naam = "";
    public static int count = 0;
    private double massa;

    Atoom(String n) {
        naam = n;
        count++;
    }

    Atoom(double m) {
        massa = m;
        count++;
    }

    Atoom(String n, double m) {
        naam = n;
        massa = m;
        count++;
    }

    public double getMassa() {
        return massa;
    }

    @Override
    public String toString() {
        return naam;
    }
}

