/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderTest;
//import java.io.BufferedReader;
import java.io.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Sambit
 */
public class ReadFromFile {
    
    static String line = "";
    
    final static Logger logger = Logger.getLogger(ReadFromFile.class);
    
    public ReadFromFile(String myFile)                                              // constructor
            throws FileNotFoundException, IOException{
                //BufferedReader br;
                
                BufferedReader br = new BufferedReader(new FileReader(myFile));    // Reads from a specified File 
                
                
                while( (line = br.readLine()) !=null){
                    System.out.println("Reading line : "+line);
                    logger.info("Reading line from the File: "+line);
                }
                
    }
    
    public static void main(String args[]) 
            throws FileNotFoundException, IOException{
        
                PropertyConfigurator.configure("log4j.properties");
                
                try{
                    //new ReadFromFile("D:\\Sambit\\NetBeansProjects\\JavaApplications_Repository\\JavaApplicationProject1\\myTestFile2.txt");  // when the class is instantiated, it invokes the constructor
                    new ReadFromFile("D:/Sambit/NetBeansProjects/JavaApplications_Repository/JavaApplicationProject1/myTestFile2.txt");         // when the class is instantiated, it invokes the constructor
                }
                catch(Exception e){
                    logger.error("Error while Reading from the File"+e.getMessage());
                }
                
    }
            
    
}
