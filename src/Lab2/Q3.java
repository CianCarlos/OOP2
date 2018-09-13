package Lab2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by CianC on 04/10/2017.
 */
public class Q3 {
    public static void main(String[]args)
    {
        String name, lengthAsString, breadthAsString, costAsString;
        float length, breadth, cost, totalArea, totalCost;

        name = JOptionPane.showInputDialog("Enter your name: ");
        lengthAsString = JOptionPane.showInputDialog("Enter the room length: ");
        length = Float.parseFloat(lengthAsString);
        breadthAsString = JOptionPane.showInputDialog("Enter the room breadth: ");
        breadth = Float.parseFloat(breadthAsString);
        costAsString = JOptionPane.showInputDialog("Enter the cost per square metre: ");
        cost = Float.parseFloat(costAsString);

        JTextArea textArea = new JTextArea(20,20);

        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        totalArea = length * breadth;

        totalCost = totalArea * cost;

        JOptionPane.showMessageDialog(null,"Quotation for " + name + "\nLength of room: " + String.format("%.2f",length) + " m." +
                "\nBreadth of room: "+ String.format("%.2f",breadth) + " m." +
                "\nTotal area of the room: "+ String.format("%.2f",totalArea) + " sq m." +
                "\nCost per square metre of carpet: "+String.format("%.2f",cost)+ " euro." +
                "\nTotal cost of carpet: "+String.format("%.2f",totalCost) + " euro." ,"Room",JOptionPane.INFORMATION_MESSAGE);
    }
}