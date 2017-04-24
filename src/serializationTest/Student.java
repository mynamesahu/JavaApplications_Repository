/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializationTest;

import java.io.Serializable;

/**
 *
 * @author Sambit
 * This is an java object which can be converted to byte stream 
 * and its state to be persisted over a network by writing to / reading from a file 
 * (by implementing Serializable interface)
 */
public class Student implements Serializable
{
    int id;
    String name;
    
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        
    }
    
}
