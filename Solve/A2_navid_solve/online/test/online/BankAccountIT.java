/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class BankAccountIT {
    
    public BankAccountIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_interest method, of class BankAccount.
     */
//    @Test
//    public void testGet_interest() {
//        System.out.println("get_interest");
//        BankAccount instance = null;
//        double expResult = 0.0;
//        double result = instance.get_interest();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of get_current_balance method, of class BankAccount.
     */
//    @Test
//    public void testGet_current_balance() {
//        System.out.println("get_current_balance");
//        BankAccount instance = null;
//        int expResult = 0;
//        int result = instance.get_current_balance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test(expected=NullPointerException.class)
    public void testInvalidAccountType(){
        BankAccount b = new BankAccount(1,"Navid",8000,"Random");
        assertEquals("Looking for invalid type","Random", b.getAccount_type());
    }
    
    @Test(expected=NullPointerException.class)
    public void testInvalidBalance(){
        BankAccount b = new BankAccount(1,"Navid",-8000,"Savings");
        assertEquals("Looking for invalid type",-8000, b.getCurrent_balance());
    }
    
    @Test
    public void interestTest1(){
        BankAccount b = new BankAccount(1,"Navid",0,"Savings");
        assertEquals("Balance less than and equal 1000",0.005, b.get_interest(),0.0);
    }
    
    @Test
    public void interestTest2(){
        BankAccount b = new BankAccount(1,"Navid",1000,"Savings");
        assertEquals("Balance less than and equal 1000",0.005, b.get_interest(),0.0);
    }
    
    @Test
    public void interestTest3(){
        BankAccount b = new BankAccount(1,"Navid",1001,"Savings");
        assertEquals("Balance greater than 1000",0.0075, b.get_interest(),0.0);
    }
    
    @Test
    public void interestTest4(){
        BankAccount b = new BankAccount(1,"Navid",10000,"Savings");
        assertEquals("Balance greater than 1000",0.0075, b.get_interest(),0.0);
    }
    
    @Test
    public void interestTest5(){
        BankAccount b = new BankAccount(1,"Navid",10010,"Savings");
        assertEquals("Balance greater than 10000",0.001, b.get_interest(),0.0);
    }
    
    @Test(expected=NullPointerException.class)
    public void depositNegativeTest1(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount b = bh.create_account(1,"Navid",10010,"Savings");
        
        bh.deposit(b, -1);
    }
    
    @Test(expected=NullPointerException.class)
    public void withdrawNegativeTest1(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount b = bh.create_account(1,"Navid",10010,"Savings");
        
        bh.withdraw(b, -1);
    }
    
    @Test(expected=NullPointerException.class)
    public void withdrawOverflowTest1(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount b = bh.create_account(1,"Navid",10010,"Savings");
        
        bh.withdraw(b, 20000);
    }
    
    @Test(expected=NullPointerException.class)
    public void transferTest1(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount a = bh.create_account(1,"Navid",10010,"Savings");
        BankAccount b = bh.create_account(1,"Navid",20010,"Savings");
        
        bh.transfer(a,b, -1);
    }
    
    @Test(expected=NullPointerException.class)
    public void transferTest2(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount a = bh.create_account(1,"Navid",500,"Savings");
        BankAccount b = bh.create_account(1,"Navid",20010,"Savings");
        
        bh.transfer(a,b, 600);
    }
    
    @Test(expected=NullPointerException.class)
    public void transferTest3(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount a = bh.create_account(1,"Navid",20100,"Savings");
        BankAccount b = bh.create_account(1,"Navid",20010,"Savings");
        
        bh.transfer(a,b, 10050);
    }
    
    @Test
    public void totalMoneyTest(){
        BankAccountHandler bh = new BankAccountHandler();
        BankAccount a = bh.create_account(1,"Navid",20000,"Savings");
        BankAccount b = bh.create_account(1,"Navid",20000,"Savings");
        
        assertEquals(40000, bh.get_total());
    }
    
}
