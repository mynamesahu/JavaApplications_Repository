/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationTest;
import java.io.*;

/**
 *
 * @author Sambit
 */
public class DePersist {
    
    public static void main(String args[]) throws Exception{
        
        /* mystudent object will be retrieved(de-prsisted) from the byte stream read from the file "file1.txt" 
            using readObject() method */
        
        //FileInputStream = new FileInputStream("file1.txt");
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("D:/Sambit/NetBeansProjects/JavaApplications_Repository/JavaApplicationProject1/myTestFile.txt"));
        Student mystudent = (Student)objIn.readObject();
        
        System.out.println("Student ID="+mystudent.id);
        System.out.println("Student ID="+mystudent.name.toString());
        
        
        
    }
    
}
