/**
 *
 * @author Martijn
 */

import java.io.File;

public class FileInfo {

    private static File f = new File(".");

    public static void main(String[] args) {

        System.out.println("Path Seperator: " + f.separator);
        System.out.println("Path          : " + f.getPath());
        System.out.println("Lengte        : " + f.length());
        System.out.println("Path (absolute):" + f.getAbsolutePath());


    }
}
