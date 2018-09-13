package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 29/09/2017.
 */
public class Q5 {
    public static void main(String[] args) {
        String letterAsString, num1AsString, num2AsString;
        char letter;
        float num1, num2;

        letterAsString = JOptionPane.showInputDialog("Enter a letter: \n\nA (Addition) \nS (Subtraction) \nM (Multiplication) \nD (Divide)\n");

        letter = letterAsString.charAt(0);

        num1AsString=JOptionPane.showInputDialog("Enter first number: ");
        num1=Float.parseFloat(num1AsString);

        num2AsString=JOptionPane.showInputDialog("Enter second number: ");
        num2=Float.parseFloat(num2AsString);

        switch (letter)
        {
            case 'A':
                JOptionPane.showMessageDialog(null,"Result: " + (num1+num2),"Addition",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'S':
                JOptionPane.showMessageDialog(null,"Result: " + (num1-num2),"Subtraction",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'M':
                JOptionPane.showMessageDialog(null,"Result: " + num1*num2,"Multiplication",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'D':
                JOptionPane.showMessageDialog(null,"Result: " + num1/num2,"Division",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}