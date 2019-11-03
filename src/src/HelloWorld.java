public class HelloWorld {

    public static void main(String[] args) {
        String s1 = "ATGGAGCACCATGGA";
        boolean b = s1.matches("[ATGC]*");
        System.out.println(b);
    }
}
