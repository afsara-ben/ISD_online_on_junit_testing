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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of getEmployees method, of class Manager.
     */
    @Test
    public void testGetEmployees() {
        System.out.println("getEmployees");
        Manager man=new Manager("X", 1000, 24,5,"Mangr");
        Manager mana=new Manager("Y", 1000, 24,5,"Mangr");
        Employee a = new Employee("A", 5000, 24,5);
        Employee b = new Employee("B", 5000, 24,5);
        Employee c = new Employee("C", 5000, 24,5);
        a.setManager(man);
        b.setManager(mana);
        c.setManager(man);
        Employee[] expResult = new Employee[1000];
        expResult[0]=a;
        expResult[1]=b;
        Employee[] result = man.getEmployees();
        assertArrayEquals(expResult, result);
        Employee[] expResulta = new Employee[1000];
        expResulta[0]=c;
        result = mana.getEmployees();
        assertArrayEquals(expResulta, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_increment method, of class Manager.
     */
    @Test
    public void testGet_increment() {
        
        
        Manager instance=new Manager("Y", 1000, 24,5,"Mangr");
        Employee a = new Employee("A", 5000, 24,5);
        Employee b = new Employee("B", 5000, 24,5);
        Employee c = new Employee("C", 5000, 24,5);
        System.out.println("get_increment");
        double expResult = 0.0;
        double result = instance.get_increment();
        
        
        //Manager instance = null;
        a.setManager(instance);
        b.setManager(instance);
        expResult=100.0;
        result=instance.get_incrementa();
        assertEquals(expResult, result, 0.001);
        c.setManager(instance);
        expResult=150.0;
        result=instance.get_incrementa();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
