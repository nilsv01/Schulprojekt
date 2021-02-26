package Controller;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;  // Import the File class


public class WriteToFile {

  public static void writeFile(String pLine, String pFileName) {
    try {
      FileWriter myWriter;
      // Datei erstellen falls noetig
      if(createFileIfNessed(pFileName)){
        myWriter = new FileWriter(pFileName, true);
        //System.out.println("Old File write");
      }else{
        myWriter = new FileWriter(pFileName, false);
        //System.out.println("New File write");
      }

      
      myWriter.append(pLine+"\n");
      myWriter.close();
      // Zum Testen
      //System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      // Zum Testen
      //System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  // Testen, ob eine Datei existiert. Falls ja return true, falls nein erstelle
  // die Datei
  private static boolean createFileIfNessed(String pFileName){
    File myObj = new File(pFileName);
    try {
      
      if (myObj.createNewFile()) {
        //System.out.println("File created: " + myObj.getName());
        return false;
      } else {
        //System.out.println("File already exists.");
        return true;
      }
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      return false;
    }
  }
  


  public static void writeFile(String[] pLines, String pFileName) {
    try {
      FileWriter myWriter;
      // Datei erstellen falls noetig
      if(createFileIfNessed(pFileName)){
        myWriter = new FileWriter(pFileName, true);
        //System.out.println("Old File write");
      }else{
        myWriter = new FileWriter(pFileName, false);
        //System.out.println("New File write");
      }

      // Einmal für jedes Element im Array
      for(String pLine : pLines){
        myWriter.append(pLine+"\n");
      }
      myWriter.close();
      // Zum Testen
      //System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      // Zum Testen
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
