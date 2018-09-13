package Lab2;

import javax.swing.*;

/**
 * Created by CianC on 11/10/2017.
 */
public class Q7 {
    public static void main(String[]args)
    {
        String valueAsString;
        int value;

        valueAsString = JOptionPane.showInputDialog("Enter a number (-1 to exit): ");
        value = Integer.parseInt(valueAsString);

        while(value!=-1)
        {
            if(isEven(value)==true)
            {
                JOptionPane.showMessageDialog(null,"This number is even.","Is Even",JOptionPane.INFORMATION_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null,"This number is odd.","Is Even",JOptionPane.INFORMATION_MESSAGE);

            valueAsString = JOptionPane.showInputDialog("Enter a number(-1 to exit): ");
            value = Integer.parseInt(valueAsString);
        }
    }
    public static boolean isEven(int value)
    {
        if(value%2==0)
        {
            return true;
        } else
            return false;
    }
}
