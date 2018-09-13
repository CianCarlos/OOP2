package Lab4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CianC on 18/10/2017.
 */
public class BankAccountDriver {
    public static void main(String[]args){
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount("3245",300.00, new Person("Geraldine Corker"));

        List<BankAccount> bankList = new ArrayList<BankAccount>();
        String answer = JOptionPane.showInputDialog("Do you want to build a snowman?");
        while(!answer.equals("no")){
            bankList.add(new BankAccount(JOptionPane.showInputDialog("Enter account number: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Please enter balance: ")),
                    new Person(JOptionPane.showInputDialog("Please enter your name: "))));
            answer = JOptionPane.showInputDialog("Do you want to add another account?");
        }

        bank2.withdrawal(50.00);
        bank2.lodgement(100.00);

        JTextArea output = new JTextArea();
        output.setText("Bank Account Details\n");
        output.append("-----------------\n");
        output.append(bank1.toString() + "\n\n");
        output.append(bank2.toString() + "\n\n");
        output.append(bankList.toString() + "\n\n");

        JOptionPane.showMessageDialog(null, output);
    }
}
