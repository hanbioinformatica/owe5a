public class DemoApp {

    public static void main(String[] args) {
        //1
        int i = 1;
        System.out.println(++i);
        //2
        i = 1;
        System.out.println(i == i++);
        //3
        i = 1;
        System.out.println(++i == --i);
        //4
        i = 1;
        if (i == 0 && i++ == i++) {
            i++;
        }
        i = 1;
        System.out.println(i);
        //5
        i = 1;
        if (i == 0 || i++ == i++) {
            i++;
        }

        //6
        i = 1;
        switch (i) {
            case 1:
                i++;
            case 2:
                i++;
            default:
                i++;
        }
        System.out.println(i);
        //7
        String s1 = new String("Hello");
        System.out.println(s1 == "Hello");
        //8
        int a = 0;
        for (int j = 0; j < 10; j++) {
            a++;
        }
        System.out.println(a);
        //9
        a = 10;
        while (a < 10) {
            a++;
        }
        System.out.println(a);
        //10
        a = 10;
        do {
            a++;
        } while (a < 10);
        System.out.println(a);
        //11
        a = 1;
        int c = a != 2 ? 3 : 4;
        System.out.println(c);
        //12
        a = 10;
        System.out.println((a > 5) ? "hello" : "World");


    }
}
