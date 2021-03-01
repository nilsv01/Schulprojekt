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
	public void fitftyfifty(Frage aktuelleFrage){
	    int indexFalscheFrage1= (int)(Math.random()*3);
	    int indexFalscheFrage2= (int)(Math.random()*3);
	    while(indexFalscheFrage2==indexFalscheFrage1){
	      indexFalscheFrage2= (int)(Math.random()*3);
	    }
	    aktuelleFrage.setFalscheAntwortPos(indexFalscheFrage1,"");
	    aktuelleFrage.setFalscheAntwortPos(indexFalscheFrage2,"");
	  }
}
