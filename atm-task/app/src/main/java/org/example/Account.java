package org.example;

public class Account {
    private String accountNo;
    private String ownerName;
    private double amount;
    private String accountType;

    Account(String accountNo, String ownerName, double amount, String accountType) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getAmount(){
        return amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(double value) {
        this.amount += value;
    }

    public boolean withdraw(double value) {
        if(value > this.amount) return false;

        this.amount -= value;
        return true;
    }

    @Override
    public String toString() { 
        return accountNo + "\t" + ownerName + "\t" + amount + "\t" + accountType;
    }

}
