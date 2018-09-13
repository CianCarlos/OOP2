package Lab3;

import javax.swing.*;

/**
 * Created by CianC on 18/10/2017.
 */
public class FractionDriver {
    public static void main(String[]args){
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction(15,25);

        JOptionPane.showMessageDialog(null,fraction1.toString());
        JOptionPane.showMessageDialog(null,fraction2.toString());
    }
}
