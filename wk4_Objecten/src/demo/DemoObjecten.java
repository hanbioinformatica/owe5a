package demo;

public class DemoObjecten {

    static int gl_int = 7;

    public static void main(String[] args) {
        gl_int = increase(10);
        float ret_float = increase(7.3f);
        System.out.println(ret_float);
        int ret_int2 = increase(5);
        System.out.println(ret_int2);
        int ret_int3 = increase(7, 5);
        System.out.println(ret_int3);

    }

    public static int increase (int var){
        return ++var;
    }

    public static int increase (int var, int plus){
        return var+plus;
    }

    public static float increase (float var){
        return ++var;
    }

}
