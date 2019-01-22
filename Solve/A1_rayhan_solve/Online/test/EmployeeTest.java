/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rayhan
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getName method, of class Employee.
     */


    /**
     * Test of getManagerName method, of class Employee.
     */
    @Test(expected = Exception.class)
    public void testGetManagerName() throws Exception {
        System.out.println("getManagerNameTest");
        Employee instance = new Employee("A", 5000, 24,5);
        Manager man=new Manager("X", 1000, 24,5,"Mangr");
        String expResult = "";
        String result = instance.getManagerName();
        assertEquals(expResult, result);
        instance.setManager(man);
        expResult="X";
        result = instance.getManagerName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of calculateYearlySalary method, of class Employee.
     */
    @Test
    public void testCalculateYearlySalary() {
        System.out.println("calculateYearlySalary");
        Employee instance=new Employee("A", -500, 24,5);
        double expResult = -1.0;
        double result = instance.calculateYearlySalary();
        assertEquals(expResult, result,0.001);
        instance.setsalary(600000.0/12);
        expResult=200000;
        result=instance.calculateYearlySalary();
        assertEquals(expResult, result,0.001);
        instance.setsalary(200001.0/12);
        expResult=200001.0 - (0.1*200001.0);
        result=instance.calculateYearlySalary();
        assertEquals(expResult, result,0.001);
        
        instance.setsalary(500000.0/12);
        expResult=500000.0 - (0.1*500000.0);
        result=instance.calculateYearlySalary();
        assertEquals(expResult, result,0.001);
        
        
        instance.setsalary(500001.0/12);
        expResult=500001.0 - (0.15*500001.0);
        result=instance.calculateYearlySalary();
        assertEquals(expResult, result,0.001);
        
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_increment method, of class Employee.
     */
    @Test
    public void testGet_increment() {
        System.out.println("get_increment");
        Employee instance=new Employee("A", 1000, 24,4);
        double expResult = 0.0;
        double result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
        instance.setserv(5);
        expResult = 0.0;
        result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
        instance.setserv(6);
        expResult = 100.0;
        result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
        instance.setserv(9);
        expResult = 50.0;
        result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
        instance.setserv(10);
        expResult = 50.0;
        result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
                instance.setserv(11);
        expResult = 100.0;
        result = instance.get_increment();
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
