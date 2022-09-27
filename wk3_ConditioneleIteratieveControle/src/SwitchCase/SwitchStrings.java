package SwitchCase;

import javax.swing.*;

public class SwitchStrings
{
    public static void main(String[] args) {
        String course="java";
        course = JOptionPane.showInputDialog(null);
        System.out.println(course);
        switch(course)
        {
            case "python":
                System.out.println("Python was made by Guido Van Rossum");
                break;
            case "java":
                System.out.println("Java was made by James Gosling! It is one of Shraman's favourites!");
                break;
            case "c++":
                System.out.println("C ++ was made by Bjarne Stroustrup");
                break;
            default:
                System.out.println("Die programmeertaal ken ik niet");
        }
    }
}