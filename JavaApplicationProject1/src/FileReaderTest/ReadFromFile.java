/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderTest;
//import java.io.BufferedReader;
import java.io.*;

/**
 *
 * @author Sambit
 */
public class ReadFromFile {
    
    public ReadFromFile(String myFile)                                              // constructor
            throws FileNotFoundException, IOException{
                //BufferedReader br;
                
                BufferedReader br = new BufferedReader(new FileReader(myFile));    // Reads from a specified File 
                String line = "";
                
                while( (line = br.readLine()) !=null){
                    System.out.println("Reading line : "+line);
                }
                
    }
    
    public static void main(String args[]) 
            throws FileNotFoundException, IOException{
        
                new ReadFromFile("D:\\Sambit\\NetBeansProjects\\JavaApplications_Repository\\JavaApplicationProject1\\myTestFile2.txt");         // when the class is instantiated, it invokes the constructor
       
    }
            
    
}
