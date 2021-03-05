package Controller;
import Model.Frage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;
import java.util.ArrayList;

public class ReadFromFile{

	 public static ArrayList<Frage> readFragen(String pFileName){
		    ArrayList<Frage> retFragen = new ArrayList<Frage>();
		    System.out.println("1");
		    
		    try {
		    	System.out.println("2");
		      Scanner myReader = new Scanner(new File("pFileName").getAbsolutePath());
		      System.out.println("3");
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println("4");
		        // Datei wird in Fragen Objekt umgewandelt
		        retFragen.add(createFrage(data));
		        
		        //System.out.println(data);
		      }
		      System.out.println("5");
		      myReader.close();
		    } catch (NullPointerException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    return retFragen;
		  }

  private static Frage createFrage(String pLine){
    
    String[] geteilt = pLine.split(";");   
    String[] falscheAntworten = Arrays.copyOfRange(geteilt, 1, 3);
    System.out.println("a");
    Frage retFrage = new Frage(geteilt[0],falscheAntworten,geteilt[4]);

    return retFrage;
  }
}
