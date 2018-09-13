package Lab2;

import javax.swing.*;

public class Q1 {
    public static void main(String[]args)
        {
            final float EXCHANGE=1.13f;
            String sumAsString;
            double pounds, euro = 0;
            int counter=1;

            sumAsString=JOptionPane.showInputDialog(counter + ". Please enter your sum: ");

            pounds=Double.parseDouble(sumAsString);

            while(pounds!=0)
            {
                euro=(pounds/EXCHANGE);

                counter++;

                JOptionPane.showMessageDialog(null,"Pound: " + String.format("%.2f",pounds) + "\nEuro: " + String.format("%.2f",euro),"Conversion",JOptionPane.INFORMATION_MESSAGE);

                sumAsString=JOptionPane.showInputDialog(counter + ". Please enter your sum: ");

                pounds=Double.parseDouble(sumAsString);
            }
            

            System.exit(0);
        }
}