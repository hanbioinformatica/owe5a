public class Overloading {

    public static void main(String[] args) {
        System.out.println(increase(7.1f));
        System.out.println(increase(10, 8));
        System.out.println(increase("Hello"));

        float f = (float)7;

        int i = 8;
        byte b = (byte)i;


    }

    private static int increase(int number1) {
        System.out.println("Met een param");
        return number1 + 1;
    }

    private static int increase(int number1, int number2) {
        System.out.println("Met twee");
        return number1 + number2;
    }

    private static float increase(float f) {
        System.out.println("Float");
        return (float) (f + 1.0);
    }

    private static String increase(String s) {
        return s.concat("World");
    }

    private boolean isGroterDan(int i) {
        if (i < 5) {
            return true;
        } else return false;

    }

}
