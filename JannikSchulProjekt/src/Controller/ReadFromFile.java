package Controller;
import Model.Frage;

import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ReadFromFile{

	 public static ArrayList<Frage> readFragen(String pFileName){
		    ArrayList<Frage> retFragen = new ArrayList<Frage>();
		    System.out.println("1");
		    File file = new File(pFileName);
		    String fileName = file.getAbsolutePath();  
		   System.out.println(fileName);
		   
		    Scanner scanner;
			try {
				scanner = new Scanner(file);
				int i = 0;
				while (scanner.hasNext()) {
					String[] data = scanner.nextLine().split(";");
		            System.out.println(data);
		            String[] falscheAntworten = new String[3];
		            System.out.println(data[0]);
		            falscheAntworten[0] = data[1];
		            falscheAntworten[1] = data[2];
		            falscheAntworten[3] = data[3];
		         //*   falscheAntworten = Arrays.copyOfRange(geteilt, 1, 3);
		            System.out.println("a");
		            retFragen.add(new Frage(data[0],falscheAntworten,data[4]));
					
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			

		    
	/*	    try {
		    	System.out.println("2");
		    	File myObj  = new File("Fragenkatalog.txt");
		        Scanner myReader = new Scanner(myObj);
		        System.out.println("3");
		      
		        while (myReader.hasNextLine()) {
		            String data = myReader.nextLine();
		            System.out.println(data);
		        // Datei wird in Fragen Objekt umgewandelt
	//*	        retFragen.add(createFrage(data));
		        
		        //System.out.println(data);
		      }
		      
		      System.out.println("5");
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }*/
		    return retFragen;
		  } 

  private static Frage createFrage(String pLine){
    
    String[] geteilt = pLine.split(";",5);   
    String[] falscheAntworten = new String[3];
    System.out.println(geteilt[0]);
    falscheAntworten[0] = geteilt[1];
    falscheAntworten[1] = geteilt[2];
    falscheAntworten[3] = geteilt[3];
 //*   falscheAntworten = Arrays.copyOfRange(geteilt, 1, 3);
    System.out.println("a");
    Frage retFrage = new Frage(geteilt[0],falscheAntworten,geteilt[4]);

    return retFrage;
  }
}
