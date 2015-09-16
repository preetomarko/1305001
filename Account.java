/**
 * Created by USER on 9/14/2015.
 */
public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;
    public Account(Customer cust, int no, double b) {
        customer = cust;
        accountNumber = no;
        balance = b;
    }
    public Account(Customer cust, int no, String br){
        customer = cust;
        accountNumber = no;
        branch = br;
        balance=0.0;
    }

    public void setBalance(double b){
        balance = b;
    }
    public void setBranch(String branch){
        this.branch  = branch;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Customer getCustomer(){
        return customer;
    }

    public String getCustomerName(){
        return customer.getName();
    }
    public String getBranch(){
        return branch;
    }
    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
    public void print(){
        System.out.println("Customer: " + getCustomerName() +" Branch: " + branch + " A/C no: " + accountNumber + " Balance: " + balance);
    }
};

//Account::Account(Customer cust, int no, double b) : customer(cust), accountNumber(no), balance(b) { }

//Account::Account(Customer cust, int no, string br) : customer(cust), accountNumber(no), branch(br) { }





/*
        void Account::setBranch(string br) {
        branch  = br;
        }
        */




/*
        string Account::getCustomerName()  {
        return customer.getName();
        }
*/





