/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializationTest;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Sambit
 */
public class Persist{
    
    public static void main(String args[])throws Exception{
    
        Student mystudent;
            mystudent= new Student(27,"Sattwik Sahu");
    
        //try{
            //FileOutputStream fileOut = new FileOutputStream("file1.txt");
            
            /* mystudent object is converted to a byte stream and then persisted to a file "file1.txt" 
            using writeObject() method */
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("D:/Sambit/NetBeansProjects/JavaApplicationProject1/myTestFile.txt")); 
            objOut.writeObject(mystudent);  
            objOut.flush();  
            
            System.out.println("success");
        /*}
        catch (IOException ioe)
        {
            System.out.println(ioe.toString());
        }*/
    
   }   
}
