package Lab2;

import javax.swing.*;

/**
 * Created by CianC on 04/10/2017.
 */
public class Q2 {
    public static void main(String[]args)
    {
        int yards, inches;

        JTextArea textArea = new JTextArea(15,12);

        textArea.setText(String.format("%-10s%-10s\n","Yards","Inches"));

        for(yards=0;yards<=10;yards++)
        {
            inches = yards*36;

            textArea.append(String.format("%-10d%-10d\n",yards,inches));
        }

        JOptionPane.showMessageDialog(null,textArea,"Yards",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}