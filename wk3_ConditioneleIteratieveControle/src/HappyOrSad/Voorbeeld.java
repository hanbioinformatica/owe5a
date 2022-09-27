/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyOrSad;

/**
 *
 * @author bgnmh
 */
public class Voorbeeld {

    public static void main(String[] args) {
        int i = 0;
        if (i == 0 && i++ == 0 && i < 0) {  // false en i = 1
            i++;
        } else if (i++ == 1 || ++i % 2 == 0) { //true en i = 2
            i++;  // i= 3
        }
        if (i > 4) {  // false
            i++;
        }
        i += 4; // i = 7
        System.out.println(i);
    }
}
