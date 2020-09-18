public class Demo {
    public static void main(String[] args) {
        //(1) for loop
        //   init; term; incr
        System.out.println("for");
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        // (2) while
        System.out.println("while");
        int j=0;
        while (j<10){
            System.out.println(j);
            j++;
        }
        System.out.println("do-while");
        // (3) do - while
        int k=0;
        do {
            System.out.println(k);
            k++;
        } while (k<10);

    }
}
