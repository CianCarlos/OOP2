package Lab4;

/**
 * Created by CianC on 18/10/2017.
 */
public class BankAccount {
    private String accnum;
    private double balance;
    private Person person;

    public BankAccount() {
        this("0000", 0.0, null);
    }

    public BankAccount(String accnum, double balance, Person person) {
        this.accnum = accnum;
        this.balance = balance;
        this.person = person;
    }

    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void lodgement(double amount) {
        balance+= amount;
    }

    public void withdrawal(double amount){
        if(balance >= amount){
            balance-= amount;
        }
    }

    public String toString(){
        return "Account Number: " + getAccnum() + "\nBalance: €" + getBalance() + "\nAccount Holder: " +
            person;
    }
}
