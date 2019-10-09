public class Applicatie {

    public static void main(String[] args) {
        for (Kleur kleur: Kleur.values()){
            System.out.println(kleur);
            System.out.println(kleur.getColor());

        }
    }
}
