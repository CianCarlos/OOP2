package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 02/10/2017.
 */
public class Q6 {
    public static void main(String[] args) {
        String letterAsString, num1AsString, num2AsString;
        char letter;
        float num1, num2;
        int counter = 1;

        letterAsString = JOptionPane.showInputDialog(counter + ". Enter a letter: \n\nA (Addition) \nS (Subtraction) \nM (Multiplication) \nD (Divide)\n\nQ to Quit:\n\n");

        letter = letterAsString.charAt(0);

        while (!letterAsString.equals("Q")) {
            num1AsString = JOptionPane.showInputDialog(counter + ". Enter first number: ");
            num1 = Float.parseFloat(num1AsString);

            num2AsString = JOptionPane.showInputDialog(counter + ". Enter second number: ");
            num2 = Float.parseFloat(num2AsString);

            switch (letter) {
                case 'A':
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2), "Addition", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'S':
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2), "Subtraction", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'M':
                    JOptionPane.showMessageDialog(null, "Result: " + num1 * num2, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'D':
                    JOptionPane.showMessageDialog(null, "Result: " + num1 / num2, "Division", JOptionPane.INFORMATION_MESSAGE);
                    break;


            }letterAsString = JOptionPane.showInputDialog((counter+1) + ". Enter a letter: \n\nA (Addition) \nS (Subtraction) \nM (Multiplication) \nD (Divide)\n\nQ to Quit:\n\n");

            letter = letterAsString.charAt(0);

            counter++;
        }
    }
}
