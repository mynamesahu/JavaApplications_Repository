/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTestExample;

/**
 *
 * @author Sambit
 */
public class Customer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(this.sayHello());
        String msg = sayHello("Sambit");
    }

    

    
    public static String sayHello( String customerName)
    {
            return "Hello "+customerName;
    }
    
}
