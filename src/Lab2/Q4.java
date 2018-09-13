package Lab2;

import javax.swing.*;

/**
 * Created by t00190804 on 06/10/2017.
 */
public class Q4 {
    public static void main(String[]args)
    {
        String fullName;
        String nameInCaps;
        String surname;
        char firstLetter;
        int letters;

        fullName= JOptionPane.showInputDialog("Enter your full name: ");

        letters = fullName.length();

        firstLetter = fullName.charAt(0);

        nameInCaps = fullName.toUpperCase();

        surname = fullName.substring(5);

        JOptionPane.showMessageDialog(null,"Full name: " + fullName +
                "\nNumber of letters: " + letters +
                "\nFirst name Initial: " + firstLetter +
                "\nName in Caps: " + nameInCaps +
                "\nSurname: " + surname);
    }
}
