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
public class Doctor {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Customer cust = new Customer();
        String msg = cust.sayHello("Sambit");
        System.out.println(msg);
    }
    
}
