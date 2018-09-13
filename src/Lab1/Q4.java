package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 26/09/2017.
 */
public class Q4 {
    public static void main(String[]args)
        {
            String numberAsString, output="";
            int i=1, total=0, number;

            numberAsString = JOptionPane.showInputDialog("Please enter number " + i);

            while(!numberAsString.equals("q"))
                {
                    number = Integer.parseInt(numberAsString);

                    total+=number;
                    i++;

                    numberAsString = JOptionPane.showInputDialog("Please enter number " + i);
                }

            JOptionPane.showMessageDialog(null, "Total: " + total +
                    "\nNumbers entered: " + (i-1),"Numbers",JOptionPane.INFORMATION_MESSAGE);
        }
}