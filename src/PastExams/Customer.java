package PastExams;

public class Customer {
    private String name;
    private double balance;
    private boolean online;
    private static int numCustomers;

    public Customer() {
        this("Unknown", 0.00, false);
    }

    public Customer(String name, double balance, boolean online) {
        this.name = name;
        this.balance = balance;
        this.online = online;
        numCustomers++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public static int getNumCustomers() {
        return numCustomers;
    }

    public static void setNumCustomers(int numCustomers) {
        Customer.numCustomers = numCustomers;
    }

    public String toString() {
        return "Name: " + getName() + "\nBalance: " + balance + "\nOnline: " + online + "\n\n";
    }
}
