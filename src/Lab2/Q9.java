package Lab2;

import javax.swing.*;

/**
 * Created by CianC on 11/10/2017.
 */
public class Q9 {
    public static void main(String[]args)
    {
        double[] list = new double[5];
        double total=0, lightest=1000, value;
        String valueAsString;
        String allNumbers="";
        int under250=0, over400=0;

        valueAsString = JOptionPane.showInputDialog("Enter a weight: ");
        value = Double.parseDouble(valueAsString);

        for(int i=0;i<4;i++)
        {
            list[i]=value;

            allNumbers+=list[i] + ", ";

            if(list[i]<250)
            {
                under250++;
            }
            if(list[i]>400)
            {
                over400++;
            }
            if(list[i]<lightest)
            {
                lightest=list[i];
            }
            total+=list[i];

            valueAsString = JOptionPane.showInputDialog("Enter a weight: ");
            value = Double.parseDouble(valueAsString);
        }

        JOptionPane.showMessageDialog(null,"Weights: " + allNumbers + "\nNumbers under 250 kg: " + under250 +
        "\nPercentage over 400 kg: " + String.format("%.2d",over400/5) + "\nLightest animal: " + lightest + "\nAverage weight: " + total/5,"Arrays",JOptionPane.INFORMATION_MESSAGE);
    }
}
