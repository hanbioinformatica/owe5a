/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyOrSad;

/**
 *
 * @author mart1nus
 */
public class vraag1 {

    public static void main(String[] args) {
        int i = 0;
        if (i == 0 && i++ == 0 && i < 0) {
            i++;
        } else if (i++ == 1 || ++i % 2 == 0) {
            i++;
        }
        if (i > 4) {
            i++;
        }
        i += 4;
        System.out.println(i);
    }
}
