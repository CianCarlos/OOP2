package PastExams;

import javax.swing.*;

public class CustomerDriver {
    public static void main(String[]args){
        String name;
        boolean online;
        double balance;
        Customer customer;

        int  numOfCustomers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Customers: "));

        Customer[] customers = new Customer[numOfCustomers];

        for(int i=0;i<numOfCustomers;i++){
            name = JOptionPane.showInputDialog("Enter name of Customer: ");
            balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance for Customer: "));
            online = Boolean.parseBoolean(JOptionPane.showInputDialog("Is customer Online: "));
            customer = new Customer(name, balance, online);
            customers[i] = customer;
        }

        JTextArea jta = new JTextArea("Number of Customers: " + Customer.getNumCustomers() + "\n\n");
        for(int i=0;i<numOfCustomers;i++){
            jta.append(customers[i].toString());
        }

        JOptionPane.showMessageDialog(null, jta);
    }
}
