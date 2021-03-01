package Controller;
import Model.*;
public class Controller {
	private static Controller instance;
	
	public static Controller getInstance() {
		if (Controller.instance == null) {
			Controller.instance = new Controller();			
		}
		return Controller.instance;
	}
	
	public Frage random(){
	    Frage akt;
	    int Fragenanzahl=ReadFromFile.readFragen("Fragenkatalog").size();
	    int zufallszahl =(int)(Math.random()*Fragenanzahl)+1;    
	    akt=ReadFromFile.readFragen("Fragenkatalog").get(zufallszahl);
	    akt.setStatus(true);
	    return akt;
	  }
}
