/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class BankAccount {
    private  int account_number ;
    private String name ; 
    private int current_balance ; 
    private String account_type ; // Current or Savings

    
    
    // Handle necessary exceptions exceptions for invalid cases like negative balance, wrong account type . 
    public BankAccount(int account_number, String name, int current_balance, String account_type) {
        this.account_number = account_number;
        this.name = name;
        this.current_balance = current_balance;
        this.account_type = account_type;
    }
    
    // Write getters and setters as necessary. 
    
    /* Implement this function. Handle necessary exceptions. 
    0.5% rate of interest is given if the balance in the account is in the range of $0 to $1000
    0.75% rate of interest is given if the balance in the account is in the range of $1000 to $10000
    1% rate of interest is given if the balance in the account is above $10000
    */
    public double get_interest(){
        return  0 ; 
    }
	
	// implement this, return the current balance of the account 
	public int get_current_balance(){
		return 0; 
	}
    
}
