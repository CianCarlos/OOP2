package Lab3;

import javax.swing.*;

/**
 * Created by t00190804 on 18/10/2017.
 */
public class BicycleDriver {
    public static void main(String[]args){
        Bicycle bike1 = new Bicycle();
        bike1.setOwnersName(JOptionPane.showInputDialog("Please enter owners name: "));
        bike1.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike:")));
        bike1.setMake(JOptionPane.showInputDialog("Please enter the make of the bike:"));
        bike1.setValue(bike1.getValue() + 10);

        Bicycle bike2 = new Bicycle();
        bike2.setOwnersName(JOptionPane.showInputDialog("Please enter owners name: "));
        bike2.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike:")));
        bike2.setMake(JOptionPane.showInputDialog("Please enter the make of the bike:"));
        bike2.setValue(bike2.getValue() + 10);
        JOptionPane.showMessageDialog(null, bike1.toString());
        JOptionPane.showMessageDialog(null, bike1.toString());
        JOptionPane.showMessageDialog(null, "Total value: " + (bike1.getValue()+bike2.getValue()));
    }
}
