package Lab2;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by CianC on 11/10/2017.
 */
public class Q8 {
    public static void main(String[]args)
    {
        String valueAsString;
        int value;
        int[] list = new int[10];

        valueAsString=JOptionPane.showInputDialog("Enter an Integer: ");
        value=Integer.parseInt(valueAsString);

        for(int i=0; i<9; i++)
        {
            list[i]+=value;

            valueAsString=JOptionPane.showInputDialog("Enter an Integer: ");
            value=Integer.parseInt(valueAsString);
        }

        JOptionPane.showMessageDialog(null,"The first value in the array is: " + list[0] +
                "\nThe fifth value in the array is: " + list[4],"Arrays",JOptionPane.INFORMATION_MESSAGE);
    }
}
