package Lab1;

import javax.swing.*;

/**
 * Created by CianC on 26/09/2017.
 */
public class Q3 {
    public static void main(String[]args)
        {
            String name, taxableIncomeAsString;
            float taxableIncome, taxRate, tax, afterTax;

            name = JOptionPane.showInputDialog("Enter your name: ");
            taxableIncomeAsString = JOptionPane.showInputDialog("Enter your taxable income: ");
            taxableIncome = Float.parseFloat(taxableIncomeAsString);

            if(taxableIncome<=20000){
                taxRate = 0;
                tax = taxableIncome * 0;
                afterTax = taxableIncome-tax;
            }
            else if(taxableIncome<=36000) {
                taxRate = 20;
                tax = taxableIncome * 0.20f;
                afterTax = taxableIncome - tax;
            }
            else {
                taxRate = 41;
                tax = taxableIncome * 0.41f;
                afterTax = taxableIncome - tax;
            }
            JOptionPane.showMessageDialog(null, "Gross Income: " + taxableIncome + "\nTax Rate: " + taxRate +
                "\nTax: " + tax + "\nIncome After Tax: " + afterTax, "Tax", JOptionPane.INFORMATION_MESSAGE);
        }
}