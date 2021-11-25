package com.SK;

public class Main {

    public static void main(String[] args) {
//        System.out.println("In main");
        BankAccount myAccount = new BankAccount("SK", 1000);
        myAccount.deposit(100);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(200);
        System.out.println(myAccount.getBalance());

    }
}
