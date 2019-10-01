public class PaardenRace {

    public static void main(String[] args) {
        Paard p1 = new Paard("Martijn");
        Paard p2 = new Paard("Henk");
        for (int i = 0; i < 100; i++) {
            p1.loop();
            p2.loop();
        }
    }
}
