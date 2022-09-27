/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HappyOrSad;

/**
 *
 * @author bgnmh
 */
public class DeterminatieNieuw {

    static boolean wervelkolom, benigeLedematen, tempConst, huidBedektSchubben, huidBedektVeren;

    public static void main(String[] args) {
        wervelkolom = true;
        benigeLedematen = true;
        tempConst = true;
        huidBedektSchubben = false;
        huidBedektVeren = false;

        if (wervelkolom == true
                && benigeLedematen == true
                && tempConst == true
                && huidBedektSchubben == false) {
            System.out.println("Amfibie");
        }
        if (wervelkolom == true
                & benigeLedematen == true
                & tempConst == true
                & huidBedektSchubben == true) {
            System.out.println("Reptiel");
        }
        if (wervelkolom == true
                & benigeLedematen == true
                & tempConst == true
                & huidBedektVeren == true) {
            System.out.println("Zoogdier");
        }
        if (wervelkolom == true
                & benigeLedematen == true
                & tempConst == true
                & huidBedektVeren == false) {
            System.out.println("Vogel");
        }

    }
}
