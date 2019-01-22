/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class BankAccountHandler {
    
    public  BankAccount create_account(int account_number, String name, int current_balance, String account_type){
        BankAccount ba = new BankAccount(account_number, name, current_balance, account_type) ; 
        return  ba ; 
    }
    
    
    // Deposit this amounts in the BankAccount of A
    public  void deposit(BankAccount A, int amount){
        
    }
    
    
    // Deposit this amounts in the BankAccount of A. Handle necessary exceptions
    public  void withdraw(BankAccount A, int amount){
        
    }
    
    
    // Transfer this amount from A to B. Savings account can not Transfer more than 10000$.  Handle necessary exceptions
    public void transfer(BankAccount A, BankAccount B, int amount){
        
    }
    
    
    // Implement this, return the total amount of money in the banks. 
    public  int get_total(){
        return  0 ; 
    }
}
