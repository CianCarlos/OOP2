package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 26/09/2017.
 */
public class Q2 {
    public static void main(String[]args) {
        String firstName, initial, lastName, distanceAsString;
        int distance;
        float moneyDue;

        firstName = JOptionPane.showInputDialog("Enter your First Name: ");
        initial = JOptionPane.showInputDialog("Enter your Initial: ");
        lastName = JOptionPane.showInputDialog("Enter your Last Name: ");
        distanceAsString = JOptionPane.showInputDialog("Distance Cycled: ");
        distance = Integer.parseInt(distanceAsString);

        if(distance<=10)
            {
                moneyDue=distance*0.07f;
            }
        else
            moneyDue=(distance*0.07f) - ((distance-10)*0.10f);

        JOptionPane.showMessageDialog(null,"Cyclist: " + firstName + initial + lastName + "\nDistance: " + distance +
                "\nMoney Due: " + moneyDue,"Cycle", JOptionPane.INFORMATION_MESSAGE);
    }
}
