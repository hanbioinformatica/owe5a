public class DemoExc {

    public static void main(String[] args) {
        int x = converteer("zeven");
        System.out.print("resultaat " + x);


    }


    public static int converteer(String s) throws NumberFormatException {

        int i = Integer.parseInt(s);

        return i;
    }

}
