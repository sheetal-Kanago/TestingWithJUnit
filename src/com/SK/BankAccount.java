package com.SK;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Bank Account: deposit: Only positive amounts are accepted.");
        }
    }

    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Bank Account: withdraw: Only positive amounts are accepted.");
        }else{
            balance-=amount;
        }

    }
}
