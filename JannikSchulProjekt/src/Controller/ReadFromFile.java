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
    try {
      File myObj = new File(pFileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();

        retFragen.add(createFrage(data));
        
        //System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return retFragen;
  }

  private static Frage createFrage(String pLine){
    
    String[] geteilt = pLine.split(";");
    
    String[] falscheAntworten = Arrays.copyOfRange(geteilt, 1, 4);
    Frage retFrage = new Frage(geteilt[0],falscheAntworten,geteilt[4]);

    return retFrage;
  }
}
