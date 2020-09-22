public class Overloading {

    public static void main(String[] args) {
        System.out.println(increase(7));
        System.out.println(increase(10, 8));
    }

    private static int increase (int number1){
        return number1+1;
    }

    private static int increase (int number1, int number2){
        return number1+number2;
    }

}
