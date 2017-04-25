/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTestExample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sambit
 */
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of main method, of class Customer.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        //String[] args = null;
        //Customer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sayHello method, of class Customer.
     */
    @Test
    public void testSayHello() {
        System.out.println("Inside the test method");
        
        String customerName = "Sambit";                           // test data
        
        Customer cust = new Customer();
        String actualResult = cust.sayHello(customerName);       // Actual result for sayHello() method with above test data
        
        String expResult = "Hello Sambit";                       // Expected result for sayHello() method with above test data
        
        assertEquals(expResult, actualResult);                  // compare the expected result with the actual result --> if they are same, then the test is passed
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
