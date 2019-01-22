/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

/**
 *
 * @author Asus
 */
public class BankAccountHandler {
    
    public int totalMoney;
    
    public BankAccountHandler(){
        totalMoney = 0;
    }
    
    public  BankAccount create_account(int account_number, String name, int current_balance, String account_type){
        BankAccount ba = new BankAccount(account_number, name, current_balance, account_type) ; 
        totalMoney += current_balance;
        return  ba ; 
    }
    
    
    // Deposit this amounts in the BankAccount of A
    public  void deposit(BankAccount A, int amount){
        if(amount < 0)
            throw new NullPointerException();
        
        A.setCurrent_balance(A.getCurrent_balance()+amount);
        this.totalMoney += amount;
    }
    
    
    // Deposit this amounts in the BankAccount of A. Handle necessary exceptions
    public  void withdraw(BankAccount A, int amount){
        
        if(amount<0 || A.get_current_balance()<amount)
            throw new NullPointerException();
        
        A.setCurrent_balance(A.get_current_balance()-amount);
        this.totalMoney -= amount;
    }
    
    
    // Transfer this amount from A to B. Savings account can not Transfer more than 10000$.  Handle necessary exceptions
    public void transfer(BankAccount A, BankAccount B, int amount){
        
        if(amount<0 || A.get_current_balance()<amount || (A.getAccount_type() =="Savings" && amount>10000))
            throw new NullPointerException();
        A.setCurrent_balance(A.get_current_balance() - amount);
        B.setCurrent_balance(B.get_current_balance()+ amount);
    }
    
    
    // Implement this, return the total amount of money in the banks. 
    public  int get_total(){
        return  this.totalMoney ; 
    }
}

