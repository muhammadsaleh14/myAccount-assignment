package oop.assignment;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private final Date dateCreated;

    //constructor
    public Account(){dateCreated = new java.util.Date();}
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    //set methods
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //get methods
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double withdrawAmount){
        if (balance<withdrawAmount)
            System.out.println("NOT ENOUGH BALANCE!!");
        else {
            balance -= withdrawAmount;
        }
        System.out.println("Remaining balance: " + balance);
    }
    public void deposit(double depositAmount){
        balance +=depositAmount;
        System.out.println("Total balance: "+balance);
    }
}
