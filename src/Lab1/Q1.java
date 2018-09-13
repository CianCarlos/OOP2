package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 22/09/2017.
 */
public class Q1 {
    public static void main(String[]args)
        {
            String name, className, snacksAsString;
            int snacks;

            name = JOptionPane.showInputDialog("What is your name?");
            className = JOptionPane.showInputDialog("What is your class?");
            snacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");

            snacks = Integer.parseInt(snacksAsString);

            JOptionPane.showMessageDialog(null,"Name: " + name + "\nClass: " + className + "\nSnacks: " + snacks +
                    "\nCost: " + snacks*2,"Snacks",JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }
}